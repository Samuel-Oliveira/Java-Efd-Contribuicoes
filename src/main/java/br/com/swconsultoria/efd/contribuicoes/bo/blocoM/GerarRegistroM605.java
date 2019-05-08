/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM605;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM605 {

	public static StringBuilder gerar(RegistroM605 registroM605, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM605.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM605.getNum_campo()));
		sb.append("|").append(Util.preencheRegistro(registroM605.getCod_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM605.getVl_debito()));
		sb.append("|").append('\n');

		return sb;
	}
}
