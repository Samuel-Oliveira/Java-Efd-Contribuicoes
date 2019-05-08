/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM630;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM630 {

	public static StringBuilder gerar(RegistroM630 registroM630, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM630.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM630.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroM630.getVl_vend()));
		sb.append("|").append(Util.preencheRegistro(registroM630.getVl_nao_receb()));
		sb.append("|").append(Util.preencheRegistro(registroM630.getVl_cont_dif()));
		sb.append("|").append(Util.preencheRegistro(registroM630.getVl_cred_dif()));
		sb.append("|").append(Util.preencheRegistro(registroM630.getCod_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
