/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC190;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC190 {

	public static StringBuilder gerar(RegistroC190 registroC190, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC190.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getDt_ref_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getDt_ref_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getCod_ncm()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getEx_ipi()));
		sb.append("|").append(Util.preencheRegistro(registroC190.getVl_tot_item()));
		sb.append("|").append('\n');

		return sb;
	}
}
