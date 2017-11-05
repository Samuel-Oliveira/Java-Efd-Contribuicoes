/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC188;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC188 {

	public static StringBuilder gerar(RegistroC188 registroC188, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC188.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC188.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC188.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
