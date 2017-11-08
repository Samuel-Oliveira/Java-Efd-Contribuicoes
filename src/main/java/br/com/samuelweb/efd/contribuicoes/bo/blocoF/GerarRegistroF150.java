/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF150;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF150 {

	public static StringBuilder gerar(RegistroF150 registroF150, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getVl_tot_est()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getEst_imp()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getVl_bc_est()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getVl_bc_men_est()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getVl_cred_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getVl_cred_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getDesc_est()));
		sb.append("|").append(Util.preencheRegistro(registroF150.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
