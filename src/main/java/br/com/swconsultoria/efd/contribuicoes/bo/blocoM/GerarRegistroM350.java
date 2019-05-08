/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM350;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM350 {

	public static StringBuilder gerar(RegistroM350 registroM350, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM350.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getVl_tot_fol()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getVl_exc_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getVl_tot_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getAliq_pis_fol()));
		sb.append("|").append(Util.preencheRegistro(registroM350.getVl_tot_cont_fol()));
		sb.append("|").append('\n');

		return sb;
	}
}
