/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoA;

import br.com.samuelweb.efd.contribuicoes.registros.blocoA.RegistroA010;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA010 {

	public static StringBuilder gerar(RegistroA010 registroA010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA010.getCnpj()));
		sb.append("|").append('\n');

		return sb;
	}
}
