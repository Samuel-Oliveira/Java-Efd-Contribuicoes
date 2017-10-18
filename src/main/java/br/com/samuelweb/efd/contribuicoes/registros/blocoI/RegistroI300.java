/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroI300 {

	private final String reg = "I300";
	private String cod_comp;
	private String det_valor;
	private String cod_cta;
	private String info_compl;
	private List<RegistroI399> registroI399;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the cod_comp
	 */
	public String getCod_comp() {
		return cod_comp;
	}

	/**
	 * @return the det_valor
	 */
	public String getDet_valor() {
		return det_valor;
	}

	/**
	 * @return the cod_cta
	 */
	public String getCod_cta() {
		return cod_cta;
	}

	/**
	 * @return the info_compl
	 */
	public String getInfo_compl() {
		return info_compl;
	}

	/**
	 * @return the registroI399
	 */
	public List<RegistroI399> getRegistroI399() {
		if (registroI399 == null) {
			registroI399 = new ArrayList<RegistroI399>();
		}
		return registroI399;
	}

	/**
	 * @param cod_comp
	 *            the cod_comp to set
	 */
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}

	/**
	 * @param det_valor
	 *            the det_valor to set
	 */
	public void setDet_valor(String det_valor) {
		this.det_valor = det_valor;
	}

	/**
	 * @param cod_cta
	 *            the cod_cta to set
	 */
	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	/**
	 * @param info_compl
	 *            the info_compl to set
	 */
	public void setInfo_compl(String info_compl) {
		this.info_compl = info_compl;
	}

}
