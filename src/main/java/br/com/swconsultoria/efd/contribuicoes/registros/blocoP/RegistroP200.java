/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoP;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroP200 {

	private final String reg = "P200";
	private String per_ref;
	private String vl_tot_cont_apu;
	private String vl_tot_aj_reduc;
	private String vl_tot_j_acres;
	private String vl_tot_cont_dev;
	private String cod_rec;
	private List<RegistroP210> registroP210;

	/**
	 * @return the per_ref
	 */
	public String getPer_ref() {
		return per_ref;
	}

	/**
	 * @param per_ref
	 *            the per_ref to set
	 */
	public void setPer_ref(String per_ref) {
		this.per_ref = per_ref;
	}

	/**
	 * @return the vl_tot_cont_apu
	 */
	public String getVl_tot_cont_apu() {
		return vl_tot_cont_apu;
	}

	/**
	 * @param vl_tot_cont_apu
	 *            the vl_tot_cont_apu to set
	 */
	public void setVl_tot_cont_apu(String vl_tot_cont_apu) {
		this.vl_tot_cont_apu = vl_tot_cont_apu;
	}

	/**
	 * @return the vl_tot_aj_reduc
	 */
	public String getVl_tot_aj_reduc() {
		return vl_tot_aj_reduc;
	}

	/**
	 * @param vl_tot_aj_reduc
	 *            the vl_tot_aj_reduc to set
	 */
	public void setVl_tot_aj_reduc(String vl_tot_aj_reduc) {
		this.vl_tot_aj_reduc = vl_tot_aj_reduc;
	}

	/**
	 * @return the vl_tot_j_acres
	 */
	public String getVl_tot_aj_acres() {
		return vl_tot_j_acres;
	}

	/**
	 * @param vl_tot_j_acres
	 *            the vl_tot_j_acres to set
	 */
	public void setVl_tot_j_acres(String vl_tot_j_acres) {
		this.vl_tot_j_acres = vl_tot_j_acres;
	}

	/**
	 * @return the vl_tot_cont_dev
	 */
	public String getVl_tot_cont_dev() {
		return vl_tot_cont_dev;
	}

	/**
	 * @param vl_tot_cont_dev
	 *            the vl_tot_cont_dev to set
	 */
	public void setVl_tot_cont_dev(String vl_tot_cont_dev) {
		this.vl_tot_cont_dev = vl_tot_cont_dev;
	}

	/**
	 * @return the cod_rec
	 */
	public String getCod_rec() {
		return cod_rec;
	}

	/**
	 * @param cod_rec
	 *            the cod_rec to set
	 */
	public void setCod_rec(String cod_rec) {
		this.cod_rec = cod_rec;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroP210
	 */
	public List<RegistroP210> getRegistroP210() {
		if (registroP210 == null) {
			registroP210 = new ArrayList<RegistroP210>();
		}
		return registroP210;
	}

}
