/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroD010 {

	private final String reg = "D010";
	private String cnpj;
	private List<RegistroD100> registroD100;
	private List<RegistroD200> registroD200;
	private List<RegistroD300> registroD300;
	private List<RegistroD350> registroD350;
	private List<RegistroD500> registroD500;
	private List<RegistroD600> registroD600;

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
	 * @return the registroD100
	 */
	public List<RegistroD100> getRegistroD100() {
		if(registroD100 == null){
			registroD100 = new ArrayList<RegistroD100>();
		}
		return registroD100;
	}

	/**
	 * @return the registroD200
	 */
	public List<RegistroD200> getRegistroD200() {
		if(registroD200 == null){
			registroD200 = new ArrayList<RegistroD200>();
		}
		return registroD200;
	}

	/**
	 * @return the registroD300
	 */
	public List<RegistroD300> getRegistroD300() {
		if(registroD300 == null){
			registroD300 = new ArrayList<RegistroD300>();
		}
		return registroD300;
	}

	/**
	 * @return the registroD350
	 */
	public List<RegistroD350> getRegistroD350() {
		if(registroD350 == null){
			registroD350 = new ArrayList<RegistroD350>();
		}
		return registroD350;
	}

	/**
	 * @return the registroD500
	 */
	public List<RegistroD500> getRegistroD500() {
		if(registroD500 == null){
			registroD500 = new ArrayList<RegistroD500>();
		}
		return registroD500;
	}

	/**
	 * @return the registroD600
	 */
	public List<RegistroD600> getRegistroD600() {
		if(registroD600 == null){
			registroD600 = new ArrayList<RegistroD600>();
		}
		return registroD600;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
