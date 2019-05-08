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
public class RegistroM800 {

	private final String reg = "M800";
	private String cst_cofins;
	private String vl_tot_rec;
	private String cod_cta;
	private String desc_compl;
	private List<RegistroM810> registroM810;

	/**
	 * @return the cst_cofins
	 */
	public String getCst_cofins() {
		return cst_cofins;
	}

	/**
	 * @param cst_cofins
	 *            the cst_cofins to set
	 */
	public void setCst_cofins(String cst_cofins) {
		this.cst_cofins = cst_cofins;
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
	 * @return the registroM810
	 */
	public List<RegistroM810> getRegistroM810() {
		if (registroM810 == null) {
			registroM810 = new ArrayList<RegistroM810>();
		}
		return registroM810;
	}

}
