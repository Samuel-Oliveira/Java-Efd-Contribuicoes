/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF569;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF569 {

	public static StringBuilder gerar(RegistroF569 registroF569, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF569.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF569.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroF569.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}
}
