/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC495;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC495 {
	
	public static StringBuilder gerar(RegistroC495 registroC495, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC495.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC495.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
