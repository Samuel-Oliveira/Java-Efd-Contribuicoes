/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM225;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM225 {

	public static StringBuilder gerar(RegistroM225 registroM225, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM225.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getDet_valor_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getDet_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getDet_aliq()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getDt_oper_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getDesc_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM225.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
