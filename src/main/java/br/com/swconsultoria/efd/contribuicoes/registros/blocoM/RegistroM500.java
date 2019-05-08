/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoM;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroM500 {

	private final String reg = "M500";
	private String cod_cred;
	private String ind_cred_ori;
	private String vl_bc_cofins;
	private String aliq_cofins_percentual;
	private String quant_bc_cofins;
	private String aliq_cofins_reais;
	private String vl_cred;
	private String vl_ajus_acres;
	private String vl_ajus_reduc;
	private String vl_cred_difer;
	private String vl_cred_disp;
	private String ind_desc_cred;
	private String vl_cred_desc;
	private String sld_cred;
	private List<RegistroM505> registroM505;
	private List<RegistroM510> registroM510;

	/**
	 * @return the cod_cred
	 */
	public String getCod_cred() {
		return cod_cred;
	}

	/**
	 * @param cod_cred
	 *            the cod_cred to set
	 */
	public void setCod_cred(String cod_cred) {
		this.cod_cred = cod_cred;
	}

	/**
	 * @return the ind_cred_ori
	 */
	public String getInd_cred_ori() {
		return ind_cred_ori;
	}

	/**
	 * @param ind_cred_ori
	 *            the ind_cred_ori to set
	 */
	public void setInd_cred_ori(String ind_cred_ori) {
		this.ind_cred_ori = ind_cred_ori;
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
	 * @return the aliq_cofins_percentual
	 */
	public String getAliq_cofins_percentual() {
		return aliq_cofins_percentual;
	}

	/**
	 * @param aliq_cofins_percentual
	 *            the aliq_cofins_percentual to set
	 */
	public void setAliq_cofins_percentual(String aliq_cofins_percentual) {
		this.aliq_cofins_percentual = aliq_cofins_percentual;
	}

	/**
	 * @return the quant_bc_cofins
	 */
	public String getQuant_bc_cofins() {
		return quant_bc_cofins;
	}

	/**
	 * @param quant_bc_cofins
	 *            the quant_bc_cofins to set
	 */
	public void setQuant_bc_cofins(String quant_bc_cofins) {
		this.quant_bc_cofins = quant_bc_cofins;
	}

	/**
	 * @return the aliq_cofins_reais
	 */
	public String getAliq_cofins_reais() {
		return aliq_cofins_reais;
	}

	/**
	 * @param aliq_cofins_reais
	 *            the aliq_cofins_reais to set
	 */
	public void setAliq_cofins_reais(String aliq_cofins_reais) {
		this.aliq_cofins_reais = aliq_cofins_reais;
	}

	/**
	 * @return the vl_cred
	 */
	public String getVl_cred() {
		return vl_cred;
	}

	/**
	 * @param vl_cred
	 *            the vl_cred to set
	 */
	public void setVl_cred(String vl_cred) {
		this.vl_cred = vl_cred;
	}

	/**
	 * @return the vl_ajus_acres
	 */
	public String getVl_ajus_acres() {
		return vl_ajus_acres;
	}

	/**
	 * @param vl_ajus_acres
	 *            the vl_ajus_acres to set
	 */
	public void setVl_ajus_acres(String vl_ajus_acres) {
		this.vl_ajus_acres = vl_ajus_acres;
	}

	/**
	 * @return the vl_ajus_reduc
	 */
	public String getVl_ajus_reduc() {
		return vl_ajus_reduc;
	}

	/**
	 * @param vl_ajus_reduc
	 *            the vl_ajus_reduc to set
	 */
	public void setVl_ajus_reduc(String vl_ajus_reduc) {
		this.vl_ajus_reduc = vl_ajus_reduc;
	}

	/**
	 * @return the vl_cred_difer
	 */
	public String getVl_cred_difer() {
		return vl_cred_difer;
	}

	/**
	 * @param vl_cred_difer
	 *            the vl_cred_difer to set
	 */
	public void setVl_cred_difer(String vl_cred_difer) {
		this.vl_cred_difer = vl_cred_difer;
	}

	/**
	 * @return the vl_cred_disp
	 */
	public String getVl_cred_disp() {
		return vl_cred_disp;
	}

	/**
	 * @param vl_cred_disp
	 *            the vl_cred_disp to set
	 */
	public void setVl_cred_disp(String vl_cred_disp) {
		this.vl_cred_disp = vl_cred_disp;
	}

	/**
	 * @return the ind_desc_cred
	 */
	public String getInd_desc_cred() {
		return ind_desc_cred;
	}

	/**
	 * @param ind_desc_cred
	 *            the ind_desc_cred to set
	 */
	public void setInd_desc_cred(String ind_desc_cred) {
		this.ind_desc_cred = ind_desc_cred;
	}

	/**
	 * @return the vl_cred_desc
	 */
	public String getVl_cred_desc() {
		return vl_cred_desc;
	}

	/**
	 * @param vl_cred_desc
	 *            the vl_cred_desc to set
	 */
	public void setVl_cred_desc(String vl_cred_desc) {
		this.vl_cred_desc = vl_cred_desc;
	}

	/**
	 * @return the sld_cred
	 */
	public String getSld_cred() {
		return sld_cred;
	}

	/**
	 * @param sld_cred
	 *            the sld_cred to set
	 */
	public void setSld_cred(String sld_cred) {
		this.sld_cred = sld_cred;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroM505
	 */
	public List<RegistroM505> getRegistroM505() {
		if (registroM505 == null) {
			registroM505 = new ArrayList<RegistroM505>();
		}
		return registroM505;
	}

	/**
	 * @return the registroM510
	 */
	public List<RegistroM510> getRegistroM510() {
		if (registroM510 == null) {
			registroM510 = new ArrayList<RegistroM510>();
		}
		return registroM510;
	}

}
