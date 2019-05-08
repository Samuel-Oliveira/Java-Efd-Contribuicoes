/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF800;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF800 {

	public static StringBuilder gerar(RegistroF800 registroF800, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF800.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getInd_nat_even()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getDt_even()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getCnpj_suced()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getPa_cont_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getCod_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getVl_cred_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getVl_cred_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF800.getPer_cred_cis()));
		sb.append("|").append('\n');

		return sb;
	}
}
