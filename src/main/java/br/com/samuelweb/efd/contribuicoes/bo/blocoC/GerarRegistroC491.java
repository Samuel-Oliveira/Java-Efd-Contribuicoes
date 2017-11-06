/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC491;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC491 {
	
	public static StringBuilder gerar(RegistroC491 registroC491, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC491.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC491.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
