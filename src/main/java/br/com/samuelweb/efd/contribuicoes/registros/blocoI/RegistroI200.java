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
public class RegistroI200 {

	private final String reg = "I200";
	private String num_campo;
	private String cod_det;
	private String det_valor;
	private String cod_cta;
	private String info_compl;
	private List<RegistroI299> registroI299;
	private List<RegistroI300> registroI300;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the num_campo
	 */
	public String getNum_campo() {
		return num_campo;
	}

	/**
	 * @return the cod_det
	 */
	public String getCod_det() {
		return cod_det;
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
	 * @return the registroI299
	 */
	public List<RegistroI299> getRegistroI299() {
		if (registroI299 == null) {
			registroI299 = new ArrayList<RegistroI299>();
		}
		return registroI299;
	}

	/**
	 * @return the registroI300
	 */
	public List<RegistroI300> getRegistroI300() {
		if (registroI300 == null) {
			registroI300 = new ArrayList<RegistroI300>();
		}
		return registroI300;
	}

	/**
	 * @param num_campo
	 *            the num_campo to set
	 */
	public void setNum_campo(String num_campo) {
		this.num_campo = num_campo;
	}

	/**
	 * @param cod_det
	 *            the cod_det to set
	 */
	public void setCod_det(String cod_det) {
		this.cod_det = cod_det;
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
