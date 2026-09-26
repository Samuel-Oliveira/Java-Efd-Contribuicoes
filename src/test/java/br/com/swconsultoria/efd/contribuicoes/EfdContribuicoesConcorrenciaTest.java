package br.com.swconsultoria.efd.contribuicoes;

import br.com.swconsultoria.efd.contribuicoes.bo.GerarEfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * TC-06. Pipeline completo (GerarEfdContribuicoes.gerar) sob 2 threads.
 * Cobre o aliasing do campo static "sb" nos GerarBloco0/1/A/C/D/F/I/M/P
 * que o TC-05 (so o Bloco9) nao alcanca.
 *
 * Cada iteracao monta DOIS EfdContribuicoes novos (FixtureEfdContribuicoes.montar()),
 * nunca reusa a mesma instancia entre as duas threads - GerarBloco9.gerar
 * muta o Bloco9 recebido (adiciona 4 Registro9900 a cada chamada, ver
 * GerarBloco9), entao reusar o mesmo objeto duplicaria registros por
 * reuso, nao por corrida, e contaminaria o resultado do teste.
 */
public class EfdContribuicoesConcorrenciaTest {

    private static final int ITERACOES = 200;

    @Test
    void duasThreadsNaoMisturamTextoDosBlocos() throws InterruptedException, IOException {
        String golden = lerGolden().replace("\r\n", "\n");

        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Throwable> excecoes = new CopyOnWriteArrayList<>();
        int divergencias = 0;

        try {
            for (int i = 0; i < ITERACOES; i++) {
                CountDownLatch start = new CountDownLatch(1);
                CountDownLatch done = new CountDownLatch(2);

                EfdContribuicoes efdA = FixtureEfdContribuicoes.montar();
                EfdContribuicoes efdB = FixtureEfdContribuicoes.montar();
                StringBuilder sbA = new StringBuilder();
                StringBuilder sbB = new StringBuilder();

                executor.submit(tarefa(start, done, efdA, sbA, excecoes));
                executor.submit(tarefa(start, done, efdB, sbB, excecoes));

                start.countDown();
                boolean terminouNoPrazo = done.await(10, TimeUnit.SECONDS);
                assertTrue(terminouNoPrazo, "tarefas nao terminaram no prazo na iteracao " + i);

                if (!textoIgual(sbA, golden) || !textoIgual(sbB, golden)) {
                    divergencias++;
                }
            }
        } finally {
            executor.shutdownNow();
        }

        assertTrue(excecoes.isEmpty(),
                "nenhuma thread pode lancar excecao; encontradas: " + excecoes.size() + ", primeira: "
                        + (excecoes.isEmpty() ? "-" : excecoes.get(0)));
        assertEquals(0, divergencias, "texto divergente do golden em pelo menos uma thread");
    }

    private static Runnable tarefa(CountDownLatch start, CountDownLatch done, EfdContribuicoes efd, StringBuilder sb,
            List<Throwable> excecoes) {
        return () -> {
            try {
                start.await();
                GerarEfdContribuicoes.gerar(efd, sb);
            } catch (Throwable t) {
                excecoes.add(t);
            } finally {
                done.countDown();
            }
        };
    }

    private static boolean textoIgual(StringBuilder sb, String referenciaNormalizada) {
        try {
            return referenciaNormalizada.equals(sb.toString().replace("\r\n", "\n"));
        } catch (Throwable t) {
            return false;
        }
    }

    private static String lerGolden() throws IOException {
        try (InputStream is = EfdContribuicoesConcorrenciaTest.class.getResourceAsStream("/efd-contribuicoes.txt")) {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int lidos;
            while ((lidos = is.read(buffer)) != -1) {
                out.write(buffer, 0, lidos);
            }
            return new String(out.toByteArray(), StandardCharsets.UTF_8);
        }
    }
}
