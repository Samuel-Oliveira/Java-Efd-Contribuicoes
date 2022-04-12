package br.com.swconsultoria.efd.contribuicoes.bo.bloco9;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9900;
import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9990;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * 
 * @author Yuri Lemes
 *
 */
public class GerarBloco9 {

	private static int qtdRegistros = 0;
    private static StringBuilder sb = null;

	public static StringBuilder gerar(Bloco9 bloco9, StringBuilder sbr) {
		sb = sbr;
		qtdRegistros = 0;

		// REGISTRO9001
		if (!Util.isEmpty(bloco9.getRegistro9001())) {
			GerarRegistro9001.gerar(bloco9.getRegistro9001(), sb);
			qtdRegistros++;
		}

		Registro9900 registro9900 = new Registro9900();
		registro9900.setReg_blc("9001");
		registro9900.setQtd_reg_blc("1");
		bloco9.getRegistro9900().add(registro9900);

		registro9900 = new Registro9900();
		registro9900.setReg_blc("9990");
		registro9900.setQtd_reg_blc("1");
		bloco9.getRegistro9900().add(registro9900);

		registro9900 = new Registro9900();
		registro9900.setReg_blc("9999");
		registro9900.setQtd_reg_blc("1");
		bloco9.getRegistro9900().add(registro9900);

		registro9900 = new Registro9900();
		registro9900.setReg_blc("9900");
		registro9900.setQtd_reg_blc(String.valueOf(bloco9.getRegistro9900().size() + 1));
		bloco9.getRegistro9900().add(registro9900);

		// REGISTRO9900
		if (!Util.isEmpty(bloco9.getRegistro9900())) {
			bloco9.getRegistro9900().forEach(registro_9900 -> {
				GerarRegistro9900.gerar(registro_9900, sb);
				qtdRegistros += 1;
			});
		}

		// REGISTRO0990
		if (qtdRegistros > 0) {
			qtdRegistros++;
			Registro9990 registro9990 = new Registro9990();
			registro9990.setQtd_lin_9(String.valueOf(qtdRegistros + 1));

			bloco9.setRegistro9990(registro9990);
			GerarRegistro9990.gerar(bloco9.getRegistro9990(), sb);
		}

		// REGISTRO9999
		if (!Util.isEmpty(bloco9.getRegistro9999())) {
			int somatorio = Integer.parseInt(bloco9.getRegistro9999().getQtd_lin())
					+ Integer.parseInt(bloco9.getRegistro9990().getQtd_lin_9());
			bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));
			GerarRegistro9999.gerar(bloco9.getRegistro9999(), sb);
		}

		return sb;

	}
}
