/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoP;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoP.RegistroP990;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP990 {

	public static StringBuilder gerar(RegistroP990 registroP990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP990.getQtd_lin_p()));
		sb.append("|").append('\n');

		return sb;
	}
}
