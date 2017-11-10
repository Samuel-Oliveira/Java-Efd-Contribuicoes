/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM220;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM220 {

	public static StringBuilder gerar(RegistroM220 registroM220, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM220.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM220.getInd_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM220.getVl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM220.getCod_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM220.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroM220.getDescr_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM220.getDt_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
