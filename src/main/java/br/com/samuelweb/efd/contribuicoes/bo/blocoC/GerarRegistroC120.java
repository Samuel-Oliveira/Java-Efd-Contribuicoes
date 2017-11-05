/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC120;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC120 {

	public static StringBuilder gerar(RegistroC120 registroC120, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC120.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC120.getCod_doc_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC120.getNum_doc_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC120.getPis_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC120.getCofins_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC120.getNum_acdraw()));
		sb.append("|").append('\n');

		return sb;
	}
}
