/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC380;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC380 {

	public static StringBuilder gerar(RegistroC380 registroC380, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC380.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC380.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC380.getDt_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC380.getDt_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC380.getNum_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC380.getNum_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC380.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC380.getVl_doc_canc()));
		sb.append("|").append('\n');

		return sb;
	}
}
