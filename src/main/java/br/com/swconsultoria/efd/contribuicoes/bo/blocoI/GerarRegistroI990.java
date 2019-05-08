/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoI;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoI.RegistroI990;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI990 {

	public static StringBuilder gerar(RegistroI990 registroI990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI990.getQtd_lin_i()));
		sb.append("|").append('\n');

		return sb;
	}
}
