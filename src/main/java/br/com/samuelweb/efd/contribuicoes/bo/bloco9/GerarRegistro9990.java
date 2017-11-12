/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco9;

import br.com.samuelweb.efd.contribuicoes.registros.bloco9.Registro9990;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro9990 {

	public static StringBuilder gerar(Registro9990 registro9990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro9990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9990.getQtd_lin_9()));
		sb.append("|").append('\n');

		return sb;
	}
}
