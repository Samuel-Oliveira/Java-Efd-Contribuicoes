/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0111;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0111 {

	public static StringBuilder gerar(Registro0111 registro0111, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0111.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0111.getRec_bru_ncum_trib_mi()));
		sb.append("|").append(Util.preencheRegistro(registro0111.getRec_bru_ncum_nt_mi()));
		sb.append("|").append(Util.preencheRegistro(registro0111.getRec_bru_ncum_exp()));
		sb.append("|").append(Util.preencheRegistro(registro0111.getRec_bru_cum()));
		sb.append("|").append(Util.preencheRegistro(registro0111.getRec_bru_total()));
		sb.append("|").append('\n');

		return sb;
	}
}
