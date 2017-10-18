/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoF;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroF550 {

	private final String reg = "F550";
	private String vl_rec_comp;
	private String cst_pis;
	private String vl_desc_pis;
	private String vl_bc_pis;
	private String aliq_pis_percentual;
	private String vl_pis;
	private String cst_cofins;
	private String vl_desc_cofins;
	private String vl_bc_cofins;
	private String aliq_cofins_percentual;
	private String vl_cofins;
	private String cod_mod;
	private String cfop;
	private String cod_cta;
	private String info_compl;
	private List<RegistroF559> registroF559;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the vl_rec_comp
	 */
	public String getVl_rec_comp() {
		return vl_rec_comp;
	}

	/**
	 * @return the cst_pis
	 */
	public String getCst_pis() {
		return cst_pis;
	}

	/**
	 * @return the vl_desc_pis
	 */
	public String getVl_desc_pis() {
		return vl_desc_pis;
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
	 * @return the vl_desc_cofins
	 */
	public String getVl_desc_cofins() {
		return vl_desc_cofins;
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
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}

	/**
	 * @return the cfop
	 */
	public String getCfop() {
		return cfop;
	}

	/**
	 * @return the cod_cta
	 */
	public String getCod_cta() {
		return cod_cta;
	}

	/**
	 * @return the info_compl
	 */
	public String getInfo_compl() {
		return info_compl;
	}

	/**
	 * @return the registroF559
	 */
	public List<RegistroF559> getRegistroF559() {
		if (registroF559 == null) {
			registroF559 = new ArrayList<RegistroF559>();
		}
		return registroF559;
	}

	/**
	 * @param vl_rec_comp
	 *            the vl_rec_comp to set
	 */
	public void setVl_rec_comp(String vl_rec_comp) {
		this.vl_rec_comp = vl_rec_comp;
	}

	/**
	 * @param cst_pis
	 *            the cst_pis to set
	 */
	public void setCst_pis(String cst_pis) {
		this.cst_pis = cst_pis;
	}

	/**
	 * @param vl_desc_pis
	 *            the vl_desc_pis to set
	 */
	public void setVl_desc_pis(String vl_desc_pis) {
		this.vl_desc_pis = vl_desc_pis;
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
	 * @param vl_desc_cofins
	 *            the vl_desc_cofins to set
	 */
	public void setVl_desc_cofins(String vl_desc_cofins) {
		this.vl_desc_cofins = vl_desc_cofins;
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
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @param cfop
	 *            the cfop to set
	 */
	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	/**
	 * @param cod_cta
	 *            the cod_cta to set
	 */
	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	/**
	 * @param info_compl
	 *            the info_compl to set
	 */
	public void setInfo_compl(String info_compl) {
		this.info_compl = info_compl;
	}

}
