/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoD;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoD.RegistroD509;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD509 {

	public static StringBuilder gerar(RegistroD509 registroD509, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD509.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD509.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registroD509.getInd_proc()));
		sb.append("|").append('\n');

		return sb;
	}}
