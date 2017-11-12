/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1010;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1010 {

	public static StringBuilder gerar(Registro1010 registro1010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1010.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registro1010.getId_sec_jud()));
		sb.append("|").append(Util.preencheRegistro(registro1010.getId_vara()));
		sb.append("|").append(Util.preencheRegistro(registro1010.getInd_nat_acao()));
		sb.append("|").append(Util.preencheRegistro(registro1010.getDesc_dec_jud()));
		sb.append("|").append(Util.preencheRegistro(registro1010.getDt_sent_jud()));
		sb.append("|").append('\n');

		return sb;
	}
}
