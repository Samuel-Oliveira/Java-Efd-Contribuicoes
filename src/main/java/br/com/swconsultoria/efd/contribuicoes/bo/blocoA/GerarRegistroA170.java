/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoA;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.RegistroA170;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA170 {

	public static StringBuilder gerar(RegistroA170 registroA170, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA170.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getNum_item()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getDescr_compl()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getInd_orig_cred()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getAliq_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getAliq_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroA170.getCod_ccus()));
		sb.append("|").append('\n');

		return sb;
	}
}
