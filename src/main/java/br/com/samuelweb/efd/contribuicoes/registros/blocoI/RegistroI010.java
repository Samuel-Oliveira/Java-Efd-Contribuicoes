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
public class RegistroI010 {

	private final String reg = "I010";
	private String cnpj;
	private String ind_ativ;
	private String info_compl;
	private List<RegistroI100> registroI100;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @return the ind_ativ
	 */
	public String getInd_ativ() {
		return ind_ativ;
	}

	/**
	 * @return the info_compl
	 */
	public String getInfo_compl() {
		return info_compl;
	}

	/**
	 * @return the registroI100
	 */
	public List<RegistroI100> getRegistroI100() {
		if (registroI100 == null) {
			registroI100 = new ArrayList<RegistroI100>();
		}
		return registroI100;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @param ind_ativ
	 *            the ind_ativ to set
	 */
	public void setInd_ativ(String ind_ativ) {
		this.ind_ativ = ind_ativ;
	}

	/**
	 * @param info_compl
	 *            the info_compl to set
	 */
	public void setInfo_compl(String info_compl) {
		this.info_compl = info_compl;
	}

}
