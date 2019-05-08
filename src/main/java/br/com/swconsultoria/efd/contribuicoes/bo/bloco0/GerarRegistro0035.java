/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco0;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco0.Registro0035;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0035 {

	public static StringBuilder gerar(Registro0035 registro0035, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0035.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0035.getCod_scp()));
		sb.append("|").append(Util.preencheRegistro(registro0035.getDesc_scp()));
		sb.append("|").append(Util.preencheRegistro(registro0035.getInf_comp()));
		sb.append("|").append('\n');

		return sb;
	}
}
