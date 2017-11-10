/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoI;

import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI299;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI299 {

	public static StringBuilder gerar(RegistroI299 registroI299, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI299.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI299.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroI299.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
