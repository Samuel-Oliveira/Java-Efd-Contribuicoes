/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF700;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF700 {

	public static StringBuilder gerar(RegistroF700 registroF700, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF700.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF700.getInd_orig_ded()));
		sb.append("|").append(Util.preencheRegistro(registroF700.getInd_nat_ded()));
		sb.append("|").append(Util.preencheRegistro(registroF700.getVl_ded_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF700.getVl_ded_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF700.getVl_bc_oper()));
		sb.append("|").append(Util.preencheRegistro(registroF700.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroF700.getInf_comp()));
		sb.append("|").append('\n');

		return sb;
	}
}
