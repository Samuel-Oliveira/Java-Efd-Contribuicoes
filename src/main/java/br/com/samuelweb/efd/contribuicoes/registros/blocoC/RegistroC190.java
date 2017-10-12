/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroC190 {

	private final String reg = "C190";
	private String cod_mod;
	private String dt_ref_ini;
	private String dt_ref_fin;
	private String cod_item;
	private String cod_ncm;
	private String ex_ipi;
	private String vl_tot_item;
	private List<RegistroC191> registroC191;
	private List<RegistroC195> registroC195;
	private List<RegistroC198> registroC198;
	private List<RegistroC199> registroC199;

	/**
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}

	/**
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @return the dt_ref_ini
	 */
	public String getDt_ref_ini() {
		return dt_ref_ini;
	}

	/**
	 * @param dt_ref_ini
	 *            the dt_ref_ini to set
	 */
	public void setDt_ref_ini(String dt_ref_ini) {
		this.dt_ref_ini = dt_ref_ini;
	}

	/**
	 * @return the dt_ref_fin
	 */
	public String getDt_ref_fin() {
		return dt_ref_fin;
	}

	/**
	 * @param dt_ref_fin
	 *            the dt_ref_fin to set
	 */
	public void setDt_ref_fin(String dt_ref_fin) {
		this.dt_ref_fin = dt_ref_fin;
	}

	/**
	 * @return the cod_item
	 */
	public String getCod_item() {
		return cod_item;
	}

	/**
	 * @param cod_item
	 *            the cod_item to set
	 */
	public void setCod_item(String cod_item) {
		this.cod_item = cod_item;
	}

	/**
	 * @return the cod_ncm
	 */
	public String getCod_ncm() {
		return cod_ncm;
	}

	/**
	 * @param cod_ncm
	 *            the cod_ncm to set
	 */
	public void setCod_ncm(String cod_ncm) {
		this.cod_ncm = cod_ncm;
	}

	/**
	 * @return the ex_ipi
	 */
	public String getEx_ipi() {
		return ex_ipi;
	}

	/**
	 * @param ex_ipi
	 *            the ex_ipi to set
	 */
	public void setEx_ipi(String ex_ipi) {
		this.ex_ipi = ex_ipi;
	}

	/**
	 * @return the vl_tot_item
	 */
	public String getVl_tot_item() {
		return vl_tot_item;
	}

	/**
	 * @param vl_tot_item
	 *            the vl_tot_item to set
	 */
	public void setVl_tot_item(String vl_tot_item) {
		this.vl_tot_item = vl_tot_item;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC191
	 */
	public List<RegistroC191> getRegistroC191() {
		if(registroC191 == null) {
			registroC191 = new ArrayList<RegistroC191>(); 
		}
		return registroC191;
	}

	/**
	 * @return the registroC195
	 */
	public List<RegistroC195> getRegistroC195() {
		if(registroC195 == null) {
			registroC195 = new ArrayList<RegistroC195>(); 
		}
		return registroC195;
	}

	/**
	 * @return the registroC198
	 */
	public List<RegistroC198> getRegistroC198() {
		if(registroC198 == null) {
			registroC198 = new ArrayList<RegistroC198>(); 
		}
		return registroC198;
	}

	/**
	 * @return the registroC199
	 */
	public List<RegistroC199> getRegistroC199() {
		if(registroC199 == null) {
			registroC199 = new ArrayList<RegistroC199>(); 
		}
		return registroC199;
	}

}
