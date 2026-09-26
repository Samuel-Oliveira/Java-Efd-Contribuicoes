package br.com.swconsultoria.efd.contribuicoes;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Bloco0;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0000;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Bloco1;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1001;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.BlocoA;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.RegistroA001;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.BlocoC;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC001;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.BlocoF;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF001;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.BlocoM;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM001;

/**
 * Fixture minimo, porem nao trivial, cobrindo os blocos 0, A, C, F, M e 1.
 * Cada bloco (exceto o 0) tem apenas o registro de abertura preenchido -
 * o proprio Gerar* fecha o bloco (registro 990) sozinho, contando os
 * registros gerados. O Bloco9 nao e semeado aqui: quem o cria e
 * GerarContadoresBloco0.gerar, chamado por GerarEfdContribuicoes.
 */
public class FixtureEfdContribuicoes {

    public static EfdContribuicoes montar() {
        EfdContribuicoes efd = new EfdContribuicoes();

        Bloco0 bloco0 = new Bloco0();
        Registro0000 registro0000 = new Registro0000();
        registro0000.setDt_ini("01012019");
        registro0000.setDt_fin("31012019");
        registro0000.setNome("EMPRESA TESTE LTDA");
        registro0000.setCnpj("12345678000199");
        registro0000.setUf("SP");
        registro0000.setCod_mun("3550308");
        registro0000.setInd_nat_pj("00");
        registro0000.setInd_ativ("0");
        bloco0.setRegistro0000(registro0000);
        efd.setBloco0(bloco0);

        BlocoA blocoA = new BlocoA();
        RegistroA001 registroA001 = new RegistroA001();
        registroA001.setInd_mov("0");
        blocoA.setRegistroA001(registroA001);
        efd.setBlocoA(blocoA);

        BlocoC blocoC = new BlocoC();
        RegistroC001 registroC001 = new RegistroC001();
        registroC001.setInd_mov("0");
        blocoC.setRegistroC001(registroC001);
        efd.setBlocoC(blocoC);

        BlocoF blocoF = new BlocoF();
        RegistroF001 registroF001 = new RegistroF001();
        registroF001.setInd_mov("0");
        blocoF.setRegistroF001(registroF001);
        efd.setBlocoF(blocoF);

        BlocoM blocoM = new BlocoM();
        RegistroM001 registroM001 = new RegistroM001();
        registroM001.setInd_mov("0");
        blocoM.setRegistroM001(registroM001);
        efd.setBlocoM(blocoM);

        Bloco1 bloco1 = new Bloco1();
        Registro1001 registro1001 = new Registro1001();
        registro1001.setInd_mov("0");
        bloco1.setRegistro1001(registro1001);
        efd.setBloco1(bloco1);

        return efd;
    }
}
