/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF560;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF560 {

	public static StringBuilder gerar(RegistroF560 registroF560, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF560.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getVl_rec_comp()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getVl_desc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getVl_desc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroF560.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
