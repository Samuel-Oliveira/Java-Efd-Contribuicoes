/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.blocoF;

import br.com.samuelweb.efd.contribuicoes.registros.blocoF.RegistroF525;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroF525 {

	public static StringBuilder gerar(RegistroF525 registroF525, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroF525.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getVl_rec()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getInd_rec()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getCnpj_cpf()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getCod_item()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getVl_rec_det()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getCst_pis()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getInfo_compl()));
		sb.append("|").append(Util.preencheRegistro(registroF525.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
