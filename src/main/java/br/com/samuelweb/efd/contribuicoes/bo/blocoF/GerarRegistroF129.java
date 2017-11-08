/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF129;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF129 {

	public static StringBuilder gerar(RegistroF129 registroF129, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF129.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF129.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF129.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
