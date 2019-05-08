/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC601;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC601 {

	public static StringBuilder gerar(RegistroC601 registroC601, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC601.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC601.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC601.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC601.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC601.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC601.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC601.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
