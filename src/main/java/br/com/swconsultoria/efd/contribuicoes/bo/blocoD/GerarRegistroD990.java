/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoD;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoD.RegistroD990;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD990 {

	public static StringBuilder gerar(RegistroD990 registroD990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD990.getQtd_lin_d()));
		sb.append("|").append('\n');

		return sb;
	}
}
