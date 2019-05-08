/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1001 {

	public static StringBuilder gerar(Registro1001 registro1001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
