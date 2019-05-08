/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC400;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC400 {

	public static StringBuilder gerar(RegistroC400 registroC400, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC400.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC400.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC400.getEcf_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC400.getEcf_fab()));
		sb.append("|").append(Util.preencheRegistro(registroC400.getEcf_cx()));
		sb.append("|").append('\n');

		return sb;
	}
}
