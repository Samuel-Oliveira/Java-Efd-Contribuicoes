/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC605;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC605 {

	public static StringBuilder gerar(RegistroC605 registroC605, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC605.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC605.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC605.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC605.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC605.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC605.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC605.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
