/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoM;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroM600 {

	private final String reg = "M600";
	private String vl_tot_cont_nc_per;
	private String vl_tot_cred_desc;
	private String vl_tot_cred_desc_ant;
	private String vl_tot_cont_nc_dev;
	private String vl_ret_nc;
	private String vl_out_ded_nc;
	private String vl_cont_nc_rec;
	private String vl_tot_cont_cum_per;
	private String vl_ret_cum;
	private String vl_out_ded_cum;
	private String vl_cont_cum_rec;
	private String vl_tot_cont_rec;
	private List<RegistroM605> registroM605;
	private List<RegistroM610> registroM610;

	/**
	 * @return the vl_tot_cont_nc_per
	 */
	public String getVl_tot_cont_nc_per() {
		return vl_tot_cont_nc_per;
	}

	/**
	 * @param vl_tot_cont_nc_per
	 *            the vl_tot_cont_nc_per to set
	 */
	public void setVl_tot_cont_nc_per(String vl_tot_cont_nc_per) {
		this.vl_tot_cont_nc_per = vl_tot_cont_nc_per;
	}

	/**
	 * @return the vl_tot_cred_desc
	 */
	public String getVl_tot_cred_desc() {
		return vl_tot_cred_desc;
	}

	/**
	 * @param vl_tot_cred_desc
	 *            the vl_tot_cred_desc to set
	 */
	public void setVl_tot_cred_desc(String vl_tot_cred_desc) {
		this.vl_tot_cred_desc = vl_tot_cred_desc;
	}

	/**
	 * @return the vl_tot_cred_desc_ant
	 */
	public String getVl_tot_cred_desc_ant() {
		return vl_tot_cred_desc_ant;
	}

	/**
	 * @param vl_tot_cred_desc_ant
	 *            the vl_tot_cred_desc_ant to set
	 */
	public void setVl_tot_cred_desc_ant(String vl_tot_cred_desc_ant) {
		this.vl_tot_cred_desc_ant = vl_tot_cred_desc_ant;
	}

	/**
	 * @return the vl_tot_cont_nc_dev
	 */
	public String getVl_tot_cont_nc_dev() {
		return vl_tot_cont_nc_dev;
	}

	/**
	 * @param vl_tot_cont_nc_dev
	 *            the vl_tot_cont_nc_dev to set
	 */
	public void setVl_tot_cont_nc_dev(String vl_tot_cont_nc_dev) {
		this.vl_tot_cont_nc_dev = vl_tot_cont_nc_dev;
	}

	/**
	 * @return the vl_ret_nc
	 */
	public String getVl_ret_nc() {
		return vl_ret_nc;
	}

	/**
	 * @param vl_ret_nc
	 *            the vl_ret_nc to set
	 */
	public void setVl_ret_nc(String vl_ret_nc) {
		this.vl_ret_nc = vl_ret_nc;
	}

	/**
	 * @return the vl_out_ded_nc
	 */
	public String getVl_out_ded_nc() {
		return vl_out_ded_nc;
	}

	/**
	 * @param vl_out_ded_nc
	 *            the vl_out_ded_nc to set
	 */
	public void setVl_out_ded_nc(String vl_out_ded_nc) {
		this.vl_out_ded_nc = vl_out_ded_nc;
	}

	/**
	 * @return the vl_cont_nc_rec
	 */
	public String getVl_cont_nc_rec() {
		return vl_cont_nc_rec;
	}

	/**
	 * @param vl_cont_nc_rec
	 *            the vl_cont_nc_rec to set
	 */
	public void setVl_cont_nc_rec(String vl_cont_nc_rec) {
		this.vl_cont_nc_rec = vl_cont_nc_rec;
	}

	/**
	 * @return the vl_tot_cont_cum_per
	 */
	public String getVl_tot_cont_cum_per() {
		return vl_tot_cont_cum_per;
	}

	/**
	 * @param vl_tot_cont_cum_per
	 *            the vl_tot_cont_cum_per to set
	 */
	public void setVl_tot_cont_cum_per(String vl_tot_cont_cum_per) {
		this.vl_tot_cont_cum_per = vl_tot_cont_cum_per;
	}

	/**
	 * @return the vl_ret_cum
	 */
	public String getVl_ret_cum() {
		return vl_ret_cum;
	}

	/**
	 * @param vl_ret_cum
	 *            the vl_ret_cum to set
	 */
	public void setVl_ret_cum(String vl_ret_cum) {
		this.vl_ret_cum = vl_ret_cum;
	}

	/**
	 * @return the vl_out_ded_cum
	 */
	public String getVl_out_ded_cum() {
		return vl_out_ded_cum;
	}

	/**
	 * @param vl_out_ded_cum
	 *            the vl_out_ded_cum to set
	 */
	public void setVl_out_ded_cum(String vl_out_ded_cum) {
		this.vl_out_ded_cum = vl_out_ded_cum;
	}

	/**
	 * @return the vl_cont_cum_rec
	 */
	public String getVl_cont_cum_rec() {
		return vl_cont_cum_rec;
	}

	/**
	 * @param vl_cont_cum_rec
	 *            the vl_cont_cum_rec to set
	 */
	public void setVl_cont_cum_rec(String vl_cont_cum_rec) {
		this.vl_cont_cum_rec = vl_cont_cum_rec;
	}

	/**
	 * @return the vl_tot_cont_rec
	 */
	public String getVl_tot_cont_rec() {
		return vl_tot_cont_rec;
	}

	/**
	 * @param vl_tot_cont_rec
	 *            the vl_tot_cont_rec to set
	 */
	public void setVl_tot_cont_rec(String vl_tot_cont_rec) {
		this.vl_tot_cont_rec = vl_tot_cont_rec;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroM605
	 */
	public List<RegistroM605> getRegistroM605() {
		if (registroM605 == null) {
			registroM605 = new ArrayList<RegistroM605>();
		}
		return registroM605;
	}

	/**
	 * @return the registroM610
	 */
	public List<RegistroM610> getRegistroM610() {
		if (registroM610 == null) {
			registroM610 = new ArrayList<RegistroM610>();
		}
		return registroM610;
	}

}
