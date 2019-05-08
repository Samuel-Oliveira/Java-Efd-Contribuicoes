/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM700;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM700 {

	public static StringBuilder gerar(RegistroM700 registroM700, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM700.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM700.getCod_cont()));
		sb.append("|").append(Util.preencheRegistro(registroM700.getVl_cont_apur_difer()));
		sb.append("|").append(Util.preencheRegistro(registroM700.getNat_cred_desc()));
		sb.append("|").append(Util.preencheRegistro(registroM700.getVl_cred_desc_difer()));
		sb.append("|").append(Util.preencheRegistro(registroM700.getVl_cont_difer_ant()));
		sb.append("|").append(Util.preencheRegistro(registroM700.getPer_apur()));
		sb.append("|").append(Util.preencheRegistro(registroM700.getDt_receb()));
		sb.append("|").append('\n');

		return sb;
	}
}
