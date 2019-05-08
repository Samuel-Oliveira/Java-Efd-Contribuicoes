/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco9;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco9.Registro9999;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro9999 {

	public static StringBuilder gerar(Registro9999 registro9999, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro9999.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9999.getQtd_lin()));
		sb.append("|").append('\n');

		return sb;
	}
}
