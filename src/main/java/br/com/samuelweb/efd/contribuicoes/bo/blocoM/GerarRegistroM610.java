/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM610;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM610 {

	public static StringBuilder gerar(RegistroM610 registroM610, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM610.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getCod_cont()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_rec_brt()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_bc_cont()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_cont_apur()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_ajus_acres()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_ajus_reduc()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_cont_difer()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_cont_difer_ant()));
		sb.append("|").append(Util.preencheRegistro(registroM610.getVl_cont_per()));
		sb.append("|").append('\n');

		return sb;
	}
}
