/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM001 {

	public static StringBuilder gerar(RegistroM001 registroM001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
