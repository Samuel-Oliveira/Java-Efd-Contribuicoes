/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM515;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM515 {

	public static StringBuilder gerar(RegistroM515 registroM515, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM515.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getDet_valor_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getDet_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getDet_aliq()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getDt_oper_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getDesc_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM515.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
