/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC396;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC396 {

	public static StringBuilder gerar(RegistroC396 registroC396, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC396.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC396.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
