/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroD300 {

	private final String reg = "D300";
	private String cod_mod;
	private String ser;
	private String sub;
	private String num_doc_ini;
	private String num_doc_fin;
	private String cfop;
	private String dt_ref;
	private String vl_doc;
	private String vl_desc;
	private String cst_pis;
	private String vl_bc_pis;
	private String aliq_pis_percentual;
	private String vl_pis;
	private String cst_cofins;
	private String vl_bc_cofins;
	private String aliq_cofins_percentual;
	private String vl_cofins;
	private String cod_cta;
	private List<RegistroD309> registroD309;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the cod_mod
	 */
	public String getCod_mod() {
		return cod_mod;
	}

	/**
	 * @return the ser
	 */
	public String getSer() {
		return ser;
	}

	/**
	 * @return the sub
	 */
	public String getSub() {
		return sub;
	}

	/**
	 * @return the num_doc_ini
	 */
	public String getNum_doc_ini() {
		return num_doc_ini;
	}

	/**
	 * @return the num_doc_fin
	 */
	public String getNum_doc_fin() {
		return num_doc_fin;
	}

	/**
	 * @return the cfop
	 */
	public String getCfop() {
		return cfop;
	}

	/**
	 * @return the dt_ref
	 */
	public String getDt_ref() {
		return dt_ref;
	}

	/**
	 * @return the vl_doc
	 */
	public String getVl_doc() {
		return vl_doc;
	}

	/**
	 * @return the vl_desc
	 */
	public String getVl_desc() {
		return vl_desc;
	}

	/**
	 * @return the cst_pis
	 */
	public String getCst_pis() {
		return cst_pis;
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
	 * @return the cst_cofins
	 */
	public String getCst_cofins() {
		return cst_cofins;
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
	 * @return the cod_cta
	 */
	public String getCod_cta() {
		return cod_cta;
	}

	/**
	 * @return the registroD309
	 */
	public List<RegistroD309> getRegistroD309() {
		if (registroD309 == null) {
			registroD309 = new ArrayList<RegistroD309>();
		}
		return registroD309;
	}

	/**
	 * @param cod_mod
	 *            the cod_mod to set
	 */
	public void setCod_mod(String cod_mod) {
		this.cod_mod = cod_mod;
	}

	/**
	 * @param ser
	 *            the ser to set
	 */
	public void setSer(String ser) {
		this.ser = ser;
	}

	/**
	 * @param sub
	 *            the sub to set
	 */
	public void setSub(String sub) {
		this.sub = sub;
	}

	/**
	 * @param num_doc_ini
	 *            the num_doc_ini to set
	 */
	public void setNum_doc_ini(String num_doc_ini) {
		this.num_doc_ini = num_doc_ini;
	}

	/**
	 * @param num_doc_fin
	 *            the num_doc_fin to set
	 */
	public void setNum_doc_fin(String num_doc_fin) {
		this.num_doc_fin = num_doc_fin;
	}

	/**
	 * @param cfop
	 *            the cfop to set
	 */
	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	/**
	 * @param dt_ref
	 *            the dt_ref to set
	 */
	public void setDt_ref(String dt_ref) {
		this.dt_ref = dt_ref;
	}

	/**
	 * @param vl_doc
	 *            the vl_doc to set
	 */
	public void setVl_doc(String vl_doc) {
		this.vl_doc = vl_doc;
	}

	/**
	 * @param vl_desc
	 *            the vl_desc to set
	 */
	public void setVl_desc(String vl_desc) {
		this.vl_desc = vl_desc;
	}

	/**
	 * @param cst_pis
	 *            the cst_pis to set
	 */
	public void setCst_pis(String cst_pis) {
		this.cst_pis = cst_pis;
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
	 * @param cst_cofins
	 *            the cst_cofins to set
	 */
	public void setCst_cofins(String cst_cofins) {
		this.cst_cofins = cst_cofins;
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
	 * @param cod_cta
	 *            the cod_cta to set
	 */
	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

}
