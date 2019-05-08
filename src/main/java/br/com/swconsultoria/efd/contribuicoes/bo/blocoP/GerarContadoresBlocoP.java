/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoP;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoP.BlocoP;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoP {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        BlocoP blocoP = efdContribuicoes.getBlocoP();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont;
        cont = efdContribuicoes.getContadoresBlocoP().getContRegistroP001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("P001", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoP().getContRegistroP010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("P010", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoP().getContRegistroP100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("P100", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoP().getContRegistroP110();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("P110", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoP().getContRegistroP199();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("P199", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoP().getContRegistroP200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("P200", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoP().getContRegistroP210();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("P210", cont));
        }

        // Qnt Registros RegistroP990
        if (!Util.isEmpty(blocoP.getRegistroP990())) {
            bloco9.getRegistro9900().add(New9900("P990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoP.getRegistroP990().getQtd_lin_p());
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
