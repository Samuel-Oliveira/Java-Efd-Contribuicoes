/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC489;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC489 {

	public static StringBuilder gerar(RegistroC489 registroC489, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC489.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC489.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC489.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
