/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoD;

import br.com.samuelweb.efd.contribuicoes.registros.blocoD.RegistroD205;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD205 {

	public static StringBuilder gerar(RegistroD205 registroD205, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD205.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD205.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD205.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD205.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD205.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD205.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD205.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
