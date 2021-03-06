/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoA;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.RegistroA001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA001 {

	public static StringBuilder gerar(RegistroA001 registroA001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
