/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoA;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.RegistroA111;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA111 {

	public static StringBuilder gerar(RegistroA111 registroA111, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA111.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA111.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroA111.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
