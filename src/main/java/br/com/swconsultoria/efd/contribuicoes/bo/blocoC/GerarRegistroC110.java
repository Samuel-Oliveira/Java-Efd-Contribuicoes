/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC110;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC110 {

	public static StringBuilder gerar(RegistroC110 registroC110, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC110.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC110.getCod_inf()));
		sb.append("|").append(Util.preencheRegistro(registroC110.getTxt_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
