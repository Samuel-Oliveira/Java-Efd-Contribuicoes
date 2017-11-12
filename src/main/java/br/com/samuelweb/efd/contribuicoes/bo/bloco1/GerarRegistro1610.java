/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1610;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1610 {

	public static StringBuilder gerar(Registro1610 registro1610, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1610.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getDt_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getVl_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getAliq_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registro1610.getDesc_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
