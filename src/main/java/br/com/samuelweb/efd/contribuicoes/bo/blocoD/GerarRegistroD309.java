/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD309;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD309 {

	public static StringBuilder gerar(RegistroD309 registroD309, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD309.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD309.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroD309.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
