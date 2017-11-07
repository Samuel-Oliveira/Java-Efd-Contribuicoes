/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD300;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD300 {

	public static StringBuilder gerar(RegistroD300 registroD300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getNum_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getNum_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getDt_ref()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD300.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
