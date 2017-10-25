/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class Registro1600 {

	private final String reg = "1600";
	private String per_apur_ant;
	private String nat_cont_rec;
	private String vl_cont_apur;
	private String vl_cred_cofins_desc;
	private String vl_out_dev;
	private String vl_out_ded;
	private String vl_cont_ext;
	private String vl_mul;
	private String vl_jur;
	private String dt_recol;
	private List<Registro1610> registro1610;
	private List<Registro1620> registro1620;

	/**
	 * @return the per_apur_ant
	 */
	public String getPer_apur_ant() {
		return per_apur_ant;
	}

	/**
	 * @param per_apur_ant
	 *            the per_apur_ant to set
	 */
	public void setPer_apur_ant(String per_apur_ant) {
		this.per_apur_ant = per_apur_ant;
	}

	/**
	 * @return the nat_cont_rec
	 */
	public String getNat_cont_rec() {
		return nat_cont_rec;
	}

	/**
	 * @param nat_cont_rec
	 *            the nat_cont_rec to set
	 */
	public void setNat_cont_rec(String nat_cont_rec) {
		this.nat_cont_rec = nat_cont_rec;
	}

	/**
	 * @return the vl_cont_apur
	 */
	public String getVl_cont_apur() {
		return vl_cont_apur;
	}

	/**
	 * @param vl_cont_apur
	 *            the vl_cont_apur to set
	 */
	public void setVl_cont_apur(String vl_cont_apur) {
		this.vl_cont_apur = vl_cont_apur;
	}

	/**
	 * @return the vl_cred_cofins_desc
	 */
	public String getVl_cred_cofins_desc() {
		return vl_cred_cofins_desc;
	}

	/**
	 * @param vl_cred_cofins_desc
	 *            the vl_cred_cofins_desc to set
	 */
	public void setVl_cred_cofins_desc(String vl_cred_cofins_desc) {
		this.vl_cred_cofins_desc = vl_cred_cofins_desc;
	}

	/**
	 * @return the vl_out_dev
	 */
	public String getVl_out_dev() {
		return vl_out_dev;
	}

	/**
	 * @param vl_out_dev
	 *            the vl_out_dev to set
	 */
	public void setVl_out_dev(String vl_out_dev) {
		this.vl_out_dev = vl_out_dev;
	}

	/**
	 * @return the vl_out_ded
	 */
	public String getVl_out_ded() {
		return vl_out_ded;
	}

	/**
	 * @param vl_out_ded
	 *            the vl_out_ded to set
	 */
	public void setVl_out_ded(String vl_out_ded) {
		this.vl_out_ded = vl_out_ded;
	}

	/**
	 * @return the vl_cont_ext
	 */
	public String getVl_cont_ext() {
		return vl_cont_ext;
	}

	/**
	 * @param vl_cont_ext
	 *            the vl_cont_ext to set
	 */
	public void setVl_cont_ext(String vl_cont_ext) {
		this.vl_cont_ext = vl_cont_ext;
	}

	/**
	 * @return the vl_mul
	 */
	public String getVl_mul() {
		return vl_mul;
	}

	/**
	 * @param vl_mul
	 *            the vl_mul to set
	 */
	public void setVl_mul(String vl_mul) {
		this.vl_mul = vl_mul;
	}

	/**
	 * @return the vl_jur
	 */
	public String getVl_jur() {
		return vl_jur;
	}

	/**
	 * @param vl_jur
	 *            the vl_jur to set
	 */
	public void setVl_jur(String vl_jur) {
		this.vl_jur = vl_jur;
	}

	/**
	 * @return the dt_recol
	 */
	public String getDt_recol() {
		return dt_recol;
	}

	/**
	 * @param dt_recol
	 *            the dt_recol to set
	 */
	public void setDt_recol(String dt_recol) {
		this.dt_recol = dt_recol;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registro1610
	 */
	public List<Registro1610> getRegistro1610() {
		if (registro1610 == null) {
			registro1610 = new ArrayList<Registro1610>();
		}
		return registro1610;
	}

	/**
	 * @return the registro1620
	 */
	public List<Registro1620> getRegistro1620() {
		if (registro1620 == null) {
			registro1620 = new ArrayList<Registro1620>();
		}
		return registro1620;
	}

}
