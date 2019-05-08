/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroD600 {

	private final String reg = "D600";
	private String cod_mod;
	private String cod_mun;
	private String ser;
	private String sub;
	private String ind_rec;
	private String qtd_cons;
	private String dt_doc_ini;
	private String dt_doc_fin;
	private String vl_doc;
	private String vl_desc;
	private String vl_serv;
	private String vl_serv_nt;
	private String vl_terc;
	private String vl_da;
	private String vl_bc_icms;
	private String vl_icms;
	private String vl_pis;
	private String vl_cofins;
	private List<RegistroD601> registroD601;
	private List<RegistroD605> registroD605;
	private List<RegistroD609> registroD609;

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
	 * @return the cod_mun
	 */
	public String getCod_mun() {
		return cod_mun;
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
	 * @return the ind_rec
	 */
	public String getInd_rec() {
		return ind_rec;
	}

	/**
	 * @return the qtd_cons
	 */
	public String getQtd_cons() {
		return qtd_cons;
	}

	/**
	 * @return the dt_doc_ini
	 */
	public String getDt_doc_ini() {
		return dt_doc_ini;
	}

	/**
	 * @return the dt_doc_fin
	 */
	public String getDt_doc_fin() {
		return dt_doc_fin;
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
	 * @return the vl_serv
	 */
	public String getVl_serv() {
		return vl_serv;
	}

	/**
	 * @return the vl_serv_nt
	 */
	public String getVl_serv_nt() {
		return vl_serv_nt;
	}

	/**
	 * @return the vl_terc
	 */
	public String getVl_terc() {
		return vl_terc;
	}

	/**
	 * @return the vl_da
	 */
	public String getVl_da() {
		return vl_da;
	}

	/**
	 * @return the vl_bc_icms
	 */
	public String getVl_bc_icms() {
		return vl_bc_icms;
	}

	/**
	 * @return the vl_icms
	 */
	public String getVl_icms() {
		return vl_icms;
	}

	/**
	 * @return the vl_pis
	 */
	public String getVl_pis() {
		return vl_pis;
	}

	/**
	 * @return the vl_cofins
	 */
	public String getVl_cofins() {
		return vl_cofins;
	}

	/**
	 * @return the registroD601
	 */
	public List<RegistroD601> getRegistroD601() {
		if (registroD601 == null) {
			registroD601 = new ArrayList<RegistroD601>();
		}
		return registroD601;
	}

	/**
	 * @return the registroD605
	 */
	public List<RegistroD605> getRegistroD605() {
		if (registroD605 == null) {
			registroD605 = new ArrayList<RegistroD605>();
		}
		return registroD605;
	}

	/**
	 * @return the registroD609
	 */
	public List<RegistroD609> getRegistroD609() {
		if (registroD609 == null) {
			registroD609 = new ArrayList<RegistroD609>();
		}
		return registroD609;
	}

	/**
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @param cod_mun
	 *            the cod_mun to set
	 */
	public void setCod_mun(String cod_mun) {
		this.cod_mun = cod_mun;
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
	 * @param ind_rec
	 *            the ind_rec to set
	 */
	public void setInd_rec(String ind_rec) {
		this.ind_rec = ind_rec;
	}

	/**
	 * @param qtd_cons
	 *            the qtd_cons to set
	 */
	public void setQtd_cons(String qtd_cons) {
		this.qtd_cons = qtd_cons;
	}

	/**
	 * @param dt_doc_ini
	 *            the dt_doc_ini to set
	 */
	public void setDt_doc_ini(String dt_doc_ini) {
		this.dt_doc_ini = dt_doc_ini;
	}

	/**
	 * @param dt_doc_fin
	 *            the dt_doc_fin to set
	 */
	public void setDt_doc_fin(String dt_doc_fin) {
		this.dt_doc_fin = dt_doc_fin;
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

	/**
	 * @param vl_serv
	 *            the vl_serv to set
	 */
	public void setVl_serv(String vl_serv) {
		this.vl_serv = vl_serv;
	}

	/**
	 * @param vl_serv_nt
	 *            the vl_serv_nt to set
	 */
	public void setVl_serv_nt(String vl_serv_nt) {
		this.vl_serv_nt = vl_serv_nt;
	}

	/**
	 * @param vl_terc
	 *            the vl_terc to set
	 */
	public void setVl_terc(String vl_terc) {
		this.vl_terc = vl_terc;
	}

	/**
	 * @param vl_da
	 *            the vl_da to set
	 */
	public void setVl_da(String vl_da) {
		this.vl_da = vl_da;
	}

	/**
	 * @param vl_bc_icms
	 *            the vl_bc_icms to set
	 */
	public void setVl_bc_icms(String vl_bc_icms) {
		this.vl_bc_icms = vl_bc_icms;
	}

	/**
	 * @param vl_icms
	 *            the vl_icms to set
	 */
	public void setVl_icms(String vl_icms) {
		this.vl_icms = vl_icms;
	}

	/**
	 * @param vl_pis
	 *            the vl_pis to set
	 */
	public void setVl_pis(String vl_pis) {
		this.vl_pis = vl_pis;
	}

	/**
	 * @param vl_cofins
	 *            the vl_cofins to set
	 */
	public void setVl_cofins(String vl_cofins) {
		this.vl_cofins = vl_cofins;
	}

}
