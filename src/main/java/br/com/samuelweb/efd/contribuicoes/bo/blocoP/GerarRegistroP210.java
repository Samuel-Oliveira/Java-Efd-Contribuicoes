/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoP;

import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP210;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP210 {

	public static StringBuilder gerar(RegistroP210 registroP210, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP210.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP210.getInd_aj()));
		sb.append("|").append(Util.preencheRegistro(registroP210.getVl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroP210.getCod_aj()));
		sb.append("|").append(Util.preencheRegistro(registroP210.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroP210.getDescr_aj()));
		sb.append("|").append(Util.preencheRegistro(registroP210.getDt_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
