/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD201;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD201 {

	public static StringBuilder gerar(RegistroD201 registroD201, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD201.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD201.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD201.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD201.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD201.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD201.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD201.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
