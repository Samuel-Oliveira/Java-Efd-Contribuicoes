/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0450;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0450 {

	public static StringBuilder gerar(Registro0450 registro0450, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0450.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0450.getCod_inf()));
		sb.append("|").append(Util.preencheRegistro(registro0450.getTxt()));
		sb.append("|").append('\n');

		return sb;
	}
}
