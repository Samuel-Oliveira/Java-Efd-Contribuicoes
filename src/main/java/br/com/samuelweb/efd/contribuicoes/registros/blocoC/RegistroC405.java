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
public class RegistroC405 {

	private final String reg = "C405";
	private String dt_doc;
	private String cro;
	private String crz;
	private String num_coo_fin;
	private String gt_fin;
	private String vl_brt;
	private List<RegistroC481> registroC481;
	private List<RegistroC485> registroC485;

	/**
	 * @return the dt_doc
	 */
	public String getDt_doc() {
		return dt_doc;
	}

	/**
	 * @param dt_doc
	 *            the dt_doc to set
	 */
	public void setDt_doc(String dt_doc) {
		this.dt_doc = dt_doc;
	}

	/**
	 * @return the cro
	 */
	public String getCro() {
		return cro;
	}

	/**
	 * @param cro
	 *            the cro to set
	 */
	public void setCro(String cro) {
		this.cro = cro;
	}

	/**
	 * @return the crz
	 */
	public String getCrz() {
		return crz;
	}

	/**
	 * @param crz
	 *            the crz to set
	 */
	public void setCrz(String crz) {
		this.crz = crz;
	}

	/**
	 * @return the num_coo_fin
	 */
	public String getNum_coo_fin() {
		return num_coo_fin;
	}

	/**
	 * @param num_coo_fin
	 *            the num_coo_fin to set
	 */
	public void setNum_coo_fin(String num_coo_fin) {
		this.num_coo_fin = num_coo_fin;
	}

	/**
	 * @return the gt_fin
	 */
	public String getGt_fin() {
		return gt_fin;
	}

	/**
	 * @param gt_fin
	 *            the gt_fin to set
	 */
	public void setGt_fin(String gt_fin) {
		this.gt_fin = gt_fin;
	}

	/**
	 * @return the vl_brt
	 */
	public String getVl_brt() {
		return vl_brt;
	}

	/**
	 * @param vl_brt
	 *            the vl_brt to set
	 */
	public void setVl_brt(String vl_brt) {
		this.vl_brt = vl_brt;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC481
	 */
	public List<RegistroC481> getRegistroC481() {
		if (registroC481 == null) {
			registroC481 = new ArrayList<RegistroC481>();
		}
		return registroC481;
	}

	/**
	 * @return the registroC485
	 */
	public List<RegistroC485> getRegistroC485() {
		if (registroC485 == null) {
			registroC485 = new ArrayList<RegistroC485>();
		}
		return registroC485;
	}

}
