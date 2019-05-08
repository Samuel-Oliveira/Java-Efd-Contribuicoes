/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM620;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM620 {

	public static StringBuilder gerar(RegistroM620 registroM620, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM620.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM620.getInd_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM620.getVl_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM620.getCod_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM620.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroM620.getDescr_aj()));
		sb.append("|").append(Util.preencheRegistro(registroM620.getDt_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
