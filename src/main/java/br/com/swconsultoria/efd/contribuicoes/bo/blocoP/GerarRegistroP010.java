/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoP;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoP.RegistroP010;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP010 {

	public static StringBuilder gerar(RegistroP010 registroP010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP010.getCnpj()));
		sb.append("|").append('\n');

		return sb;
	}
}
