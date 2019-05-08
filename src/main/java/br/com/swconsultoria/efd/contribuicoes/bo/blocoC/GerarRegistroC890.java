/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC890;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC890 {

	public static StringBuilder gerar(RegistroC890 registroC890, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC890.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC890.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroC890.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
