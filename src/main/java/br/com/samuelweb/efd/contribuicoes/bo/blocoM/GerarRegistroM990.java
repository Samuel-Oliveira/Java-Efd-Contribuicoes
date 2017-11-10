/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM990 {

	public static StringBuilder gerar(RegistroM990 registroM990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM990.getQtd_lin_m()));
		sb.append("|").append('\n');

		return sb;
	}
}
