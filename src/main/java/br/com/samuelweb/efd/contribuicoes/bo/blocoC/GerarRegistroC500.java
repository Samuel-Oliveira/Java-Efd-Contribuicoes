/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC500;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC500 {

	public static StringBuilder gerar(RegistroC500 registroC500, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getCod_sit()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getDt_ent()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getVl_icms()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getCod_inf()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroC500.getVl_cofins()));
		sb.append("|").append('\n');

		return sb;
	}
}
