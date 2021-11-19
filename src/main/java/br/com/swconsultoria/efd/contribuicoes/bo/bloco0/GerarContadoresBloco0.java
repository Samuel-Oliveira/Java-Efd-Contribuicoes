/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Bloco0;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9999;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBloco0 {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        Bloco0 bloco0 = efdContribuicoes.getBloco0();
        Bloco9 bloco9 = new Bloco9();
        Registro9999 registro9999 = new Registro9999();
        registro9999.setQtd_lin("0");
        bloco9.setRegistro9999(registro9999);
        Registro9900 registro9900;

        // Qnt Registros Registro0000
        int cont = efdContribuicoes.getContadoresBloco0().getContRegistro0000();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0000");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0001
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0001();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0001");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0035
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0035();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0035");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0100
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0100();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0100");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0110
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0110();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0110");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0111
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0111();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0111");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0120
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0120();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0120");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0140
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0140();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0140");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0145
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0145();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0145");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0150
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0150();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0150");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }
        // Qnt Registros Registro0190
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0190();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0190");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);
        }

        // Qnt Registros Registro0200
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0200();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0200");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Quantidade de Registros 0205
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0205();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0205");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Quantidade de Registros 0206
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0206();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0206");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Quantidade de Registros 0208
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0208();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0208");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0400
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0400();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0400");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0450
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0450();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0450");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0500
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0500();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0500");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0600
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0600();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0600");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }
        // Qnt Registros Registro0900
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0900();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0900");
            registro9900.setQtd_reg_blc(String.valueOf(cont));
            bloco9.getRegistro9900().add(registro9900);

        }

        // Qnt Registros Registro0990
        cont = efdContribuicoes.getContadoresBloco0().getContRegistro0990();
        if (cont > 0) {
            registro9900 = new Registro9900();
            registro9900.setReg_blc("0990");
            registro9900.setQtd_reg_blc("1");
            bloco9.getRegistro9900().add(registro9900);

        }

        int somatorio = Integer.parseInt(bloco9.getRegistro9999().getQtd_lin()) + Integer.parseInt(bloco0.getRegistro0990().getQtd_lin_0());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        efdContribuicoes.setBloco9(bloco9);
        return efdContribuicoes;
    }
}
