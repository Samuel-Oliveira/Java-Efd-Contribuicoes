/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoD;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoD.BlocoD;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoD {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        BlocoD blocoD = efdContribuicoes.getBlocoD();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont;
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D001", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D010", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D100", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD101();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D101", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD105();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D105", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD111();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D111", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D200", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD201();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D201", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD205();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D205", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD209();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D209", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD300();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D300", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD309();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D309", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD350();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D350", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD359();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D359", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD500();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D500", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD501();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D501", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD505();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D505", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD509();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D509", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD600();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D600", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD601();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D601", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD605();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D605", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoD().getContRegistroD609();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("D609", cont));
        }

        // Qnt Registros RegistroD990
        if (!Util.isEmpty(blocoD.getRegistroD990())) {
            bloco9.getRegistro9900().add(New9900("D990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoD.getRegistroD990().getQtd_lin_d());
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
