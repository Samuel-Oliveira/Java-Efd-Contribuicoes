/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF139;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF139 {

	public static StringBuilder gerar(RegistroF139 registroF139, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF139.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF139.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF139.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
