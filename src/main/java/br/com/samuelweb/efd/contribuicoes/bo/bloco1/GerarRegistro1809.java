/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1809;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1809 {

	public static StringBuilder gerar(Registro1809 registro1809, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1809.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1809.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registro1809.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
