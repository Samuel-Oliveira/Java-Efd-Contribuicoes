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
public class RegistroC490 {

	private final String reg = "C490";
	private String dt_doc_ini;
	private String dt_doc_fin;
	private String cod_mod;
	private List<RegistroC491> registroC491;
	private List<RegistroC495> registroC495;
	private List<RegistroC499> registroC499;

	/**
	 * @return the dt_doc_ini
	 */
	public String getDt_doc_ini() {
		return dt_doc_ini;
	}

	/**
	 * @param dt_doc_ini
	 *            the dt_doc_ini to set
	 */
	public void setDt_doc_ini(String dt_doc_ini) {
		this.dt_doc_ini = dt_doc_ini;
	}

	/**
	 * @return the dt_doc_fin
	 */
	public String getDt_doc_fin() {
		return dt_doc_fin;
	}

	/**
	 * @param dt_doc_fin
	 *            the dt_doc_fin to set
	 */
	public void setDt_doc_fin(String dt_doc_fin) {
		this.dt_doc_fin = dt_doc_fin;
	}

	/**
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}

	/**
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC491
	 */
	public List<RegistroC491> getRegistroC491() {
		if(registroC491 == null) {
			registroC491 = new ArrayList<RegistroC491>();
		}
		return registroC491;
	}

	/**
	 * @return the registroC495
	 */
	public List<RegistroC495> getRegistroC495() {
		if(registroC495 == null) {
			registroC495 = new ArrayList<RegistroC495>();
		}
		return registroC495;
	}

	/**
	 * @return the registroC499
	 */
	public List<RegistroC499> getRegistroC499() {
		if(registroC499 == null) {
			registroC499 = new ArrayList<RegistroC499>();
		}
		return registroC499;
	}

}
