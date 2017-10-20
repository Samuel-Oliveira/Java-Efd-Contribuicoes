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
public class RegistroM400 {

	private final String reg = "M400";
	private String cst_pis;
	private String vl_tot_rec;
	private String cod_cta;
	private String desc_compl;
	private List<RegistroM410> registroM410;

	/**
	 * @return the cst_pis
	 */
	public String getCst_pis() {
		return cst_pis;
	}

	/**
	 * @param cst_pis
	 *            the cst_pis to set
	 */
	public void setCst_pis(String cst_pis) {
		this.cst_pis = cst_pis;
	}

	/**
	 * @return the vl_tot_rec
	 */
	public String getVl_tot_rec() {
		return vl_tot_rec;
	}

	/**
	 * @param vl_tot_rec
	 *            the vl_tot_rec to set
	 */
	public void setVl_tot_rec(String vl_tot_rec) {
		this.vl_tot_rec = vl_tot_rec;
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
	 * @return the desc_compl
	 */
	public String getDesc_compl() {
		return desc_compl;
	}

	/**
	 * @param desc_compl
	 *            the desc_compl to set
	 */
	public void setDesc_compl(String desc_compl) {
		this.desc_compl = desc_compl;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroM410
	 */
	public List<RegistroM410> getRegistroM410() {
		if (registroM410 == null) {
			registroM410 = new ArrayList<RegistroM410>();
		}
		return registroM410;
	}

}
