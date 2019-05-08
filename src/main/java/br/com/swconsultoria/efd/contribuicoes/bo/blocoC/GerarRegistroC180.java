/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC180;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC180 {

	public static StringBuilder gerar(RegistroC180 registroC180, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC180.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC180.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC180.getDt_doc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC180.getDt_doc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC180.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC180.getCod_ncm()));
		sb.append("|").append(Util.preencheRegistro(registroC180.getEx_ipi()));
		sb.append("|").append(Util.preencheRegistro(registroC180.getVl_tot_item()));
		sb.append("|").append('\n');

		return sb;
	}
}
