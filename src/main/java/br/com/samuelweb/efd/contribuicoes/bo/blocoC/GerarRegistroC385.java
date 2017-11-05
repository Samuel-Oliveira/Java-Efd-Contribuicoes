/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC385;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC385 {

	public static StringBuilder gerar(RegistroC385 registroC385, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC385.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC385.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
