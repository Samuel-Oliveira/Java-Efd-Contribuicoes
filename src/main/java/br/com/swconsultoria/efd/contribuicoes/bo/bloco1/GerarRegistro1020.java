/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1020;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1020 {

	public static StringBuilder gerar(Registro1020 registro1020, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1020.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1020.getNum_proc()));
		sb.append("|").append(Util.preencheRegistro(registro1020.getInd_nat_acao()));
		sb.append("|").append(Util.preencheRegistro(registro1020.getDt_dec_adm()));
		sb.append("|").append('\n');

		return sb;
	}
}
