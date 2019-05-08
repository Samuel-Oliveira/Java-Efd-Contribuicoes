/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC481;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC481 {

	public static StringBuilder gerar(RegistroC481 registroC481, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC481.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC481.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
