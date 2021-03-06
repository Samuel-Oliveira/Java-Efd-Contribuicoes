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
public class RegistroM210 {

	private final String reg = "M210";
	private String cod_cont;
	private String vl_rec_brt;
	private String vl_bc_cont;
	private String vl_ajus_acres_bc_pis;
	private String vl_ajus_reduc_bc_pis;
	private String vl_bc_cont_ajus;
	private String aliq_pis_percentual;
	private String quant_bc_pis;
	private String aliq_pis_reais;
	private String vl_cont_apur;
	private String vl_ajust_acres;
	private String vl_ajust_reduc;
	private String vl_cont_difer;
	private String vl_cont_difer_ant;
	private String vl_cont_per;
	private RegistroM211 registroM211;
	private List<RegistroM215> registroM215;
	private List<RegistroM220> registroM220;
	private List<RegistroM230> registroM230;


	/**
	 * @return the cod_cont
	 */
	public String getCod_cont() {
		return cod_cont;
	}

	/**
	 * @param cod_cont
	 *            the cod_cont to set
	 */
	public void setCod_cont(String cod_cont) {
		this.cod_cont = cod_cont;
	}

	/**
	 * @return the vl_rec_brt
	 */
	public String getVl_rec_brt() {
		return vl_rec_brt;
	}

	/**
	 * @param vl_rec_brt
	 *            the vl_rec_brt to set
	 */
	public void setVl_rec_brt(String vl_rec_brt) {
		this.vl_rec_brt = vl_rec_brt;
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
	 * @return the aliq_pis_percentual
	 */
	public String getAliq_pis_percentual() {
		return aliq_pis_percentual;
	}

	/**
	 * @param aliq_pis_percentual
	 *            the aliq_pis_percentual to set
	 */
	public void setAliq_pis_percentual(String aliq_pis_percentual) {
		this.aliq_pis_percentual = aliq_pis_percentual;
	}

	/**
	 * @return the quant_bc_pis
	 */
	public String getQuant_bc_pis() {
		return quant_bc_pis;
	}

	/**
	 * @param quant_bc_pis
	 *            the quant_bc_pis to set
	 */
	public void setQuant_bc_pis(String quant_bc_pis) {
		this.quant_bc_pis = quant_bc_pis;
	}

	/**
	 * @return the aliq_pis_reais
	 */
	public String getAliq_pis_reais() {
		return aliq_pis_reais;
	}

	/**
	 * @param aliq_pis_reais
	 *            the aliq_pis_reais to set
	 */
	public void setAliq_pis_reais(String aliq_pis_reais) {
		this.aliq_pis_reais = aliq_pis_reais;
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
	 * @return the vl_ajust_acres
	 */
	public String getVl_ajus_acres() {
		return vl_ajust_acres;
	}

	/**
	 * @param vl_ajust_acres
	 *            the vl_ajust_acres to set
	 */
	public void setVl_ajust_acres(String vl_ajust_acres) {
		this.vl_ajust_acres = vl_ajust_acres;
	}

	/**
	 * @return the vl_ajust_reduc
	 */
	public String getVl_ajus_reduc() {
		return vl_ajust_reduc;
	}

	/**
	 * @param vl_ajust_reduc
	 *            the vl_ajust_reduc to set
	 */
	public void setVl_ajust_reduc(String vl_ajust_reduc) {
		this.vl_ajust_reduc = vl_ajust_reduc;
	}

	/**
	 * @return the vl_cont_difer
	 */
	public String getVl_cont_difer() {
		return vl_cont_difer;
	}

	/**
	 * @param vl_cont_difer
	 *            the vl_cont_difer to set
	 */
	public void setVl_cont_difer(String vl_cont_difer) {
		this.vl_cont_difer = vl_cont_difer;
	}

	/**
	 * @return the vl_cont_difer_ant
	 */
	public String getVl_cont_difer_ant() {
		return vl_cont_difer_ant;
	}

	/**
	 * @param vl_cont_difer_ant
	 *            the vl_cont_difer_ant to set
	 */
	public void setVl_cont_difer_ant(String vl_cont_difer_ant) {
		this.vl_cont_difer_ant = vl_cont_difer_ant;
	}

	/**
	 * @return the vl_cont_per
	 */
	public String getVl_cont_per() {
		return vl_cont_per;
	}

	/**
	 * @param vl_cont_per
	 *            the vl_cont_per to set
	 */
	public void setVl_cont_per(String vl_cont_per) {
		this.vl_cont_per = vl_cont_per;
	}

	/**
	 * @return the registroM211
	 */
	public RegistroM211 getRegistroM211() {
		return registroM211;
	}

	/**
	 * @param registroM211
	 *            the registroM211 to set
	 */
	public void setRegistroM211(RegistroM211 registroM211) {
		this.registroM211 = registroM211;
	}

    public String getVl_ajus_acres_bc_pis() {
        return vl_ajus_acres_bc_pis;
    }

    public void setVl_ajus_acres_bc_pis(String vl_ajus_acres_bc_pis) {
        this.vl_ajus_acres_bc_pis = vl_ajus_acres_bc_pis;
    }

    public String getVl_ajus_reduc_bc_pis() {
        return vl_ajus_reduc_bc_pis;
    }

    public void setVl_ajus_reduc_bc_pis(String vl_ajus_reduc_bc_pis) {
        this.vl_ajus_reduc_bc_pis = vl_ajus_reduc_bc_pis;
    }

    public String getVl_bc_cont_ajus() {
        return vl_bc_cont_ajus;
    }

    public void setVl_bc_cont_ajus(String vl_bc_cont_ajus) {
        this.vl_bc_cont_ajus = vl_bc_cont_ajus;
    }

    public String getVl_ajust_acres() {
        return vl_ajust_acres;
    }

    public String getVl_ajust_reduc() {
        return vl_ajust_reduc;
    }

    /**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroM220
	 */
	public List<RegistroM220> getRegistroM220() {
		if (registroM220 == null) {
			registroM220 = new ArrayList<RegistroM220>();
		}
		return registroM220;
	}

	/**
	 * @return the registroM230
	 */
	public List<RegistroM230> getRegistroM230() {
		if (registroM230 == null) {
			registroM230 = new ArrayList<RegistroM230>();
		}
		return registroM230;
	}

	/**
	 * @return the registroM230
	 */
	public List<RegistroM215> getRegistroM215() {
		if (registroM215 == null) {
			registroM215 = new ArrayList<RegistroM215>();
		}
		return registroM215;
	}

}
