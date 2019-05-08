/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF500;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF500 {

	public static StringBuilder gerar(RegistroF500 registroF500, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getVl_rec_caixa()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getVl_desc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getVl_desc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroF500.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
