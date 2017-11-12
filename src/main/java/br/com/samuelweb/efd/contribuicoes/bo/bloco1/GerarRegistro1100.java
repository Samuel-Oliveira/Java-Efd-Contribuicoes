/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1100;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1100 {

	public static StringBuilder gerar(Registro1100 registro1100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getPer_apu_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getOrig_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getCnpj_suc()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getCod_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_ext_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_desc_pa_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_per_pa_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_dcomp_pa_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getSd_cred_disp_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_desc_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_per_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_dcomp_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_trans()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getVl_cred_out()));
		sb.append("|").append(Util.preencheRegistro(registro1100.getSld_cred_fim()));
		sb.append("|").append('\n');

		return sb;
	}
}
