/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1210;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1210 {

	public static StringBuilder gerar(Registro1210 registro1210, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1210.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getDt_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getVl_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getAliq_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registro1210.getDesc_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
