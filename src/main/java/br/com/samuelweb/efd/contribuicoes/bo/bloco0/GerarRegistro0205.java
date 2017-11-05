/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0205;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0205 {

	public static StringBuilder gerar(Registro0205 registro0205, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0205.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getDescr_ant_item()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getDt_fim()));
		sb.append("|").append(Util.preencheRegistro(registro0205.getCod_ant_item()));
		sb.append("|").append('\n');

		return sb;
	}
}
