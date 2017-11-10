/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoI;

import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI100;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI100 {

	public static StringBuilder gerar(RegistroI100 registroI100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getVl_rec()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getCst_pis_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getVl_tot_ded_ger()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getVl_tot_ded_esp()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
