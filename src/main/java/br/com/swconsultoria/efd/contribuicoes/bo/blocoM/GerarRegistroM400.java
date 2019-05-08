/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM400;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM400 {

	public static StringBuilder gerar(RegistroM400 registroM400, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM400.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM400.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM400.getVl_tot_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM400.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM400.getDesc_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
