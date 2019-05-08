/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0145;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0145 {

	public static StringBuilder gerar(Registro0145 registro0145, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0145.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0145.getCod_inc_trib()));
		sb.append("|").append(Util.preencheRegistro(registro0145.getVl_rec_tot()));
		sb.append("|").append(Util.preencheRegistro(registro0145.getVl_rec_ativ()));
		sb.append("|").append(Util.preencheRegistro(registro0145.getVl_rec_demais_ativ()));
		sb.append("|").append(Util.preencheRegistro(registro0145.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
