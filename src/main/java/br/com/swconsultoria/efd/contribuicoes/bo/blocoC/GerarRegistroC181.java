/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC181;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC181 {

	public static StringBuilder gerar(RegistroC181 registroC181, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC181.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC181.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
