/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF010;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF010 {

	public static StringBuilder gerar(RegistroF010 registroF010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF010.getCnpj()));
		sb.append("|").append('\n');

		return sb;
	}
}
