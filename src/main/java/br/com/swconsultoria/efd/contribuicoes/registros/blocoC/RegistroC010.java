/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroC010 {

	private final String reg = "C010";
	private String cnpj;
	private String ind_escri;
	private List<RegistroC100> registroC100;
	private List<RegistroC180> registroC180;
	private List<RegistroC190> registroC190;
	private List<RegistroC380> registroC380;
	private List<RegistroC395> registroC395;
	private List<RegistroC400> registroC400;
	private List<RegistroC490> registroC490;
	private List<RegistroC500> registroC500;
	private List<RegistroC600> registroC600;
	private List<RegistroC800> registroC800;
	private List<RegistroC860> registroC860;

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the ind_escri
	 */
	public String getInd_escri() {
		return ind_escri;
	}

	/**
	 * @param ind_escri
	 *            the ind_escri to set
	 */
	public void setInd_escri(String ind_escri) {
		this.ind_escri = ind_escri;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC100
	 */
	public List<RegistroC100> getRegistroC100() {
		if (registroC100 == null) {
			registroC100 = new ArrayList<RegistroC100>();
		}
		return registroC100;
	}

	/**
	 * @return the registroC180
	 */
	public List<RegistroC180> getRegistroC180() {
		if (registroC180 == null) {
			registroC180 = new ArrayList<RegistroC180>();
		}
		return registroC180;
	}

	/**
	 * @return the registroC190
	 */
	public List<RegistroC190> getRegistroC190() {
		if (registroC190 == null) {
			registroC190 = new ArrayList<RegistroC190>();
		}
		return registroC190;
	}

	/**
	 * @return the registroC380
	 */
	public List<RegistroC380> getRegistroC380() {
		if (registroC380 == null) {
			registroC380 = new ArrayList<RegistroC380>();
		}
		return registroC380;
	}

	/**
	 * @return the registroC395
	 */
	public List<RegistroC395> getRegistroC395() {
		if (registroC395 == null) {
			registroC395 = new ArrayList<RegistroC395>();
		}
		return registroC395;
	}

	/**
	 * @return the registroC400
	 */
	public List<RegistroC400> getRegistroC400() {
		if (registroC400 == null) {
			registroC400 = new ArrayList<RegistroC400>();
		}
		return registroC400;
	}

	/**
	 * @return the registroC490
	 */
	public List<RegistroC490> getRegistroC490() {
		if (registroC490 == null) {
			registroC490 = new ArrayList<RegistroC490>();
		}
		return registroC490;
	}

	/**
	 * @return the registroC500
	 */
	public List<RegistroC500> getRegistroC500() {
		if (registroC500 == null) {
			registroC500 = new ArrayList<RegistroC500>();
		}
		return registroC500;
	}

	/**
	 * @return the registroC600
	 */
	public List<RegistroC600> getRegistroC600() {
		if (registroC600 == null) {
			registroC600 = new ArrayList<RegistroC600>();
		}
		return registroC600;
	}

	/**
	 * @return the registroC800
	 */
	public List<RegistroC800> getRegistroC800() {
		if (registroC800 == null) {
			registroC800 = new ArrayList<RegistroC800>();
		}
		return registroC800;
	}

	/**
	 * @return the registroC860
	 */
	public List<RegistroC860> getRegistroC860() {
		if (registroC860 == null) {
			registroC860 = new ArrayList<RegistroC860>();
		}
		return registroC860;
	}

}
