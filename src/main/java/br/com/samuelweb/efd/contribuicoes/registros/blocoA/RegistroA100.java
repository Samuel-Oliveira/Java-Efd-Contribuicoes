/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroA100 {

	private final String reg = "A100";
	private String ind_oper;
	private String ind_emit;
	private String cod_part;
	private String cod_sit;
	private String ser;
	private String sub;
	private String num_doc;
	private String chv_nfse;
	private String dt_doc;
	private String dt_exe_serv;
	private String vl_doc;
	private String ind_pagto;
	private String vl_desc;
	private String vl_bc_pis;
	private String vl_pis;
	private String vl_bc_cofins;
	private String vl_cofins;
	private String vl_pis_ret;
	private String vl_cofins_ret;
	private String vl_iss;
	private List<RegistroA110> registroA110;
	private List<RegistroA111> registroA111;
	private List<RegistroA120> registroA120;
	private List<RegistroA170> registroA170;

	/**
	 * @return the ind_oper
	 */
	public String getInd_oper() {
		return ind_oper;
	}

	/**
	 * @param ind_oper
	 *            the ind_oper to set
	 */
	public void setInd_oper(String ind_oper) {
		this.ind_oper = ind_oper;
	}

	/**
	 * @return the ind_emit
	 */
	public String getInd_emit() {
		return ind_emit;
	}

	/**
	 * @param ind_emit
	 *            the ind_emit to set
	 */
	public void setInd_emit(String ind_emit) {
		this.ind_emit = ind_emit;
	}

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
	 * @return the chv_nfse
	 */
	public String getChv_nfse() {
		return chv_nfse;
	}

	/**
	 * @param chv_nfse
	 *            the chv_nfse to set
	 */
	public void setChv_nfse(String chv_nfse) {
		this.chv_nfse = chv_nfse;
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
	 * @return the dt_exe_serv
	 */
	public String getDt_exe_serv() {
		return dt_exe_serv;
	}

	/**
	 * @param dt_exe_serv
	 *            the dt_exe_serv to set
	 */
	public void setDt_exe_serv(String dt_exe_serv) {
		this.dt_exe_serv = dt_exe_serv;
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
	 * @return the ind_pagto
	 */
	public String getInd_pagto() {
		return ind_pagto;
	}

	/**
	 * @param ind_pagto
	 *            the ind_pagto to set
	 */
	public void setInd_pagto(String ind_pagto) {
		this.ind_pagto = ind_pagto;
	}

	/**
	 * @return the vl_desc
	 */
	public String getVl_desc() {
		return vl_desc;
	}

	/**
	 * @param vl_desc
	 *            the vl_desc to set
	 */
	public void setVl_desc(String vl_desc) {
		this.vl_desc = vl_desc;
	}

	/**
	 * @return the vl_bc_pis
	 */
	public String getVl_bc_pis() {
		return vl_bc_pis;
	}

	/**
	 * @param vl_bc_pis
	 *            the vl_bc_pis to set
	 */
	public void setVl_bc_pis(String vl_bc_pis) {
		this.vl_bc_pis = vl_bc_pis;
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
	 * @return the vl_bc_cofins
	 */
	public String getVl_bc_cofins() {
		return vl_bc_cofins;
	}

	/**
	 * @param vl_bc_cofins
	 *            the vl_bc_cofins to set
	 */
	public void setVl_bc_cofins(String vl_bc_cofins) {
		this.vl_bc_cofins = vl_bc_cofins;
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
	 * @return the vl_pis_ret
	 */
	public String getVl_pis_ret() {
		return vl_pis_ret;
	}

	/**
	 * @param vl_pis_ret
	 *            the vl_pis_ret to set
	 */
	public void setVl_pis_ret(String vl_pis_ret) {
		this.vl_pis_ret = vl_pis_ret;
	}

	/**
	 * @return the vl_cofins_ret
	 */
	public String getVl_cofins_ret() {
		return vl_cofins_ret;
	}

	/**
	 * @param vl_cofins_ret
	 *            the vl_cofins_ret to set
	 */
	public void setVl_cofins_ret(String vl_cofins_ret) {
		this.vl_cofins_ret = vl_cofins_ret;
	}

	/**
	 * @return the vl_iss
	 */
	public String getVl_iss() {
		return vl_iss;
	}

	/**
	 * @param vl_iss
	 *            the vl_iss to set
	 */
	public void setVl_iss(String vl_iss) {
		this.vl_iss = vl_iss;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroA110
	 */
	public List<RegistroA110> getRegistroA110() {
		if(registroA110 == null) {
			registroA110 = new ArrayList<RegistroA110>();
		}
		return registroA110;
	}

	/**
	 * @return the registroA111
	 */
	public List<RegistroA111> getRegistroA111() {
		if(registroA111 == null) {
			registroA111 = new ArrayList<RegistroA111>();
		}
		return registroA111;
	}

	/**
	 * @return the registroA120
	 */
	public List<RegistroA120> getRegistroA120() {
		if(registroA120 == null) {
			registroA120 = new ArrayList<RegistroA120>();
		}
		return registroA120;
	}

	/**
	 * @return the registroA170
	 */
	public List<RegistroA170> getRegistroA170() {
		if(registroA170 == null) {
			registroA170 = new ArrayList<RegistroA170>();
		}
		return registroA170;
	}

}
