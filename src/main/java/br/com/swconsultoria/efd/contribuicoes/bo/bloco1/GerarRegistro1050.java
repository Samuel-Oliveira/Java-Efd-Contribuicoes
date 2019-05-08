/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.bloco1;

import br.com.swconsultoria.efd.contribuicoes.registros.bloco1.Registro1050;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro1050 {

	public static StringBuilder gerar(Registro1050 registro1050, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro1050.getReg()));
        sb.append("|").append(Util.preencheRegistro(registro1050.getDt_ref()));
        sb.append("|").append(Util.preencheRegistro(registro1050.getInd_aj_bc()));
        sb.append("|").append(Util.preencheRegistro(registro1050.getCnpj()));
        sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_tot()));
        sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst01()));
        sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst02()));
        sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst03()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst04()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst05()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst06()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst07()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst08()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst09()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst49()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getVl_aj_cst99()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getInd_aprop()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getNum_rec()));
		sb.append("|").append(Util.preencheRegistro(registro1050.getInfo_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
