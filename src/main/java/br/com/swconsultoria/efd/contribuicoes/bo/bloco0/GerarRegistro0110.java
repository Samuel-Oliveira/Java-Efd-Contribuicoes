/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0110;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0110 {

	public static StringBuilder gerar(Registro0110 registro0110, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0110.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0110.getCod_inc_trib()));
		sb.append("|").append(Util.preencheRegistro(registro0110.getInd_apro_cred()));
		sb.append("|").append(Util.preencheRegistro(registro0110.getCod_tipo_cont()));
		sb.append("|").append(Util.preencheRegistro(registro0110.getInd_reg_cum()));
		sb.append("|").append('\n');

		return sb;
	}
}
