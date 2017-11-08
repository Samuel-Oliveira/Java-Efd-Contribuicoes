/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD605;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD605 {

	public static StringBuilder gerar(RegistroD605 registroD605, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD605.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getCod_class()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD605.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
	
}
