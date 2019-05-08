/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.BlocoF;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoF {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        BlocoF blocoF = efdContribuicoes.getBlocoF();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont;
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F001", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F010", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F100", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF111();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F111", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF120();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F120", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF129();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F129", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF130();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F130", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF139();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F139", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF150();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F150", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F200", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF205();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F205", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF210();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F210", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF211();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F211", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF500();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F500", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF509();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F509", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF510();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F510", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF519();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F519", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF525();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F525", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF550();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F550", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF560();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F560", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF569();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F569", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF600();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F600", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF700();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F700", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoF().getContRegistroF800();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("F800", cont));
        }

        // Qnt Registros RegistroF990
        if (!Util.isEmpty(blocoF.getRegistroF990())) {
            bloco9.getRegistro9900().add(New9900("F990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoF.getRegistroF990().getQtd_lin_f());
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
