/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0400;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0400 {

	public static StringBuilder gerar(Registro0400 registro0400, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0400.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0400.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registro0400.getDescr_nat()));
		sb.append("|").append('\n');

		return sb;
	}
}
