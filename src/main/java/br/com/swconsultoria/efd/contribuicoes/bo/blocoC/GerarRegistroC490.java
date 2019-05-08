/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC490;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC490 {

	public static StringBuilder gerar(RegistroC490 registroC490, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC490.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC490.getDt_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC490.getDt_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC490.getCod_mod()));
		sb.append("|").append('\n');

		return sb;
	}
}
