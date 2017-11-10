/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM611;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM611 {

	public static StringBuilder gerar(RegistroM611 registroM611, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM611.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM611.getInd_tip_coop()));
		sb.append("|").append(Util.preencheRegistro(registroM611.getVl_bc_cont_ant_exc_coop()));
		sb.append("|").append(Util.preencheRegistro(registroM611.getVl_exc_coop_ger()));
		sb.append("|").append(Util.preencheRegistro(registroM611.getVl_exc_esp_coop()));
		sb.append("|").append(Util.preencheRegistro(registroM611.getVl_bc_cont()));
		sb.append("|").append('\n');

		return sb;
	}
}
