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
public class RegistroC500 {

	private final String reg = "C500";
	private String cod_part;
	private String cod_mod;
	private String cod_sit;
	private String ser;
	private String sub;
	private String num_doc;
	private String dt_doc;
	private String dt_ent;
	private String vl_doc;
	private String vl_icms;
	private String cod_inf;
	private String vl_pis;
	private String vl_cofins;
	private String chv_doc_e;
	private List<RegistroC501> registroC501;
	private List<RegistroC505> registroC505;
	private List<RegistroC509> registroC509;

	/**
	 * @return the cod_part
	 */
	public String getCod_part() {
		return cod_part;
	}

	/**
	 * @param cod_part
	 *            the cod_part to set
	 */
	public void setCod_part(String cod_part) {
		this.cod_part = cod_part;
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
	 * @return the cod_sit
	 */
	public String getCod_sit() {
		return cod_sit;
	}

	/**
	 * @param cod_sit
	 *            the cod_sit to set
	 */
	public void setCod_sit(String cod_sit) {
		this.cod_sit = cod_sit;
	}

	/**
	 * @return the ser
	 */
	public String getSer() {
		return ser;
	}

	/**
	 * @param ser
	 *            the ser to set
	 */
	public void setSer(String ser) {
		this.ser = ser;
	}

	/**
	 * @return the sub
	 */
	public String getSub() {
		return sub;
	}

	/**
	 * @param sub
	 *            the sub to set
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}

	/**
	 * @return the num_doc
	 */
	public String getNum_doc() {
		return num_doc;
	}

	/**
	 * @param num_doc
	 *            the num_doc to set
	 */
	public void setNum_doc(String num_doc) {
		this.num_doc = num_doc;
	}

	/**
	 * @return the dt_doc
	 */
	public String getDt_doc() {
		return dt_doc;
	}

	/**
	 * @param dt_doc
	 *            the dt_doc to set
	 */
	public void setDt_doc(String dt_doc) {
		this.dt_doc = dt_doc;
	}

	/**
	 * @return the dt_ent
	 */
	public String getDt_ent() {
		return dt_ent;
	}

	/**
	 * @param dt_ent
	 *            the dt_ent to set
	 */
	public void setDt_ent(String dt_ent) {
		this.dt_ent = dt_ent;
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
	 * @return the vl_icms
	 */
	public String getVl_icms() {
		return vl_icms;
	}

	/**
	 * @param vl_icms
	 *            the vl_icms to set
	 */
	public void setVl_icms(String vl_icms) {
		this.vl_icms = vl_icms;
	}

	/**
	 * @return the cod_inf
	 */
	public String getCod_inf() {
		return cod_inf;
	}

	/**
	 * @param cod_inf
	 *            the cod_inf to set
	 */
	public void setCod_inf(String cod_inf) {
		this.cod_inf = cod_inf;
	}

	/**
	 * @return the vl_pis
	 */
	public String getVl_pis() {
		return vl_pis;
	}

	/**
	 * @param vl_pis
	 *            the vl_pis to set
	 */
	public void setVl_pis(String vl_pis) {
		this.vl_pis = vl_pis;
	}

	/**
	 * @return the vl_cofins
	 */
	public String getVl_cofins() {
		return vl_cofins;
	}

	/**
	 * @param vl_cofins
	 *            the vl_cofins to set
	 */
	public void setVl_cofins(String vl_cofins) {
		this.vl_cofins = vl_cofins;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC501
	 */
	public List<RegistroC501> getRegistroC501() {
		if (registroC501 == null) {
			registroC501 = new ArrayList<RegistroC501>();
		}
		return registroC501;
	}

	/**
	 * @return the registroC505
	 */
	public List<RegistroC505> getRegistroC505() {
		if (registroC505 == null) {
			registroC505 = new ArrayList<RegistroC505>();
		}
		return registroC505;
	}

	public String getChv_doc_e() {
		return chv_doc_e;
	}

	public void setChv_doc_e(String chv_doc_e) {
		this.chv_doc_e = chv_doc_e;
	}

	/**
	 * @return the registroC509
	 */
	public List<RegistroC509> getRegistroC509() {
		if (registroC509 == null) {
			registroC509 = new ArrayList<RegistroC509>();
		}
		return registroC509;
	}

}
