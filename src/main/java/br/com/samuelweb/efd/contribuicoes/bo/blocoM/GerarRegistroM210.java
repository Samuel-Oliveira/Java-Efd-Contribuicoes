/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM210;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM210 {

	public static StringBuilder gerar(RegistroM210 registroM210, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM210.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getCod_cont()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_rec_brt()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_bc_cont()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_cont_apur()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_ajus_acres()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_ajus_reduc()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_cont_difer()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_cont_difer_ant()));
		sb.append("|").append(Util.preencheRegistro(registroM210.getVl_cont_per()));
		sb.append("|").append('\n');

		return sb;
	}
}
