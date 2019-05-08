/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF205;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF205 {

	public static StringBuilder gerar(RegistroF205 registroF205, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF205.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cus_inc_acum_ant()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cus_inc_per_esc()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cus_inc_acum()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_exc_bc_cus_inc_acum()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_bc_cus_inc()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_pis_acum()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_pis_desc_ant()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_pis_desc()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_pis_desc_fut()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_cofins_acum()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_cofins_desc_ant()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_cofins_desc()));
		sb.append("|").append(Util.preencheRegistro(registroF205.getVl_cred_cofins_desc_fut()));
		sb.append("|").append('\n');

		return sb;
	}
}
