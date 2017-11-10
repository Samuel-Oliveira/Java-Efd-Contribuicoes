/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM205;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM205 {

	public static StringBuilder gerar(RegistroM205 registroM205, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM205.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM205.getNum_campo()));
		sb.append("|").append(Util.preencheRegistro(registroM205.getCod_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM205.getVl_debito()));
		sb.append("|").append('\n');

		return sb;
	}
}
