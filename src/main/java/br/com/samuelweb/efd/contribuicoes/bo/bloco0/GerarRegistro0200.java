/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0200;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0200 {

	public static StringBuilder gerar(Registro0200 registro0200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getDescr_item()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getCod_barra()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getCod_ant_item()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getUnid_inv()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getTipo_item()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getCod_ncm()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getEx_ipi()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getCod_gen()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getCod_lst()));
		sb.append("|").append(Util.preencheRegistro(registro0200.getAliq_icms()));
		sb.append("|").append('\n');

		return sb;
	}
}
