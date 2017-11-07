/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD010;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD010 {

	public static StringBuilder gerar(RegistroD010 registroD010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD010.getCnpj()));
		sb.append("|").append('\n');

		return sb;
	}
}
