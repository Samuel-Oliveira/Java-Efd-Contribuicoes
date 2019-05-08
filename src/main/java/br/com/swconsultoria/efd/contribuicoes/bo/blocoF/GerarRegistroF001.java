/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF001;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF001 {

	public static StringBuilder gerar(RegistroF001 registroF001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF001.getInd_mov()));
		sb.append("|").append('\n');

		return sb;
	}
}
