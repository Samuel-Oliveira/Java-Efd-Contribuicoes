/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoM;

import br.com.samuelweb.efd.contribuicoes.registros.blocoM.RegistroM230;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM230 {

	public static StringBuilder gerar(RegistroM230 registroM230, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM230.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM230.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroM230.getVl_vend()));
		sb.append("|").append(Util.preencheRegistro(registroM230.getVl_nao_receb()));
		sb.append("|").append(Util.preencheRegistro(registroM230.getVl_cont_dif()));
		sb.append("|").append(Util.preencheRegistro(registroM230.getVl_cred_dif()));
		sb.append("|").append(Util.preencheRegistro(registroM230.getCod_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
