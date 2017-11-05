/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0208;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0208 {

	public static StringBuilder gerar(Registro0208 registro0208, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0208.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0208.getCod_tab()));
		sb.append("|").append(Util.preencheRegistro(registro0208.getCod_gru()));
		sb.append("|").append(Util.preencheRegistro(registro0208.getMarca_com()));
		sb.append("|").append('\n');

		return sb;
	}
}
