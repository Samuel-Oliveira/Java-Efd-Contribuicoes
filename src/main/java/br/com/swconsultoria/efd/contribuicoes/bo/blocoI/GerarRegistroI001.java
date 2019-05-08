/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoI;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoI.RegistroI001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI001 {

	public static StringBuilder gerar(RegistroI001 registroI001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
