/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.BlocoM;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoM {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        BlocoM blocoM = efdContribuicoes.getBlocoM();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont;
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M001", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M100", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM105();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M105", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM110();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M110", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM115();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M115", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M200", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM205();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M205", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM210();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M210", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM211();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M211", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM215();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M215", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM220();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M220", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM225();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M225", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM230();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M230", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM300();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M300", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM350();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M350", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM400();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M400", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM410();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M410", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM500();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M500", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM505();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M505", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM510();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M510", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM515();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M515", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM600();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M600", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM605();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M605", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM610();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M610", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM611();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M611", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM615();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M615", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM620();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M620", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM625();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M625", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM630();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M630", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM700();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M700", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM800();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M800", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoM().getContRegistroM810();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("M810", cont));
        }

        // Qnt Registros RegistroM990
        if (!Util.isEmpty(blocoM.getRegistroM990())) {
            bloco9.getRegistro9900().add(New9900("M990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoM.getRegistroM990().getQtd_lin_m());
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
