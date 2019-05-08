/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoA;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.RegistroA120;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA120 {

	public static StringBuilder gerar(RegistroA120 registroA120, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA120.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getVl_tot_serv()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getVl_pis_imp()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getDt_pag_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getVl_cofins_imp()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getDt_pag_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA120.getLoc_exe_serv()));
		sb.append("|").append('\n');

		return sb;
	}
}
