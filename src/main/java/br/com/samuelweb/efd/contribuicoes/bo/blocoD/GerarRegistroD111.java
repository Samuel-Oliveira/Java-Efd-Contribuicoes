/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD111;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD111 {

	public static StringBuilder gerar(RegistroD111 registroD111, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD111.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD111.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroD111.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
