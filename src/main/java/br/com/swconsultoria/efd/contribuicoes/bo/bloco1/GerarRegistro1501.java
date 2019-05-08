/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1501;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1501 {

	public static StringBuilder gerar(Registro1501 registro1501, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1501.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getSer()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getSub_ser()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getDt_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getChv_nfe()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getVl_oper()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getInd_orig_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getAliq_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getDesc_compl()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getPer_escrit()));
		sb.append("|").append(Util.preencheRegistro(registro1501.getCnpj()));
		sb.append("|").append('\n');

		return sb;
	}
}
