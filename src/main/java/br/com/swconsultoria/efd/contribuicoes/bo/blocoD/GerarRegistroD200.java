/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoD;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoD.RegistroD200;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD200 {

	public static StringBuilder gerar(RegistroD200 registroD200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getCod_sit()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getNum_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getNum_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getDt_ref()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD200.getVl_desc()));
		sb.append("|").append('\n');

		return sb;
	}
}
