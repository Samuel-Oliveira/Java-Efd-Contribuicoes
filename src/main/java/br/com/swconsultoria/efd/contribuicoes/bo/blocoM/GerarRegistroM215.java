/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM215;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM215 {

	public static StringBuilder gerar(RegistroM215 registroM215, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM215.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getInd_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getVl_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getCod_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getDescr_aj_bc()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getDt_ref()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroM215.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
