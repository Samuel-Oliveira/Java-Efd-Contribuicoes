/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM625;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM625 {

	public static StringBuilder gerar(RegistroM625 registroM625, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM625.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getDet_valor_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getDet_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getDet_aliq()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getDt_oper_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getDesc_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM625.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
