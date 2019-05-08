/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF550;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF550 {

	public static StringBuilder gerar(RegistroF550 registroF550, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF550.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getVl_rec_comp()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getVl_desc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getVl_desc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroF550.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
