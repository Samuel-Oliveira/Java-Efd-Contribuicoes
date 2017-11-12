/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoP;

import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP110;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroP110 {

	public static StringBuilder gerar(RegistroP110 registroP110, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroP110.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroP110.getNum_campo()));
		sb.append("|").append(Util.preencheRegistro(registroP110.getCod_det()));
		sb.append("|").append(Util.preencheRegistro(registroP110.getDet_valor()));
		sb.append("|").append(Util.preencheRegistro(registroP110.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
