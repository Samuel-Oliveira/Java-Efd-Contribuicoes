/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM505;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM505 {

	public static StringBuilder gerar(RegistroM505 registroM505, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM505.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getVl_bc_cofins_tot()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getVl_bc_cofins_cum()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getVl_bc_cofins_nc()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getQuant_bc_cofins_tot()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM505.getDesc_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
