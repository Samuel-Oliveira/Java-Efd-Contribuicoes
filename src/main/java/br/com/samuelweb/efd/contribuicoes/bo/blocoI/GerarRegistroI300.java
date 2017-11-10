/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoI;

import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI300;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI300 {

	public static StringBuilder gerar(RegistroI300 registroI300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI300.getCod_comp()));
		sb.append("|").append(Util.preencheRegistro(registroI300.getDet_valor()));
		sb.append("|").append(Util.preencheRegistro(registroI300.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI300.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
