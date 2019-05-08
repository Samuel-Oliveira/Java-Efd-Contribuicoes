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
public class RegistroF120 {

	private final String reg = "F120";
	private String nat_bc_cred;
	private String ident_bem_imob;
	private String ind_orig_cred;
	private String ind_util_bem_imob;
	private String vl_oper_dep;
	private String parc_oper_nao_bc_cred;
	private String cst_pis;
	private String vl_bc_pis;
	private String aliq_pis_percentual;
	private String vl_pis;
	private String cst_cofins;
	private String vl_bc_cofins;
	private String aliq_cofins_percentual;
	private String vl_cofins;
	private String cod_cta;
	private String cod_ccus;
	private String desc_bem_imob;
	private List<RegistroF129> registroF129;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the nat_bc_cred
	 */
	public String getNat_bc_cred() {
		return nat_bc_cred;
	}

	/**
	 * @return the ident_bem_imob
	 */
	public String getIdent_bem_imob() {
		return ident_bem_imob;
	}

	/**
	 * @return the ind_orig_cred
	 */
	public String getInd_orig_cred() {
		return ind_orig_cred;
	}

	/**
	 * @return the ind_util_bem_imob
	 */
	public String getInd_util_bem_imob() {
		return ind_util_bem_imob;
	}

	/**
	 * @return the vl_oper_dep
	 */
	public String getVl_oper_dep() {
		return vl_oper_dep;
	}

	/**
	 * @return the parc_oper_nao_bc_cred
	 */
	public String getParc_oper_nao_bc_cred() {
		return parc_oper_nao_bc_cred;
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
	 * @return the aliq_pis_percentual
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
	 * @return the aliq_cofins_percentual
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
	 * @return the desc_bem_imob
	 */
	public String getDesc_bem_imob() {
		return desc_bem_imob;
	}

	/**
	 * @return the registroF129
	 */
	public List<RegistroF129> getRegistroF129() {
		if (registroF129 == null) {
			registroF129 = new ArrayList<RegistroF129>();
		}
		return registroF129;
	}

	/**
	 * @param nat_bc_cred
	 *            the nat_bc_cred to set
	 */
	public void setNat_bc_cred(String nat_bc_cred) {
		this.nat_bc_cred = nat_bc_cred;
	}

	/**
	 * @param ident_bem_imob
	 *            the ident_bem_imob to set
	 */
	public void setIdent_bem_imob(String ident_bem_imob) {
		this.ident_bem_imob = ident_bem_imob;
	}

	/**
	 * @param ind_orig_cred
	 *            the ind_orig_cred to set
	 */
	public void setInd_orig_cred(String ind_orig_cred) {
		this.ind_orig_cred = ind_orig_cred;
	}

	/**
	 * @param ind_util_bem_imob
	 *            the ind_util_bem_imob to set
	 */
	public void setInd_util_bem_imob(String ind_util_bem_imob) {
		this.ind_util_bem_imob = ind_util_bem_imob;
	}

	/**
	 * @param vl_oper_dep
	 *            the vl_oper_dep to set
	 */
	public void setVl_oper_dep(String vl_oper_dep) {
		this.vl_oper_dep = vl_oper_dep;
	}

	/**
	 * @param parc_oper_nao_bc_cred
	 *            the parc_oper_nao_bc_cred to set
	 */
	public void setParc_oper_nao_bc_cred(String parc_oper_nao_bc_cred) {
		this.parc_oper_nao_bc_cred = parc_oper_nao_bc_cred;
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
	 * @param desc_bem_imob
	 *            the desc_bem_imob to set
	 */
	public void setDesc_bem_imob(String desc_bem_imob) {
		this.desc_bem_imob = desc_bem_imob;
	}

}
