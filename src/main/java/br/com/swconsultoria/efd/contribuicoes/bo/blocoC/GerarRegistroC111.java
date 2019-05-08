/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC111;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC111 {

	public static StringBuilder gerar(RegistroC111 registroC111, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC111.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC111.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC111.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
