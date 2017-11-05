/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC010;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC010 {

	public static StringBuilder gerar(RegistroC010 registroC010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC010.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroC010.getInd_escri()));
		sb.append("|").append('\n');

		return sb;
	}
}
