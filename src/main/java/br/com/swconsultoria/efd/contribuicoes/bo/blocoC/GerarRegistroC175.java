/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC175;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC175 {

	public static StringBuilder gerar(RegistroC175 registroC175, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC175.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getVl_opr()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroC175.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
