package br.com.swconsultoria.efd.contribuicoes;

import br.com.swconsultoria.efd.contribuicoes.bo.bloco9.GerarBloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9001;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TC-05. Prova de que duas threads gerando o Bloco9 ao mesmo tempo, cada
 * uma com seu proprio Bloco9/StringBuilder, nao trocam o qtd_lin_9 nem o
 * texto entre si.
 *
 * Antes do refactor (campo static): medido em sessao de auditoria, 2
 * threads x 5.000 iteracoes, qtd_lin_9 divergente em 438/10.000 e texto
 * divergente em 545/10.000 - o StringBuilder compartilhado chega a
 * lancar StringIndexOutOfBoundsException em toString(). Depois do
 * refactor (campo local): 0/10.000 nas mesmas condicoes.
 *
 * O fixture minimo (Registro9001 com ind_mov="0", nada mais) e
 * deliberado: sem ele o GerarBloco9 nao teria nada para contar, e com
 * ele a saida sequencial e determinística - 6 linhas, qtd_lin_9 == "7".
 */
public class GerarBloco9ConcorrenciaTest {

    private static final int ITERACOES = 2000;

    @Test
    void duasThreadsNaoTrocamQtdLin9NemTexto() throws InterruptedException {

        Bloco9 referencia = novoBloco9();
        StringBuilder sbReferencia = new StringBuilder();
        GerarBloco9.gerar(referencia, sbReferencia);
        String textoReferencia = sbReferencia.toString();
        String qtdLin9Referencia = referencia.getRegistro9990().getQtd_lin_9();
        assertEquals("7", qtdLin9Referencia, "premissa do fixture mudou - conferir novoBloco9()");

        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Throwable> excecoes = new CopyOnWriteArrayList<>();
        int divergenciasQtdLin9 = 0;
        int divergenciasTexto = 0;

        try {
            for (int i = 0; i < ITERACOES; i++) {
                CountDownLatch start = new CountDownLatch(1);
                CountDownLatch done = new CountDownLatch(2);

                Bloco9 bloco9A = novoBloco9();
                Bloco9 bloco9B = novoBloco9();
                StringBuilder sbA = new StringBuilder();
                StringBuilder sbB = new StringBuilder();

                executor.submit(tarefa(start, done, bloco9A, sbA, excecoes));
                executor.submit(tarefa(start, done, bloco9B, sbB, excecoes));

                start.countDown();
                boolean terminouNoPrazo = done.await(10, TimeUnit.SECONDS);
                assertTrue(terminouNoPrazo, "tarefas nao terminaram no prazo na iteracao " + i);

                if (!qtdLin9Igual(bloco9A, qtdLin9Referencia) || !qtdLin9Igual(bloco9B, qtdLin9Referencia)) {
                    divergenciasQtdLin9++;
                }
                if (!textoIgual(sbA, textoReferencia) || !textoIgual(sbB, textoReferencia)) {
                    divergenciasTexto++;
                }
            }
        } finally {
            executor.shutdownNow();
        }

        assertTrue(excecoes.isEmpty(),
                "nenhuma thread pode lancar excecao (ex.: StringIndexOutOfBoundsException do StringBuilder "
                        + "compartilhado); encontradas: " + excecoes.size() + ", primeira: "
                        + (excecoes.isEmpty() ? "-" : excecoes.get(0)));
        assertEquals(0, divergenciasQtdLin9, "qtd_lin_9 divergente da referencia sequencial em pelo menos uma thread");
        assertEquals(0, divergenciasTexto, "texto divergente da referencia sequencial em pelo menos uma thread");
    }

    private static Runnable tarefa(CountDownLatch start, CountDownLatch done, Bloco9 bloco9, StringBuilder sb,
            List<Throwable> excecoes) {
        return () -> {
            try {
                start.await();
                GerarBloco9.gerar(bloco9, sb);
            } catch (Throwable t) {
                excecoes.add(t);
            } finally {
                done.countDown();
            }
        };
    }

    private static boolean qtdLin9Igual(Bloco9 bloco9, String referencia) {
        try {
            return referencia.equals(bloco9.getRegistro9990().getQtd_lin_9());
        } catch (Throwable t) {
            return false;
        }
    }

    private static boolean textoIgual(StringBuilder sb, String referencia) {
        try {
            return referencia.equals(sb.toString());
        } catch (Throwable t) {
            return false;
        }
    }

    private static Bloco9 novoBloco9() {
        Bloco9 b = new Bloco9();
        Registro9001 r = new Registro9001();
        r.setInd_mov("0");
        b.setRegistro9001(r);
        return b;
    }
}
