/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoF;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoF.RegistroF600;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF600 {

	public static StringBuilder gerar(RegistroF600 registroF600, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF600.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getInd_nat_ret()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getDt_ret()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getVl_bc_ret()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getVl_ret()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getCod_rec()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getInd_nat_rec()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getVl_ret_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getVl_ret_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF600.getInd_dec()));
		sb.append("|").append('\n');

		return sb;
	}
}
