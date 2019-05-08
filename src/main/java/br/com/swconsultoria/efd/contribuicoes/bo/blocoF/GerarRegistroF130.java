/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF130;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF130 {

	public static StringBuilder gerar(RegistroF130 registroF130, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF130.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getIdent_bem_imob()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getInd_orig_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getInd_util_bem_imob()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getMes_oper_aquis()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getVl_oper_aquis()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getParc_oper_nao_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getVl_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getInd_nr_parc()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroF130.getDesc_bem_imob()));
		sb.append("|").append('\n');

		return sb;
	}
}
