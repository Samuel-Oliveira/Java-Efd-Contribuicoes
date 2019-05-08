/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroC180 {

	private final String reg = "C180";
	private String cod_mod;
	private String dt_doc_ini;
	private String dt_doc_fin;
	private String cod_item;
	private String cod_ncm;
	private String ex_ipi;
	private String vl_tot_item;
	private List<RegistroC181> registroC181;
	private List<RegistroC185> registroC185;
	private List<RegistroC188> registroC188;

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
	 * @return the dt_doc_ini
	 */
	public String getDt_doc_ini() {
		return dt_doc_ini;
	}

	/**
	 * @param dt_doc_ini
	 *            the dt_doc_ini to set
	 */
	public void setDt_doc_ini(String dt_doc_ini) {
		this.dt_doc_ini = dt_doc_ini;
	}

	/**
	 * @return the dt_doc_fin
	 */
	public String getDt_doc_fin() {
		return dt_doc_fin;
	}

	/**
	 * @param dt_doc_fin
	 *            the dt_doc_fin to set
	 */
	public void setDt_doc_fin(String dt_doc_fin) {
		this.dt_doc_fin = dt_doc_fin;
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
	 * @return the registroC181
	 */
	public List<RegistroC181> getRegistroC181() {
		if(registroC181 == null) {
			registroC181 = new ArrayList<RegistroC181>();
		}
		return registroC181;
	}

	/**
	 * @return the registroC185
	 */
	public List<RegistroC185> getRegistroC185() {
		if(registroC185 == null) {
			registroC185 = new ArrayList<RegistroC185>();
		}
		return registroC185;
	}

	/**
	 * @return the registroC188
	 */
	public List<RegistroC188> getRegistroC188() {
		if(registroC188 == null) {
			registroC188 = new ArrayList<RegistroC188>();
		}
		return registroC188;
	}

}
