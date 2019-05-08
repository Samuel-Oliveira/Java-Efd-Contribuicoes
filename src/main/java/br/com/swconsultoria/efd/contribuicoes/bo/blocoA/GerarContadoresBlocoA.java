/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoA;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.BlocoA;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira, Sidnei Klein
 *
 */
public class GerarContadoresBlocoA {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        BlocoA blocoA = efdContribuicoes.getBlocoA();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont;
        cont = efdContribuicoes.getContadoresBlocoA().getContRegistroA001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("A001", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoA().getContRegistroA010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("A010", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoA().getContRegistroA100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("A100", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoA().getContRegistroA110();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("A110", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoA().getContRegistroA111();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("A111", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoA().getContRegistroA120();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("A120", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoA().getContRegistroA170();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("A170", cont));
        }
        // Qnt Registros RegistroA990
        if (!Util.isEmpty(blocoA.getRegistroA990())) {
            bloco9.getRegistro9900().add(New9900("A990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoA.getRegistroA990().getQtd_lin_a());
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
