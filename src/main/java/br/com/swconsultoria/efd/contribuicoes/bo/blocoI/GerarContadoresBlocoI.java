/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoI;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoI.BlocoI;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoI {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        BlocoI blocoI = efdContribuicoes.getBlocoI();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont;
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I001", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I010", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I100", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI199();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I199", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I200", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI299();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I299", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI300();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I300", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoI().getContRegistroI399();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I399", cont));
        }

        // Qnt Registros RegistroI990
        if (!Util.isEmpty(blocoI.getRegistroI990())) {
            bloco9.getRegistro9900().add(New9900("I990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoI.getRegistroI990().getQtd_lin_i());
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
