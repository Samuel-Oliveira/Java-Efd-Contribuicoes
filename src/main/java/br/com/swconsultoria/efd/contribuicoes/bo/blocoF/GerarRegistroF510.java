/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF510;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF510 {

	public static StringBuilder gerar(RegistroF510 registroF510, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getVl_rec_caixa()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getVl_desc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getVl_desc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroF510.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
