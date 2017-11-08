/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF990 {

	public static StringBuilder gerar(RegistroF990 registroF990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF990.getQtd_lin_f()));
		sb.append("|").append('\n');

		return sb;
	}
}
