/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1800;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1800 {

	public static StringBuilder gerar(Registro1800 registro1800, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1800.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getInc_imob()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getRec_receb_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getRec_fin_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getBc_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getAliq_ret()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getVl_rec_uni()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getDt_rec_uni()));
		sb.append("|").append(Util.preencheRegistro(registro1800.getCod_rec()));
		sb.append("|").append('\n');

		return sb;
	}
}
