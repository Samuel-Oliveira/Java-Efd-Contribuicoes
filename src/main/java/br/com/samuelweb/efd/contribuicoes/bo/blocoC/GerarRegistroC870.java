/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC870;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC870 {

	public static StringBuilder gerar(RegistroC870 registroC870, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC870.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC870.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
