/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoD;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoD.RegistroD105;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroD105 {

	public static StringBuilder gerar(RegistroD105 registroD105, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroD105.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getInd_nat_frt()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getVl_item()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getCst_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getNat_bc_cred()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getAliq_cofins_percentual()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroD105.getCod_cta()));
		sb.append("|").append('\n');

		return sb;
	}
}
