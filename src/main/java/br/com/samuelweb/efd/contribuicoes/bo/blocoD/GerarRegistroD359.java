/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD359;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD359 {

	public static StringBuilder gerar(RegistroD359 registroD359, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD359.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD359.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroD359.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
