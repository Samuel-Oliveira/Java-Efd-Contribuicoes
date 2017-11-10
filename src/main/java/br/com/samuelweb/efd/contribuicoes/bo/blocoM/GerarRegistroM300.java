/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM300;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM300 {

	public static StringBuilder gerar(RegistroM300 registroM300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getCod_cont()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getVl_cont_apur_difer()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getNat_cred_desc()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getVl_cred_desc_difer()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getVl_cont_difer_ant()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getPer_apur()));
		sb.append("|").append(Util.preencheRegistro(registroM300.getDt_receb()));
		sb.append("|").append('\n');

		return sb;
	}
}
