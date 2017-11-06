/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC609;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC609 {

	public static StringBuilder gerar(RegistroC609 registroC609, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC609.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC609.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC609.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
