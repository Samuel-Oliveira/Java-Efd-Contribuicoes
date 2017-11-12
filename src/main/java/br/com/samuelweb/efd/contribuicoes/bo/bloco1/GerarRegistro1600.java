/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1600;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1600 {

	public static StringBuilder gerar(Registro1600 registro1600, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1600.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getPer_apur_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getNat_cont_rec()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getVl_cont_apur()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getVl_cred_cofins_desc()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getVl_cont_dev()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getVl_out_ded()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getVl_cont_ext()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getVl_mul()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getVl_jur()));
		sb.append("|").append(Util.preencheRegistro(registro1600.getDt_recol()));
		sb.append("|").append('\n');

		return sb;
	}
}
