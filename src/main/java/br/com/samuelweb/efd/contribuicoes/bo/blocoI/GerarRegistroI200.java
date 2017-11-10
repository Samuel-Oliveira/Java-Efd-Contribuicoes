/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoI;

import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI200;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI200 {

	public static StringBuilder gerar(RegistroI200 registroI200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getNum_campo()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getCod_det()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getDet_valor()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
