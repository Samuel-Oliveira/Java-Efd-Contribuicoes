/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD609;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD609 {

	public static StringBuilder gerar(RegistroD609 registroD609, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD609.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD609.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroD609.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
