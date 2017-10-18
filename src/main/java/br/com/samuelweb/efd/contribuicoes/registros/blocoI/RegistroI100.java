/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroI100 {

	private final String reg = "I100";
	private String vl_rec;
	private String cst_pis_cofins;
	private String vl_tot_ded_ger;
	private String vl_tot_ded_esp;
	private String vl_bc_pis;
	private String aliq_pis_percentual;
	private String vl_pis;
	private String vl_bc_cofins;
	private String aliq_cofins_percentual;
	private String vl_cofins;
	private String info_compl;
	private List<RegistroI199> registroI199;
	private List<RegistroI200> registroI200;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the vl_rec
	 */
	public String getVl_rec() {
		return vl_rec;
	}

	/**
	 * @return the cst_pis_cofins
	 */
	public String getCst_pis_cofins() {
		return cst_pis_cofins;
	}

	/**
	 * @return the vl_tot_ded_ger
	 */
	public String getVl_tot_ded_ger() {
		return vl_tot_ded_ger;
	}

	/**
	 * @return the vl_tot_ded_esp
	 */
	public String getVl_tot_ded_esp() {
		return vl_tot_ded_esp;
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
	 * @return the info_compl
	 */
	public String getInfo_compl() {
		return info_compl;
	}

	/**
	 * @return the registroI199
	 */
	public List<RegistroI199> getRegistroI199() {
		if (registroI199 == null) {
			registroI199 = new ArrayList<RegistroI199>();
		}
		return registroI199;
	}

	/**
	 * @return the registroI200
	 */
	public List<RegistroI200> getRegistroI200() {
		if (registroI200 == null) {
			registroI200 = new ArrayList<RegistroI200>();
		}
		return registroI200;
	}

	/**
	 * @param vl_rec
	 *            the vl_rec to set
	 */
	public void setVl_rec(String vl_rec) {
		this.vl_rec = vl_rec;
	}

	/**
	 * @param cst_pis_cofins
	 *            the cst_pis_cofins to set
	 */
	public void setCst_pis_cofins(String cst_pis_cofins) {
		this.cst_pis_cofins = cst_pis_cofins;
	}

	/**
	 * @param vl_tot_ded_ger
	 *            the vl_tot_ded_ger to set
	 */
	public void setVl_tot_ded_ger(String vl_tot_ded_ger) {
		this.vl_tot_ded_ger = vl_tot_ded_ger;
	}

	/**
	 * @param vl_tot_ded_esp
	 *            the vl_tot_ded_esp to set
	 */
	public void setVl_tot_ded_esp(String vl_tot_ded_esp) {
		this.vl_tot_ded_esp = vl_tot_ded_esp;
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
	 * @param info_compl
	 *            the info_compl to set
	 */
	public void setInfo_compl(String info_compl) {
		this.info_compl = info_compl;
	}

}
