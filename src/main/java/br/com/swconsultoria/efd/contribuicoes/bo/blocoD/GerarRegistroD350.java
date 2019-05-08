/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoD;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoD.RegistroD350;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD350 {

	public static StringBuilder gerar(RegistroD350 registroD350, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD350.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getEcf_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getEcf_fab()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getCro()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getCrz()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getNum_coo_fin()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getGt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getVl_brt()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD350.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
