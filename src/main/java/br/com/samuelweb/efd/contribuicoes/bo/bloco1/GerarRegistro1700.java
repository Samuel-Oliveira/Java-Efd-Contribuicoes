/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1700;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1700 {

	public static StringBuilder gerar(Registro1700 registro1700, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1700.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getInd_nat_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getPr_rec_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getVl_ret_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getVl_ret_ded()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getVl_ret_per()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getVl_ret_dcomp()));
		sb.append("|").append(Util.preencheRegistro(registro1700.getSld_ret()));
		sb.append("|").append('\n');

		return sb;
	}
}
