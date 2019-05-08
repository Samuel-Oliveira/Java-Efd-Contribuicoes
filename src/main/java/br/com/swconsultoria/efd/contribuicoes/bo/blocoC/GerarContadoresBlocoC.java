/**
 *
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.EfdContribuicoes;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.BlocoC;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Samuel Oliveira
 *
 */
public class GerarContadoresBlocoC {

    public static EfdContribuicoes gerar(EfdContribuicoes efdContribuicoes) {

        BlocoC blocoC = efdContribuicoes.getBlocoC();
        Bloco9 bloco9 = efdContribuicoes.getBloco9();

        int cont;
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C001", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C010", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C100", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC110();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C110", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC111();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C111", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC120();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C120", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC170();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C170", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC175();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C175", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC180();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C180", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC181();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C181", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC185();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C185", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC188();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C188", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC190();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C190", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC191();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C191", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC195();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C195", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC198();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C198", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC199();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C199", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC380();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C380", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC381();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C381", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC385();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C385", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC395();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C395", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC396();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C396", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC400();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C400", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC405();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C405", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC481();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C481", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC485();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C485", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC489();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C489", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC490();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C490", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC491();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C491", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC495();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C495", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC499();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C499", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC500();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C500", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC501();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C501", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC505();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C505", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC509();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C509", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC600();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C600", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC601();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C601", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC605();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C605", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC609();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C609", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC800();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C800", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC810();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C810", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC820();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C820", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC830();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C830", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC860();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C860", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC870();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C870", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC880();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C880", cont));
        }
        cont = efdContribuicoes.getContadoresBlocoC().getContRegistroC890();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("C890", cont));
        }

        // Qnt Registros RegistroC990
        if (!Util.isEmpty(blocoC.getRegistroC990())) {
            bloco9.getRegistro9900().add(New9900("C990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoC.getRegistroC990().getQtd_lin_c());
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
