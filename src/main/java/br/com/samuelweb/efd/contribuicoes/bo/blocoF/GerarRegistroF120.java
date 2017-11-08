/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF120;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF120 {

	public static StringBuilder gerar(RegistroF120 registroF120, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF120.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getIdent_bem_imob()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getInd_orig_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getInd_util_bem_imob()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getVl_oper_dep()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getParc_oper_nao_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroF120.getDesc_bem_imob()));
		sb.append("|").append('\n');

		return sb;
	}
}
