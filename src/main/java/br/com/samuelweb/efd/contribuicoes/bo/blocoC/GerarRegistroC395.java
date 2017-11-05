/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoC;

import br.com.samuelweb.efd.contribuicoes.registros.blocoC.RegistroC395;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroC395 {

	public static StringBuilder gerar(RegistroC395 registroC395, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC395.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC395.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registroC395.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroC395.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroC395.getSub_ser()));
		sb.append("|").append(Util.preencheRegistro(registroC395.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC395.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroC395.getVl_doc()));
		sb.append("|").append('\n');

		return sb;
	}
}
