/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoF;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroF200 {

	private final String reg = "F200";
	private String ind_oper;
	private String unid_imob;
	private String ident_emp;
	private String desc_unid_imob;
	private String num_cont;
	private String cpf_cnpj_adqu;
	private String dt_oper;
	private String vl_tot_vend;
	private String vl_rec_acum;
	private String vl_tot_rec;
	private String cst_pis;
	private String vl_bc_pis;
	private String aliq_pis_percentual;
	private String vl_pis;
	private String cst_cofins;
	private String vl_bc_cofins;
	private String aliq_cofins_percentual;
	private String vl_cofins;
	private String perc_rec_receb;
	private String ind_nat_emp;
	private String inf_comp;
	private RegistroF205 registroF205;
	private List<RegistroF210> registroF210;
	private List<RegistroF211> registroF211;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the ind_oper
	 */
	public String getInd_oper() {
		return ind_oper;
	}

	/**
	 * @return the unid_imob
	 */
	public String getUnid_imob() {
		return unid_imob;
	}

	/**
	 * @return the ident_emp
	 */
	public String getIdent_emp() {
		return ident_emp;
	}

	/**
	 * @return the desc_unid_imob
	 */
	public String getDesc_unid_imob() {
		return desc_unid_imob;
	}

	/**
	 * @return the num_cont
	 */
	public String getNum_cont() {
		return num_cont;
	}

	/**
	 * @return the cpf_cnpj_adqu
	 */
	public String getCpf_cnpj_adqu() {
		return cpf_cnpj_adqu;
	}

	/**
	 * @return the dt_oper
	 */
	public String getDt_oper() {
		return dt_oper;
	}

	/**
	 * @return the vl_tot_vend
	 */
	public String getVl_tot_vend() {
		return vl_tot_vend;
	}

	/**
	 * @return the vl_rec_acum
	 */
	public String getVl_rec_acum() {
		return vl_rec_acum;
	}

	/**
	 * @return the vl_tot_rec
	 */
	public String getVl_tot_rec() {
		return vl_tot_rec;
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
	 * @return the perc_rec_receb
	 */
	public String getPerc_rec_receb() {
		return perc_rec_receb;
	}

	/**
	 * @return the ind_nat_emp
	 */
	public String getInd_nat_emp() {
		return ind_nat_emp;
	}

	/**
	 * @return the inf_comp
	 */
	public String getInf_comp() {
		return inf_comp;
	}

	/**
	 * @return the registroF205
	 */
	public RegistroF205 getRegistroF205() {
		return registroF205;
	}

	/**
	 * @return the registroF210
	 */
	public List<RegistroF210> getRegistroF210() {
		if(registroF210 == null){
			registroF210 = new ArrayList<RegistroF210>();
		}
		return registroF210;
	}

	/**
	 * @return the registroF211
	 */
	public List<RegistroF211> getRegistroF211() {
		if(registroF211 == null){
			registroF211 = new ArrayList<RegistroF211>();
		}
		return registroF211;
	}

	/**
	 * @param ind_oper
	 *            the ind_oper to set
	 */
	public void setInd_oper(String ind_oper) {
		this.ind_oper = ind_oper;
	}

	/**
	 * @param unid_imob
	 *            the unid_imob to set
	 */
	public void setUnid_imob(String unid_imob) {
		this.unid_imob = unid_imob;
	}

	/**
	 * @param ident_emp
	 *            the ident_emp to set
	 */
	public void setIdent_emp(String ident_emp) {
		this.ident_emp = ident_emp;
	}

	/**
	 * @param desc_unid_imob
	 *            the desc_unid_imob to set
	 */
	public void setDesc_unid_imob(String desc_unid_imob) {
		this.desc_unid_imob = desc_unid_imob;
	}

	/**
	 * @param num_cont
	 *            the num_cont to set
	 */
	public void setNum_cont(String num_cont) {
		this.num_cont = num_cont;
	}

	/**
	 * @param cpf_cnpj_adqu
	 *            the cpf_cnpj_adqu to set
	 */
	public void setCpf_cnpj_adqu(String cpf_cnpj_adqu) {
		this.cpf_cnpj_adqu = cpf_cnpj_adqu;
	}

	/**
	 * @param dt_oper
	 *            the dt_oper to set
	 */
	public void setDt_oper(String dt_oper) {
		this.dt_oper = dt_oper;
	}

	/**
	 * @param vl_tot_vend
	 *            the vl_tot_vend to set
	 */
	public void setVl_tot_vend(String vl_tot_vend) {
		this.vl_tot_vend = vl_tot_vend;
	}

	/**
	 * @param vl_rec_acum
	 *            the vl_rec_acum to set
	 */
	public void setVl_rec_acum(String vl_rec_acum) {
		this.vl_rec_acum = vl_rec_acum;
	}

	/**
	 * @param vl_tot_rec
	 *            the vl_tot_rec to set
	 */
	public void setVl_tot_rec(String vl_tot_rec) {
		this.vl_tot_rec = vl_tot_rec;
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
	 * @param perc_rec_receb
	 *            the perc_rec_receb to set
	 */
	public void setPerc_rec_receb(String perc_rec_receb) {
		this.perc_rec_receb = perc_rec_receb;
	}

	/**
	 * @param ind_nat_emp
	 *            the ind_nat_emp to set
	 */
	public void setInd_nat_emp(String ind_nat_emp) {
		this.ind_nat_emp = ind_nat_emp;
	}

	/**
	 * @param inf_comp
	 *            the inf_comp to set
	 */
	public void setInf_comp(String inf_comp) {
		this.inf_comp = inf_comp;
	}

	/**
	 * @param registroF205
	 *            the registroF205 to set
	 */
	public void setRegistroF205(RegistroF205 registroF205) {
		this.registroF205 = registroF205;
	}

}
