/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoI;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoI.RegistroI010;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroI010 {

	public static StringBuilder gerar(RegistroI010 registroI010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI010.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroI010.getInd_ativ()));
		sb.append("|").append(Util.preencheRegistro(registroI010.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
