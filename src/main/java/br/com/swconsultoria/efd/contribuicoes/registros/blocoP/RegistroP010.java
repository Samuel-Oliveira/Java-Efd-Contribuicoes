/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoP;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroP010 {

	private final String reg = "P010";
	private String cnpj;
	private List<RegistroP100> registroP100;
	private List<RegistroP200> registroP200;

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
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroP100
	 */
	public List<RegistroP100> getRegistroP100() {
		if (registroP100 == null) {
			registroP100 = new ArrayList<RegistroP100>();
		}
		return registroP100;
	}

	/**
	 * @return the registroP200
	 */
	public List<RegistroP200> getRegistroP200() {
		if (registroP200 == null) {
			registroP200 = new ArrayList<RegistroP200>();
		}
		return registroP200;
	}

}
