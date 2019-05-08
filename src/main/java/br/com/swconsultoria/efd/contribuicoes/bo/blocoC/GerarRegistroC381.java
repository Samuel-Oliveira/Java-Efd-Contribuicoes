/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC381;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC381 {

	public static StringBuilder gerar(RegistroC381 registroC381, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC381.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC381.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
