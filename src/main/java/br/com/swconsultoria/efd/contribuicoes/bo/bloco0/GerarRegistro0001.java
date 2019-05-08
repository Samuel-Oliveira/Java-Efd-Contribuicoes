/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0001 {

	public static StringBuilder gerar(Registro0001 registro0001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
