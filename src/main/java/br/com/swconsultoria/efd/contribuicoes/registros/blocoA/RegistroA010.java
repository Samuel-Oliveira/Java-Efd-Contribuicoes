/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroA010 {

	private final String reg = "A010";
	private String cnpj;
	private List<RegistroA100> registroA100;

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
	 * @return the registroA100
	 */
	public List<RegistroA100> getRegistroA100() {
		if (registroA100 == null) {
			registroA100 = new ArrayList<RegistroA100>();
		}
		return registroA100;
	}

}
