/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.bo.blocoA;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoA.RegistroA100;
import br.com.swconsultoria.efd.contribuicoes.util.Util;

/**
 * @author Yuri Lemes
 *
 */
public class GerarRegistroA100 {

	public static StringBuilder gerar(RegistroA100 registroA100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroA100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getInd_oper()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getInd_emit()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getCod_part()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getCod_sit()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getSer()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getSub()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getNum_doc()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getChv_nfse()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getDt_doc()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getDt_exe_serv()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_doc()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getInd_pagto()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_desc()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_bc_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_pis()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_bc_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_cofins()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_pis_ret()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_cofins_ret()));
		sb.append("|").append(Util.preencheRegistro(registroA100.getVl_iss()));
		sb.append("|").append('\n');

		return sb;
	}
}
