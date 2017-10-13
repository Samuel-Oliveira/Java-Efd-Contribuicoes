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
public class RegistroD200 {

	private final String reg = "D200";
	private String cod_mod;
	private String cod_sit;
	private String ser;
	private String sub;
	private String num_doc_ini;
	private String num_doc_fin;
	private String cfop;
	private String dt_ref;
	private String vl_doc;
	private String vl_desc;
	private List<RegistroD201> registroD201;
	private List<RegistroD205> registroD205;
	private List<RegistroD209> registroD209;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}

	/**
	 * @return the cod_sit
	 */
	public String getCod_sit() {
		return cod_sit;
	}

	/**
	 * @return the ser
	 */
	public String getSer() {
		return ser;
	}

	/**
	 * @return the sub
	 */
	public String getSub() {
		return sub;
	}

	/**
	 * @return the num_doc_ini
	 */
	public String getNum_doc_ini() {
		return num_doc_ini;
	}

	/**
	 * @return the num_doc_fin
	 */
	public String getNum_doc_fin() {
		return num_doc_fin;
	}

	/**
	 * @return the cfop
	 */
	public String getCfop() {
		return cfop;
	}

	/**
	 * @return the dt_ref
	 */
	public String getDt_ref() {
		return dt_ref;
	}

	/**
	 * @return the vl_doc
	 */
	public String getVl_doc() {
		return vl_doc;
	}

	/**
	 * @return the vl_desc
	 */
	public String getVl_desc() {
		return vl_desc;
	}

	/**
	 * @return the registroD201
	 */
	public List<RegistroD201> getRegistroD201() {
		if (registroD201 == null) {
			registroD201 = new ArrayList<RegistroD201>();
		}
		return registroD201;
	}

	/**
	 * @return the registroD205
	 */
	public List<RegistroD205> getRegistroD205() {
		if (registroD205 == null) {
			registroD205 = new ArrayList<RegistroD205>();
		}
		return registroD205;
	}

	/**
	 * @return the registroD209
	 */
	public List<RegistroD209> getRegistroD209() {
		if (registroD209 == null) {
			registroD209 = new ArrayList<RegistroD209>();
		}
		return registroD209;
	}

	/**
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @param cod_sit
	 *            the cod_sit to set
	 */
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}

	/**
	 * @param ser
	 *            the ser to set
	 */
	public void setSer(String ser) {
		this.ser = ser;
	}

	/**
	 * @param sub
	 *            the sub to set
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}

	/**
	 * @param num_doc_ini
	 *            the num_doc_ini to set
	 */
	public void setNum_doc_ini(String num_doc_ini) {
		this.num_doc_ini = num_doc_ini;
	}

	/**
	 * @param num_doc_fin
	 *            the num_doc_fin to set
	 */
	public void setNum_doc_fin(String num_doc_fin) {
		this.num_doc_fin = num_doc_fin;
	}

	/**
	 * @param cfop
	 *            the cfop to set
	 */
	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	/**
	 * @param dt_ref
	 *            the dt_ref to set
	 */
	public void setDt_ref(String dt_ref) {
		this.dt_ref = dt_ref;
	}

	/**
	 * @param vl_doc
	 *            the vl_doc to set
	 */
	public void setVl_doc(String vl_doc) {
		this.vl_doc = vl_doc;
	}

	/**
	 * @param vl_desc
	 *            the vl_desc to set
	 */
	public void setVl_desc(String vl_desc) {
		this.vl_desc = vl_desc;
	}

}
