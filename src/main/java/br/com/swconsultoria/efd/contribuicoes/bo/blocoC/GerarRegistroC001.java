/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC001 {

	public static StringBuilder gerar(RegistroC001 registroC001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}