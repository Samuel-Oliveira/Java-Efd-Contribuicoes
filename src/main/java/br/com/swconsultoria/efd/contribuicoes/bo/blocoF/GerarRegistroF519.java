/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF519;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF519 {

	public static StringBuilder gerar(RegistroF519 registroF519, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF519.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF519.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF519.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
