/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoP;

import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP100;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP100 {

	public static StringBuilder gerar(RegistroP100 registroP100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVl_rec_tot_est()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getCod_ativ_econ()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVl_rec_ativ_estab()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVl_exc()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVl_bc_cont()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getAliq_cont_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getVl_cont_apu()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroP100.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
