/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1102;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1102 {

	public static StringBuilder gerar(Registro1102 registro1102, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1102.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1102.getVl_cred_pis_trib_mi()));
		sb.append("|").append(Util.preencheRegistro(registro1102.getVl_cred_pis_nt_mi()));
		sb.append("|").append(Util.preencheRegistro(registro1102.getVl_cred_pis_exp()));
		sb.append("|").append('\n');

		return sb;
	}
}
