/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoM;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoM.RegistroM800;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroM800 {

	public static StringBuilder gerar(RegistroM800 registroM800, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroM800.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroM800.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroM800.getVl_tot_rec()));
		sb.append("|").append(Util.preencheRegistro(registroM800.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroM800.getDesc_compl()));
		sb.append("|").append('\n');

		return sb;
	}
}
