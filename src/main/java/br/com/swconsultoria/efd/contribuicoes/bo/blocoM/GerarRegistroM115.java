/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM115;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM115 {

	public static StringBuilder gerar(RegistroM115 registroM115, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM115.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getDet_valor_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getDet_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getDet_aliq()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getDt_oper_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getDesc_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM115.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
