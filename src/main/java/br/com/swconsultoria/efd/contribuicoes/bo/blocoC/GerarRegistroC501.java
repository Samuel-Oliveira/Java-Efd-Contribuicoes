/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC501;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC501 {

	public static StringBuilder gerar(RegistroC501 registroC501, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC501.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC501.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC501.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC501.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroC501.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC501.getAliq_pis_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC501.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC501.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
