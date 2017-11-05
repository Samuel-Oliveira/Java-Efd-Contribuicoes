/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC195;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC195 {

	public static StringBuilder gerar(RegistroC195 registroC195, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC195.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getCnpj_cpf_part()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC195.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
