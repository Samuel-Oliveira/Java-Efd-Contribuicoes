/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC191;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC191 {

	public static StringBuilder gerar(RegistroC191 registroC191, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC191.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getCnpj_cpf_part()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC191.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
