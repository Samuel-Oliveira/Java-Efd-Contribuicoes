/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0206;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0206 {

	public static StringBuilder gerar(Registro0206 registro0206, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0206.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0206.getCod_comb()));
		sb.append("|").append('\n');

		return sb;
	}
}
