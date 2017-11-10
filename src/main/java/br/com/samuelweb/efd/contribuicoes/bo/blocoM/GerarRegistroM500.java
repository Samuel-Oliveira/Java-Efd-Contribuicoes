/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM500;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM500 {

	public static StringBuilder gerar(RegistroM500 registroM500, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getCod_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getInd_cred_ori()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_ajus_acres()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_ajus_reduc()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_cred_difer()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_cred_disp()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getInd_desc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getVl_cred_desc()));
		sb.append("|").append(Util.preencheRegistro(registroM500.getSld_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
