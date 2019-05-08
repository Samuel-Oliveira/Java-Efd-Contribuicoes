/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM810;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM810 {

	public static StringBuilder gerar(RegistroM810 registroM810, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM810.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM810.getNat_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM810.getVl_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM810.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM810.getDesc_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
