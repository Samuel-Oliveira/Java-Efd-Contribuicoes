/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0190;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0190 {

	public static StringBuilder gerar(Registro0190 registro0190, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0190.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0190.getUnid()));
		sb.append("|").append(Util.preencheRegistro(registro0190.getDescr()));
		sb.append("|").append('\n');

		return sb;
	}
}
