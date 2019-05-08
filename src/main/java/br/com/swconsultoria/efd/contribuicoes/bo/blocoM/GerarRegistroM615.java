/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM615;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM615 {

	public static StringBuilder gerar(RegistroM615 registroM615, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM615.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getInd_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getVl_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getCod_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getDescr_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getDt_ref()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroM615.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
