/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF100;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF100 {

	public static StringBuilder gerar(RegistroF100 registroF100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getInd_oper()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getDt_oper()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getVl_oper()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getInd_orig_cred()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroF100.getDesc_doc_oper()));
		sb.append("|").append('\n');

		return sb;
	}
}
