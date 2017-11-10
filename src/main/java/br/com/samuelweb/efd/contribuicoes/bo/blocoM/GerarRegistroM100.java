/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM100;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM100 {

	public static StringBuilder gerar(RegistroM100 registroM100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getCod_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getInd_cred_ori()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getVl_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getVl_ajus_acres()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getVl_ajus_reduc()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getVl_cred_dif()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getVl_cred_disp()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getInd_desc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getVl_cred_desc()));
		sb.append("|").append(Util.preencheRegistro(registroM100.getSld_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
