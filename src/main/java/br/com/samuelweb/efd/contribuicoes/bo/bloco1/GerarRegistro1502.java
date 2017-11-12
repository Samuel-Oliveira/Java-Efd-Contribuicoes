/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1502;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1502 {

	public static StringBuilder gerar(Registro1502 registro1502, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1502.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1502.getVl_cred_cofins_trib_mi()));
		sb.append("|").append(Util.preencheRegistro(registro1502.getVl_cred_cofins_nt_mi()));
		sb.append("|").append(Util.preencheRegistro(registro1502.getVl_cred_cofins_exp()));
		sb.append("|").append('\n');

		return sb;
	}
}
