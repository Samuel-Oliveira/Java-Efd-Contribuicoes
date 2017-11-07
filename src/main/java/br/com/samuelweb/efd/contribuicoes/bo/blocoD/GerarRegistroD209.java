/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD209;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD209 {

	public static StringBuilder gerar(RegistroD209 registroD209, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD209.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD209.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroD209.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
