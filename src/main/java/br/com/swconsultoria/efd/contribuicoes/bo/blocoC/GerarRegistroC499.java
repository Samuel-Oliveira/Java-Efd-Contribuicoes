/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC499;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC499 {

	public static StringBuilder gerar(RegistroC499 registroC499, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC499.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC499.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC499.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
