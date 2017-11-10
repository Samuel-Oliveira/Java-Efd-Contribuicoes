/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM600;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM600 {

	public static StringBuilder gerar(RegistroM600 registroM600, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM600.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_tot_cont_nc_per()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_tot_cred_desc()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_tot_cred_desc_ant()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_tot_cont_nc_dev()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_ret_nc()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_out_ded_nc()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_cont_nc_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_tot_cont_cum_per()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_ret_cum()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_out_ded_cum()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_cont_cum_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM600.getVl_tot_cont_rec()));
		sb.append("|").append('\n');

		return sb;
	}
}
