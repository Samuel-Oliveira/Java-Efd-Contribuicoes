/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoP;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoP.RegistroP199;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP199 {

	public static StringBuilder gerar(RegistroP199 registroP199, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP199.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP199.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroP199.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
