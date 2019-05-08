/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoF;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroF010 {

	private final String reg = "F010";
	private String cnpj;
	private List<RegistroF100> registroF100;
	private List<RegistroF120> registroF120;
	private List<RegistroF130> registroF130;
	private List<RegistroF150> registroF150;
	private List<RegistroF200> registroF200;
	private List<RegistroF500> registroF500;
	private List<RegistroF510> registroF510;
	private List<RegistroF525> registroF525;
	private List<RegistroF550> registroF550;
	private List<RegistroF560> registroF560;
	private List<RegistroF600> registroF600;
	private List<RegistroF700> registroF700;
	private List<RegistroF800> registroF800;

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
	 * @return the registroF100
	 */
	public List<RegistroF100> getRegistroF100() {
		if (registroF100 == null) {
			registroF100 = new ArrayList<RegistroF100>();
		}
		return registroF100;
	}

	/**
	 * @return the registroF120
	 */
	public List<RegistroF120> getRegistroF120() {
		if (registroF120 == null) {
			registroF120 = new ArrayList<RegistroF120>();
		}
		return registroF120;
	}

	/**
	 * @return the registroF130
	 */
	public List<RegistroF130> getRegistroF130() {
		if (registroF130 == null) {
			registroF130 = new ArrayList<RegistroF130>();
		}
		return registroF130;
	}

	/**
	 * @return the registroF150
	 */
	public List<RegistroF150> getRegistroF150() {
		if (registroF150 == null) {
			registroF150 = new ArrayList<RegistroF150>();
		}
		return registroF150;
	}

	/**
	 * @return the registroF200
	 */
	public List<RegistroF200> getRegistroF200() {
		if (registroF200 == null) {
			registroF200 = new ArrayList<RegistroF200>();
		}
		return registroF200;
	}

	/**
	 * @return the registroF500
	 */
	public List<RegistroF500> getRegistroF500() {
		if (registroF500 == null) {
			registroF500 = new ArrayList<RegistroF500>();
		}
		return registroF500;
	}

	/**
	 * @return the registroF510
	 */
	public List<RegistroF510> getRegistroF510() {
		if (registroF510 == null) {
			registroF510 = new ArrayList<RegistroF510>();
		}
		return registroF510;
	}

	/**
	 * @return the registroF525
	 */
	public List<RegistroF525> getRegistroF525() {
		if (registroF525 == null) {
			registroF525 = new ArrayList<RegistroF525>();
		}
		return registroF525;
	}

	/**
	 * @return the registroF550
	 */
	public List<RegistroF550> getRegistroF550() {
		if (registroF550 == null) {
			registroF550 = new ArrayList<RegistroF550>();
		}
		return registroF550;
	}

	/**
	 * @return the registroF560
	 */
	public List<RegistroF560> getRegistroF560() {
		if (registroF560 == null) {
			registroF560 = new ArrayList<RegistroF560>();
		}
		return registroF560;
	}

	/**
	 * @return the registroF600
	 */
	public List<RegistroF600> getRegistroF600() {
		if (registroF600 == null) {
			registroF600 = new ArrayList<RegistroF600>();
		}
		return registroF600;
	}

	/**
	 * @return the registroF700
	 */
	public List<RegistroF700> getRegistroF700() {
		if (registroF700 == null) {
			registroF700 = new ArrayList<RegistroF700>();
		}
		return registroF700;
	}

	/**
	 * @return the registroF800
	 */
	public List<RegistroF800> getRegistroF800() {
		if (registroF800 == null) {
			registroF800 = new ArrayList<RegistroF800>();
		}
		return registroF800;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
