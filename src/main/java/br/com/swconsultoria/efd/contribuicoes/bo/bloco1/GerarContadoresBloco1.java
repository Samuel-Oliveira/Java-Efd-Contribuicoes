/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Bloco1;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarContadoresBloco1 {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        Bloco1 bloco1 = efdContribuicoes.getBloco1();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont = 0;
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1001", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1010", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1020();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1020", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1050();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1050", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1100", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1101();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1101", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1102();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1102", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1200", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1210();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1210", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1220();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1220", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1300();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1300", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1500();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1500", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1501();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1501", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1502();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1502", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1600();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1600", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1610();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1610", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1620();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1620", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1700();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1700", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1800();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1800", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1809();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1809", cont));
        }
        cont = efdContribuicoes.getContadoresBloco1().getContRegistro1900();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("1900", cont));
        }
        // Qnt Registros Registro1990
        if (!Util.isEmpty(bloco1.getRegistro1990())) {
            bloco9.getRegistro9900().add(New9900("1990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(bloco1.getRegistro1990().getQtd_lin_1());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdContribuicoes.setBloco9(bloco9);

        return efdContribuicoes;
    }

    private static Registro9900 New9900(String Reg_blc, int Qtd_reg_blc) {
        Registro9900 vRet = new Registro9900();
        vRet.setReg_blc(Reg_blc);
        vRet.setQtd_reg_blc(String.valueOf(Qtd_reg_blc));
        return vRet;
    }
}
