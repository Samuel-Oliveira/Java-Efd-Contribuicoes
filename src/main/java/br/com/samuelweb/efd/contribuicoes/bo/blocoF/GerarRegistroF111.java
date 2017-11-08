/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF111;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF111 {

	public static StringBuilder gerar(RegistroF111 registroF111, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF111.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF111.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF111.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
