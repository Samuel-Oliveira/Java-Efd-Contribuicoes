/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1620;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1620 {

	public static StringBuilder gerar(Registro1620 registro1620, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1620.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1620.getPer_apu_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1620.getOrig_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1620.getCod_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1620.getVl_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
