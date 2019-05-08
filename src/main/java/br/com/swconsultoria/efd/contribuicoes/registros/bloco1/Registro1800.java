/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.bloco1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class Registro1800 {

	private final String reg = "1800";
	private String inc_imob;
	private String rec_receb_ret;
	private String rec_fin_ret;
	private String bc_ret;
	private String aliq_ret;
	private String vl_rec_uni;
	private String dt_rec_uni;
	private String cod_rec;
	private List<Registro1809> registro1809;

	/**
	 * @return the inc_imob
	 */
	public String getInc_imob() {
		return inc_imob;
	}

	/**
	 * @param inc_imob
	 *            the inc_imob to set
	 */
	public void setInc_imob(String inc_imob) {
		this.inc_imob = inc_imob;
	}

	/**
	 * @return the rec_receb_ret
	 */
	public String getRec_receb_ret() {
		return rec_receb_ret;
	}

	/**
	 * @param rec_receb_ret
	 *            the rec_receb_ret to set
	 */
	public void setRec_receb_ret(String rec_receb_ret) {
		this.rec_receb_ret = rec_receb_ret;
	}

	/**
	 * @return the rec_fin_ret
	 */
	public String getRec_fin_ret() {
		return rec_fin_ret;
	}

	/**
	 * @param rec_fin_ret
	 *            the rec_fin_ret to set
	 */
	public void setRec_fin_ret(String rec_fin_ret) {
		this.rec_fin_ret = rec_fin_ret;
	}

	/**
	 * @return the bc_ret
	 */
	public String getBc_ret() {
		return bc_ret;
	}

	/**
	 * @param bc_ret
	 *            the bc_ret to set
	 */
	public void setBc_ret(String bc_ret) {
		this.bc_ret = bc_ret;
	}

	/**
	 * @return the aliq_ret
	 */
	public String getAliq_ret() {
		return aliq_ret;
	}

	/**
	 * @param aliq_ret
	 *            the aliq_ret to set
	 */
	public void setAliq_ret(String aliq_ret) {
		this.aliq_ret = aliq_ret;
	}

	/**
	 * @return the vl_rec_uni
	 */
	public String getVl_rec_uni() {
		return vl_rec_uni;
	}

	/**
	 * @param vl_rec_uni
	 *            the vl_rec_uni to set
	 */
	public void setVl_rec_uni(String vl_rec_uni) {
		this.vl_rec_uni = vl_rec_uni;
	}

	/**
	 * @return the dt_rec_uni
	 */
	public String getDt_rec_uni() {
		return dt_rec_uni;
	}

	/**
	 * @param dt_rec_uni
	 *            the dt_rec_uni to set
	 */
	public void setDt_rec_uni(String dt_rec_uni) {
		this.dt_rec_uni = dt_rec_uni;
	}

	/**
	 * @return the cod_rec
	 */
	public String getCod_rec() {
		return cod_rec;
	}

	/**
	 * @param cod_rec
	 *            the cod_rec to set
	 */
	public void setCod_rec(String cod_rec) {
		this.cod_rec = cod_rec;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registro1809
	 */
	public List<Registro1809> getRegistro1809() {
		if (registro1809 == null) {
			registro1809 = new ArrayList<Registro1809>();
		}
		return registro1809;
	}

}
