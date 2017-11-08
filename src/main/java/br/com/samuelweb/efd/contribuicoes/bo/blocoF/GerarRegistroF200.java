/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF200;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF200 {

	public static StringBuilder gerar(RegistroF200 registroF200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getInd_oper()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getUnid_imob()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getIdent_emp()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getDesc_unid_imob()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getNum_cont()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getCpf_cnpj_adqu()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getDt_oper()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getVl_tot_vend()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getVl_rec_acum()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getVl_tot_rec()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getPerc_rec_receb()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getInd_nat_emp()));
		sb.append("|").append(Util.preencheRegistro(registroF200.getInf_comp()));
		sb.append("|").append('\n');

		return sb;
	}
}
