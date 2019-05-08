/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoP;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoP.RegistroP001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP001 {

	public static StringBuilder gerar(RegistroP001 registroP001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
