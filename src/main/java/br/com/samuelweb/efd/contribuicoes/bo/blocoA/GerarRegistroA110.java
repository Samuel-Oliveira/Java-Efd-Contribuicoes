/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoA;

import br.com.samuelweb.efd.contribuicoes.registros.blocoA.RegistroA110;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA110 {

	public static StringBuilder gerar(RegistroA110 registroA110, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA110.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA110.getCod_inf()));
		sb.append("|").append(Util.preencheRegistro(registroA110.getTxt_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
