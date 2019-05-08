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
public class RegistroF100 {

	private final String reg = "F100";
	private String ind_oper;
	private String cod_part;
	private String cod_item;
	private String dt_oper;
	private String vl_oper;
	private String cst_pis;
	private String vl_bc_pis;
	private String aliq_pis_percentual;
	private String vl_pis;
	private String cst_cofins;
	private String vl_bc_cofins;
	private String aliq_cofins_percentual;
	private String vl_cofins;
	private String nat_bc_cred;
	private String ind_orig_cred;
	private String cod_cta;
	private String cod_ccus;
	private String desc_doc_oper;
	private List<RegistroF111> registroF111;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the ind_oper
	 */
	public String getInd_oper() {
		return ind_oper;
	}

	/**
	 * @return the cod_part
	 */
	public String getCod_part() {
		return cod_part;
	}

	/**
	 * @return the cod_item
	 */
	public String getCod_item() {
		return cod_item;
	}

	/**
	 * @return the dt_oper
	 */
	public String getDt_oper() {
		return dt_oper;
	}

	/**
	 * @return the vl_oper
	 */
	public String getVl_oper() {
		return vl_oper;
	}

	/**
	 * @return the cst_pis
	 */
	public String getCst_pis() {
		return cst_pis;
	}

	/**
	 * @return the vl_bc_pis
	 */
	public String getVl_bc_pis() {
		return vl_bc_pis;
	}

	/**
	 * @return the aliq_pis
	 */
	public String getAliq_pis_percentual() {
		return aliq_pis_percentual;
	}

	/**
	 * @return the vl_pis
	 */
	public String getVl_pis() {
		return vl_pis;
	}

	/**
	 * @return the cst_cofins
	 */
	public String getCst_cofins() {
		return cst_cofins;
	}

	/**
	 * @return the vl_bc_cofins
	 */
	public String getVl_bc_cofins() {
		return vl_bc_cofins;
	}

	/**
	 * @return the aliq_cofins
	 */
	public String getAliq_cofins_percentual() {
		return aliq_cofins_percentual;
	}

	/**
	 * @return the vl_cofins
	 */
	public String getVl_cofins() {
		return vl_cofins;
	}

	/**
	 * @return the nat_bc_cred
	 */
	public String getNat_bc_cred() {
		return nat_bc_cred;
	}

	/**
	 * @return the ind_orig_cred
	 */
	public String getInd_orig_cred() {
		return ind_orig_cred;
	}

	/**
	 * @return the cod_cta
	 */
	public String getCod_cta() {
		return cod_cta;
	}

	/**
	 * @return the cod_ccus
	 */
	public String getCod_ccus() {
		return cod_ccus;
	}

	/**
	 * @return the desc_doc_oper
	 */
	public String getDesc_doc_oper() {
		return desc_doc_oper;
	}

	/**
	 * @return the registroF111
	 */
	public List<RegistroF111> getRegistroF111() {
		if (registroF111 == null) {
			registroF111 = new ArrayList<RegistroF111>();
		}
		return registroF111;
	}

	/**
	 * @param ind_oper
	 *            the ind_oper to set
	 */
	public void setInd_oper(String ind_oper) {
		this.ind_oper = ind_oper;
	}

	/**
	 * @param cod_part
	 *            the cod_part to set
	 */
	public void setCod_part(String cod_part) {
		this.cod_part = cod_part;
	}

	/**
	 * @param cod_item
	 *            the cod_item to set
	 */
	public void setCod_item(String cod_item) {
		this.cod_item = cod_item;
	}

	/**
	 * @param dt_oper
	 *            the dt_oper to set
	 */
	public void setDt_oper(String dt_oper) {
		this.dt_oper = dt_oper;
	}

	/**
	 * @param vl_oper
	 *            the vl_oper to set
	 */
	public void setVl_oper(String vl_oper) {
		this.vl_oper = vl_oper;
	}

	/**
	 * @param cst_pis
	 *            the cst_pis to set
	 */
	public void setCst_pis(String cst_pis) {
		this.cst_pis = cst_pis;
	}

	/**
	 * @param vl_bc_pis
	 *            the vl_bc_pis to set
	 */
	public void setVl_bc_pis(String vl_bc_pis) {
		this.vl_bc_pis = vl_bc_pis;
	}

	/**
	 * @param aliq_pis_percentual
	 *            the aliq_pis_percentual to set
	 */
	public void setAliq_pis_percentual(String aliq_pis_percentual) {
		this.aliq_pis_percentual = aliq_pis_percentual;
	}

	/**
	 * @param vl_pis
	 *            the vl_pis to set
	 */
	public void setVl_pis(String vl_pis) {
		this.vl_pis = vl_pis;
	}

	/**
	 * @param cst_cofins
	 *            the cst_cofins to set
	 */
	public void setCst_cofins(String cst_cofins) {
		this.cst_cofins = cst_cofins;
	}

	/**
	 * @param vl_bc_cofins
	 *            the vl_bc_cofins to set
	 */
	public void setVl_bc_cofins(String vl_bc_cofins) {
		this.vl_bc_cofins = vl_bc_cofins;
	}

	/**
	 * @param aliq_cofins_percentual
	 *            the aliq_cofins_percentual to set
	 */
	public void setAliq_cofins_percentual(String aliq_cofins_percentual) {
		this.aliq_cofins_percentual = aliq_cofins_percentual;
	}

	/**
	 * @param vl_cofins
	 *            the vl_cofins to set
	 */
	public void setVl_cofins(String vl_cofins) {
		this.vl_cofins = vl_cofins;
	}

	/**
	 * @param nat_bc_cred
	 *            the nat_bc_cred to set
	 */
	public void setNat_bc_cred(String nat_bc_cred) {
		this.nat_bc_cred = nat_bc_cred;
	}

	/**
	 * @param ind_orig_cred
	 *            the ind_orig_cred to set
	 */
	public void setInd_orig_cred(String ind_orig_cred) {
		this.ind_orig_cred = ind_orig_cred;
	}

	/**
	 * @param cod_cta
	 *            the cod_cta to set
	 */
	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	/**
	 * @param cod_ccus
	 *            the cod_ccus to set
	 */
	public void setCod_ccus(String cod_ccus) {
		this.cod_ccus = cod_ccus;
	}

	/**
	 * @param desc_doc_oper
	 *            the desc_doc_oper to set
	 */
	public void setDesc_doc_oper(String desc_doc_oper) {
		this.desc_doc_oper = desc_doc_oper;
	}

}
