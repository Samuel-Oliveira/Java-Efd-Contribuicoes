/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM211;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM211 {

	public static StringBuilder gerar(RegistroM211 registroM211, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM211.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM211.getInd_tip_coop()));
		sb.append("|").append(Util.preencheRegistro(registroM211.getVl_bc_cont_ant_exc_coop()));
		sb.append("|").append(Util.preencheRegistro(registroM211.getVl_exc_coop_ger()));
		sb.append("|").append(Util.preencheRegistro(registroM211.getVl_exc_esp_coop()));
		sb.append("|").append(Util.preencheRegistro(registroM211.getVl_bc_cont()));
		sb.append("|").append('\n');

		return sb;
	}
}
