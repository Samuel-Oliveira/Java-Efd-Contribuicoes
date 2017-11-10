/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM105;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM105 {

	public static StringBuilder gerar(RegistroM105 registroM105, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM105.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getVl_bc_pis_tot()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getVl_bc_pis_cum()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getVl_bc_pis_nc()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getQuant_bc_pis_tot()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM105.getDesc_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
