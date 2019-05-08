/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM510;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM510 {

	public static StringBuilder gerar(RegistroM510 registroM510, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM510.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getInd_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getVl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getCod_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getDescr_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM510.getDt_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
