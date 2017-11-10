/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM410;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM410 {

	public static StringBuilder gerar(RegistroM410 registroM410, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM410.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getNat_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getVl_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM410.getDesc_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
