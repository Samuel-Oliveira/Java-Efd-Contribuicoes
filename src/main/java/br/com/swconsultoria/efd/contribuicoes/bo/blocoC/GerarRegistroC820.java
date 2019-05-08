/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC820;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC820 {

	public static StringBuilder gerar(RegistroC820 registroC820, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC820.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getQuant_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getAliq_pis_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC820.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
