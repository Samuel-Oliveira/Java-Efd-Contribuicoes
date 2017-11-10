/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoI;

import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI399;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI399 {

	public static StringBuilder gerar(RegistroI399 registroI399, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI399.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI399.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroI399.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
