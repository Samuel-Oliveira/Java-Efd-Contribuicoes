/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1500;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1500 {

	public static StringBuilder gerar(Registro1500 registro1500, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getPer_apu_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getOrig_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getCnpj_suc()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getCod_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_ext_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_tot_cred_apu()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_desc_pa_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_per_pa_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_dcomp_pa_ant()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getSd_cred_disp_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_desc_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_per_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_dcomp_efd()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_trans()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getVl_cred_out()));
		sb.append("|").append(Util.preencheRegistro(registro1500.getSld_cred_fim()));
		sb.append("|").append('\n');

		return sb;
	}
}
