/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM110;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM110 {

	public static StringBuilder gerar(RegistroM110 registroM110, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM110.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM110.getInd_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM110.getVl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM110.getCod_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM110.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroM110.getDescr_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM110.getDt_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
