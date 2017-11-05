/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.bo.bloco0;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Registro0500;
import br.com.samuelweb.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistro0500 {

public static StringBuilder gerar(Registro0500 registro0500, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registro0500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getCod_nat_cc()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getInd_cta()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getNome_cta()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getCod_cta_ref()));
		sb.append("|").append(Util.preencheRegistro(registro0500.getCnpj_est()));
    	sb.append("|").append('\n');
		
		return sb;
	}
}
