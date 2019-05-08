/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF559;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF559 {

	public static StringBuilder gerar(RegistroF559 registroF559, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF559.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF559.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF559.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
