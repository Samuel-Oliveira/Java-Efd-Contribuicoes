/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco9;

import br.com.samuelweb.efd.contribuicoes.registros.bloco9.Registro9001;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro9001 {

	public static StringBuilder gerar(Registro9001 registro9001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro9001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
