/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC505;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC505 {

	public static StringBuilder gerar(RegistroC505 registroC505, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC505.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC505.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC505.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC505.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroC505.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC505.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC505.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC505.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
