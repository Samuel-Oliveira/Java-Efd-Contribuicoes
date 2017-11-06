/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC810;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC810 {

	public static StringBuilder gerar(RegistroC810 registroC810, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC810.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC810.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
