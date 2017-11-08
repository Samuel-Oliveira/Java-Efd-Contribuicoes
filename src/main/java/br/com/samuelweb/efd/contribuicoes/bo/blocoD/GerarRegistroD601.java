/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD601;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD601 {

	public static StringBuilder gerar(RegistroD601 registroD601, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD601.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getCod_class()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD601.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
