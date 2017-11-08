/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD501;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD501 {

	public static StringBuilder gerar(RegistroD501 registroD501, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD501.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD501.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD501.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD501.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroD501.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD501.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD501.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD501.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
