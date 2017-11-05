/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC185;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC185 {

	public static StringBuilder gerar(RegistroC185 registroC185, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC185.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC185.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
