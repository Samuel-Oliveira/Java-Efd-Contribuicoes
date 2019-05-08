/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF211;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF211 {

	public static StringBuilder gerar(RegistroF211 registroF211, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF211.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF211.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF211.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
