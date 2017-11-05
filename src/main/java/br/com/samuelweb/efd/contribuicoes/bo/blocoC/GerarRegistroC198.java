/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC198;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC198 {

	public static StringBuilder gerar(RegistroC198 registroC198, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC198.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC198.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC198.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
