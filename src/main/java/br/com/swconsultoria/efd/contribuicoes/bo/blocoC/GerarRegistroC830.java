/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC830;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC830 {

	public static StringBuilder gerar(RegistroC830 registroC830, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC830.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC830.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC830.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
