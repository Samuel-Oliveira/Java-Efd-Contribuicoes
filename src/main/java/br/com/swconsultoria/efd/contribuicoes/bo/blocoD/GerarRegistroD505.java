/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoD;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoD.RegistroD505;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD505 {

	public static StringBuilder gerar(RegistroD505 registroD505, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD505.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD505.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD505.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD505.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroD505.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD505.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD505.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD505.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
