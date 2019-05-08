/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoC;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoC.RegistroC485;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC485 {

	public static StringBuilder gerar(RegistroC485 registroC485, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC485.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getQuant_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getAliq_cofins_reais()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroC485.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
