/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1220;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1220 {

	public static StringBuilder gerar(Registro1220 registro1220, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1220.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1220.getPer_apu_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1220.getOrig_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1220.getCod_cred()));
		sb.append("|").append(Util.preencheRegistro(registro1220.getVl_cred()));
		sb.append("|").append('\n');

		return sb;
	}
}
