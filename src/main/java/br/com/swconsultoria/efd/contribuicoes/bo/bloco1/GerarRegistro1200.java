/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1200;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1200 {

	public static StringBuilder gerar(Registro1200 registro1200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getPer_apur_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getNat_cont_rec()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getVl_cont_apur()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getVl_cred_pis_desc()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getVl_cont_dev()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getVl_out_ded()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getVl_cont_ext()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getVl_mul()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getVl_jur()));
		sb.append("|").append(Util.preencheRegistro(registro1200.getDt_recol()));
		sb.append("|").append('\n');

		return sb;
	}
}
