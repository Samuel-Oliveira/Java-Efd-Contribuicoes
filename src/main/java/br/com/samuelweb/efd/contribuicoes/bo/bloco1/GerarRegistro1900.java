/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco1;

import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Registro1900;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1900 {

	public static StringBuilder gerar(Registro1900 registro1900, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1900.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getCod_mod()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getSer()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getSub_ser()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getCod_sit()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getVl_tot_rec()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getQuant_doc()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getCfop()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getInf_compl()));
		sb.append("|").append(Util.preencheRegistro(registro1900.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
