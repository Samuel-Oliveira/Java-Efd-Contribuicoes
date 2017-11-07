/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD101;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD101 {

	public static StringBuilder gerar(RegistroD101 registroD101, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD101.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getInd_nat_frt()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroD101.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
