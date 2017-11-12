/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoP;

import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP200;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP200 {

	public static StringBuilder gerar(RegistroP200 registroP200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getPer_ref()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getVl_tot_cont_apu()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getVl_tot_aj_reduc()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getVl_tot_aj_acres()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getVl_tot_cont_dev()));
		sb.append("|").append(Util.preencheRegistro(registroP200.getCod_rec()));
		sb.append("|").append('\n');

		return sb;
	}
}
