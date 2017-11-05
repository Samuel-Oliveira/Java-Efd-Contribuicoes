/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC199;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC199 {

	public static StringBuilder gerar(RegistroC199 registroC199, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC199.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC199.getCod_doc_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC199.getNum_doc_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC199.getVl_pis_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC199.getVl_cofins_imp()));
		sb.append("|").append(Util.preencheRegistro(registroC199.getNum_acdraw()));
		sb.append("|").append('\n');

		return sb;
	}
}
