/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF509;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF509 {

	public static StringBuilder gerar(RegistroF509 registroF509, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF509.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF509.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF509.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
