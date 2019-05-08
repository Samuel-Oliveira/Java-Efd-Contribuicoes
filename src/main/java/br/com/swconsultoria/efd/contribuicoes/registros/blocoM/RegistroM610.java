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
public class RegistroM610 {

	private final String reg = "M610";
	private String cod_cont;
	private String vl_rec_brt;
	private String vl_bc_cont;
    private String vl_ajus_acres_bc_cofins;
    private String vl_ajus_reduc_bc_cofins;
    private String vl_bc_cont_ajus;
	private String aliq_cofins_percentual;
	private String quant_bc_cofins;
	private String aliq_cofins_reais;
	private String vl_cont_apur;
	private String vl_ajust_acres;
	private String vl_ajust_reduc;
	private String vl_cont_difer;
	private String vl_cont_difer_ant;
	private String vl_cont_per;
	private RegistroM611 registroM611;
	private List<RegistroM615> registroM615;
	private List<RegistroM620> registroM620;
	private List<RegistroM630> registroM630;

    public String getVl_ajus_acres_bc_cofins() {
        return vl_ajus_acres_bc_cofins;
    }

    public void setVl_ajus_acres_bc_cofins(String vl_ajus_acres_bc_cofins) {
        this.vl_ajus_acres_bc_cofins = vl_ajus_acres_bc_cofins;
    }

    public String getVl_ajus_reduc_bc_cofins() {
        return vl_ajus_reduc_bc_cofins;
    }

    public void setVl_ajus_reduc_bc_cofins(String vl_ajus_reduc_bc_cofins) {
        this.vl_ajus_reduc_bc_cofins = vl_ajus_reduc_bc_cofins;
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
	 * @return the aliq_cofins_percentual
	 */
	public String getAliq_cofins_percentual() {
		return aliq_cofins_percentual;
	}

	/**
	 * @param aliq_cofins_percentual
	 *            the aliq_cofins_percentual to set
	 */
	public void setAliq_cofins_percentual(String aliq_cofins_percentual) {
		this.aliq_cofins_percentual = aliq_cofins_percentual;
	}

	/**
	 * @return the quant_bc_cofins
	 */
	public String getQuant_bc_cofins() {
		return quant_bc_cofins;
	}

	/**
	 * @param quant_bc_cofins
	 *            the quant_bc_cofins to set
	 */
	public void setQuant_bc_cofins(String quant_bc_cofins) {
		this.quant_bc_cofins = quant_bc_cofins;
	}

	/**
	 * @return the aliq_cofins_reais
	 */
	public String getAliq_cofins_reais() {
		return aliq_cofins_reais;
	}

	/**
	 * @param aliq_cofins_reais
	 *            the aliq_cofins_reais to set
	 */
	public void setAliq_cofins_reais(String aliq_cofins_reais) {
		this.aliq_cofins_reais = aliq_cofins_reais;
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
	 * @return the registroM611
	 */
	public RegistroM611 getRegistroM611() {
		return registroM611;
	}

	/**
	 * @param registroM611
	 *            the registroM611 to set
	 */
	public void setRegistroM611(RegistroM611 registroM611) {
		this.registroM611 = registroM611;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroM615
	 */
	public List<RegistroM615> getRegistroM615() {
		if (registroM615 == null) {
			registroM615 = new ArrayList<RegistroM615>();
		}
		return registroM615;
	}

	/**
	 * @return the registroM620
	 */
	public List<RegistroM620> getRegistroM620() {
		if (registroM620 == null) {
			registroM620 = new ArrayList<RegistroM620>();
		}
		return registroM620;
	}

	/**
	 * @return the registroM630
	 */
	public List<RegistroM630> getRegistroM630() {
		if (registroM630 == null) {
			registroM630 = new ArrayList<RegistroM630>();
		}
		return registroM630;
	}

}
