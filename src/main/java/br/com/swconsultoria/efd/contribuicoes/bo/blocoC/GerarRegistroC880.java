/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC880;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC880 {

	public static StringBuilder gerar(RegistroC880 registroC880, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC880.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC880.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
