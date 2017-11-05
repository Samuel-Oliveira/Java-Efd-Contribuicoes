/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0140;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0140 {

	public static StringBuilder gerar(Registro0140 registro0140, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro0140.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getCod_est()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getNome()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getUf()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getIe()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getCod_mun()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getIm()));
		sb.append("|").append(Util.preencheRegistro(registro0140.getSuframa()));
		sb.append("|").append('\n');

		return sb;
	}
}
