/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroC380 {

	private final String reg = "C380";
	private String cod_mod;
	private String dt_doc_ini;
	private String dt_cod_fin;
	private String num_doc_ini;
	private String num_doc_fin;
	private String vl_doc;
	private String vl_doc_canc;
	private List<RegistroC381> registroC381;
	private List<RegistroC385> registroC385;

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
	 * @return the dt_cod_fin
	 */
	public String getDt_cod_fin() {
		return dt_cod_fin;
	}

	/**
	 * @param dt_cod_fin
	 *            the dt_cod_fin to set
	 */
	public void setDt_cod_fin(String dt_cod_fin) {
		this.dt_cod_fin = dt_cod_fin;
	}

	/**
	 * @return the num_doc_ini
	 */
	public String getNum_doc_ini() {
		return num_doc_ini;
	}

	/**
	 * @param num_doc_ini
	 *            the num_doc_ini to set
	 */
	public void setNum_doc_ini(String num_doc_ini) {
		this.num_doc_ini = num_doc_ini;
	}

	/**
	 * @return the num_doc_fin
	 */
	public String getNum_doc_fin() {
		return num_doc_fin;
	}

	/**
	 * @param num_doc_fin
	 *            the num_doc_fin to set
	 */
	public void setNum_doc_fin(String num_doc_fin) {
		this.num_doc_fin = num_doc_fin;
	}

	/**
	 * @return the vl_doc
	 */
	public String getVl_doc() {
		return vl_doc;
	}

	/**
	 * @param vl_doc
	 *            the vl_doc to set
	 */
	public void setVl_doc(String vl_doc) {
		this.vl_doc = vl_doc;
	}

	/**
	 * @return the vl_doc_canc
	 */
	public String getVl_doc_canc() {
		return vl_doc_canc;
	}

	/**
	 * @param vl_doc_canc
	 *            the vl_doc_canc to set
	 */
	public void setVl_doc_canc(String vl_doc_canc) {
		this.vl_doc_canc = vl_doc_canc;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC381
	 */
	public List<RegistroC381> getRegistroC381() {
		if(registroC381 == null) {
			registroC381 = new ArrayList<RegistroC381>();
		}
		return registroC381;
	}

	/**
	 * @return the registroC385
	 */
	public List<RegistroC385> getRegistroC385() {
		if(registroC385 == null) {
			registroC385 = new ArrayList<RegistroC385>();
		}
		return registroC385;
	}

}
