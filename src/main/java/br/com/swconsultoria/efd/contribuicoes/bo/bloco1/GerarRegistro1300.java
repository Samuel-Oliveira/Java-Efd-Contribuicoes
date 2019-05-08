/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1300;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1300 {

	public static StringBuilder gerar(Registro1300 registro1300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1300.getInd_nat_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1300.getPr_rec_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1300.getVl_ret_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1300.getVl_ret_ded()));
		sb.append("|").append(Util.preencheRegistro(registro1300.getVl_ret_per()));
		sb.append("|").append(Util.preencheRegistro(registro1300.getVl_ret_dcomp()));
		sb.append("|").append(Util.preencheRegistro(registro1300.getSld_ret()));
		sb.append("|").append('\n');

		return sb;
	}
}
