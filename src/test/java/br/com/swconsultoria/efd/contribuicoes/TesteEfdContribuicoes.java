package br.com.swconsultoria.efd.contribuicoes;

import br.com.swconsultoria.efd.contribuicoes.bo.GerarEfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * TC-04. Regressao byte a byte: a saida da geracao sequencial tem de
 * continuar identica ao golden capturado a partir do artefato publicado
 * 1.32.1 (ver src/test/resources/efd-contribuicoes.txt e o comentario
 * em FixtureEfdContribuicoes). O refactor que remove o estado static
 * das classes GerarBloco* nao pode mudar um byte desta saida.
 */
public class TesteEfdContribuicoes {

    @Test
    void testaBlocos() throws IOException {
        EfdContribuicoes efd = FixtureEfdContribuicoes.montar();

        StringBuilder sb = new StringBuilder();
        GerarEfdContribuicoes.gerar(efd, sb);

        String golden;
        try (InputStream is = getClass().getResourceAsStream("/efd-contribuicoes.txt")) {
            golden = new String(readAll(is), StandardCharsets.UTF_8);
        }

        String saidaNormalizada = sb.toString().replace("\r\n", "\n");
        String goldenNormalizado = golden.replace("\r\n", "\n");

        assertEquals(goldenNormalizado, saidaNormalizada);
    }

    private static byte[] readAll(InputStream is) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int lidos;
        while ((lidos = is.read(buffer)) != -1) {
            out.write(buffer, 0, lidos);
        }
        return out.toByteArray();
    }
}
