/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoI;

import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI199;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI199 {

	public static StringBuilder gerar(RegistroI199 registroI199, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI199.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI199.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroI199.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
