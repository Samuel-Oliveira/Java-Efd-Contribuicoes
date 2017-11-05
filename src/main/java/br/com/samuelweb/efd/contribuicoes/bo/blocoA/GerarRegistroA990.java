/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoA;

import br.com.samuelweb.efd.contribuicoes.registros.blocoA.RegistroA990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA990 {

	public static StringBuilder gerar(RegistroA990 registroA990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA990.getQtd_lin_a()));
		sb.append("|").append('\n');

		return sb;
	}
}
