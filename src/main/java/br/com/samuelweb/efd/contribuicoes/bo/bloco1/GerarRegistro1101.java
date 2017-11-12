/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1101;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1101 {

	public static StringBuilder gerar(Registro1101 registro1101, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1101.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getSer()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getSub_ser()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getDt_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getChv_nfe()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getVl_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getInd_orig_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getAliq_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getDesc_compl()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getPer_escrit()));
		sb.append("|").append(Util.preencheRegistro(registro1101.getCnpj()));
		sb.append("|").append('\n');

		return sb;
	}
}
