/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0120;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0120 {

	public static StringBuilder gerar(Registro0120 registro0120, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0120.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0120.getMes_refer()));
		sb.append("|").append(Util.preencheRegistro(registro0120.getInf_comp()));
		sb.append("|").append('\n');

		return sb;
	}
}
