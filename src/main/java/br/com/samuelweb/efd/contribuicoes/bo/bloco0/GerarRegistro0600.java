/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0600;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0600 {

	public static StringBuilder gerar(Registro0600 registro0600, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0600.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0600.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registro0600.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registro0600.getCcus()));
		sb.append("|").append('\n');

		return sb;
	}
}
