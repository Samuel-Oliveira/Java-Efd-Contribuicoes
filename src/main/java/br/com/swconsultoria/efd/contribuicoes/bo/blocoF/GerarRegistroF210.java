/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF210;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF210 {

	public static StringBuilder gerar(RegistroF210 registroF210, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF210.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getVl_cus_orc()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getVl_exc()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getVl_cus_orc_aju()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getVl_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getVl_cred_pis_util()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF210.getVl_cred_cofins_util()));
		sb.append("|").append('\n');

		return sb;
	}
}
