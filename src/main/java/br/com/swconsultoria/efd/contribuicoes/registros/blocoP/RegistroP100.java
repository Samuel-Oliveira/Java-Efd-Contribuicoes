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
public class RegistroP100 {

	private final String reg = "P100";
	private String dt_ini;
	private String dt_fin;
	private String vl_rec_tot_est;
	private String cod_ativ_econ;
	private String vl_rec_ativ_estab;
	private String vl_exc;
	private String vl_bc_cont;
	private String aliq_cont_percentual;
	private String vl_cont_apu;
	private String cod_cta;
	private String info_compl;
	private List<RegistroP110> registroP110;
	private List<RegistroP199> registroP199;

	/**
	 * @return the dt_ini
	 */
	public String getDt_ini() {
		return dt_ini;
	}

	/**
	 * @param dt_ini
	 *            the dt_ini to set
	 */
	public void setDt_ini(String dt_ini) {
		this.dt_ini = dt_ini;
	}

	/**
	 * @return the dt_fin
	 */
	public String getDt_fin() {
		return dt_fin;
	}

	/**
	 * @param dt_fin
	 *            the dt_fin to set
	 */
	public void setDt_fin(String dt_fin) {
		this.dt_fin = dt_fin;
	}

	/**
	 * @return the vl_rec_tot_est
	 */
	public String getVl_rec_tot_est() {
		return vl_rec_tot_est;
	}

	/**
	 * @param vl_rec_tot_est
	 *            the vl_rec_tot_est to set
	 */
	public void setVl_rec_tot_est(String vl_rec_tot_est) {
		this.vl_rec_tot_est = vl_rec_tot_est;
	}

	/**
	 * @return the cod_ativ_econ
	 */
	public String getCod_ativ_econ() {
		return cod_ativ_econ;
	}

	/**
	 * @param cod_ativ_econ
	 *            the cod_ativ_econ to set
	 */
	public void setCod_ativ_econ(String cod_ativ_econ) {
		this.cod_ativ_econ = cod_ativ_econ;
	}

	/**
	 * @return the vl_rec_ativ_estab
	 */
	public String getVl_rec_ativ_estab() {
		return vl_rec_ativ_estab;
	}

	/**
	 * @param vl_rec_ativ_estab
	 *            the vl_rec_ativ_estab to set
	 */
	public void setVl_rec_ativ_estab(String vl_rec_ativ_estab) {
		this.vl_rec_ativ_estab = vl_rec_ativ_estab;
	}

	/**
	 * @return the vl_exc
	 */
	public String getVl_exc() {
		return vl_exc;
	}

	/**
	 * @param vl_exc
	 *            the vl_exc to set
	 */
	public void setVl_exc(String vl_exc) {
		this.vl_exc = vl_exc;
	}

	/**
	 * @return the vl_bc_cont
	 */
	public String getVl_bc_cont() {
		return vl_bc_cont;
	}

	/**
	 * @param vl_bc_cont
	 *            the vl_bc_cont to set
	 */
	public void setVl_bc_cont(String vl_bc_cont) {
		this.vl_bc_cont = vl_bc_cont;
	}

	/**
	 * @return the aliq_cont_percentual
	 */
	public String getAliq_cont_percentual() {
		return aliq_cont_percentual;
	}

	/**
	 * @param aliq_cont_percentual
	 *            the aliq_cont_percentual to set
	 */
	public void setAliq_cont_percentual(String aliq_cont_percentual) {
		this.aliq_cont_percentual = aliq_cont_percentual;
	}

	/**
	 * @return the vl_cont_apu
	 */
	public String getVl_cont_apu() {
		return vl_cont_apu;
	}

	/**
	 * @param vl_cont_apu
	 *            the vl_cont_apu to set
	 */
	public void setVl_cont_apu(String vl_cont_apu) {
		this.vl_cont_apu = vl_cont_apu;
	}

	/**
	 * @return the cod_cta
	 */
	public String getCod_cta() {
		return cod_cta;
	}

	/**
	 * @param cod_cta
	 *            the cod_cta to set
	 */
	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	/**
	 * @return the info_compl
	 */
	public String getInfo_compl() {
		return info_compl;
	}

	/**
	 * @param info_compl
	 *            the info_compl to set
	 */
	public void setInfo_compl(String info_compl) {
		this.info_compl = info_compl;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroP110
	 */
	public List<RegistroP110> getRegistroP110() {
		if (registroP110 == null) {
			registroP110 = new ArrayList<RegistroP110>();
		}
		return registroP110;
	}

	/**
	 * @return the registroP199
	 */
	public List<RegistroP199> getRegistroP199() {
		if (registroP199 == null) {
			registroP199 = new ArrayList<RegistroP199>();
		}
		return registroP199;
	}

}
