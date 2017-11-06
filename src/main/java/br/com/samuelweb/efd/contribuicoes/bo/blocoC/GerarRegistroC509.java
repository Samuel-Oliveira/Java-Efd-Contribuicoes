/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC509;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC509 {

	public static StringBuilder gerar(RegistroC509 registroC509, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC509.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC509.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC509.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
