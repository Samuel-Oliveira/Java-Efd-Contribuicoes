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
public class RegistroC860 {

	private final String reg = "C860";
	private String cod_mod;
	private String nr_sat;
	private String dt_doc;
	private String doc_ini;
	private String doc_fim;
	private List<RegistroC870> registroC870;
	private List<RegistroC880> registroC880;
	private List<RegistroC890> registroC890;

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
	 * @return the nr_sat
	 */
	public String getNr_sat() {
		return nr_sat;
	}

	/**
	 * @param nr_sat
	 *            the nr_sat to set
	 */
	public void setNr_sat(String nr_sat) {
		this.nr_sat = nr_sat;
	}

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
	 * @return the doc_ini
	 */
	public String getDoc_ini() {
		return doc_ini;
	}

	/**
	 * @param doc_ini
	 *            the doc_ini to set
	 */
	public void setDoc_ini(String doc_ini) {
		this.doc_ini = doc_ini;
	}

	/**
	 * @return the doc_fim
	 */
	public String getDoc_fim() {
		return doc_fim;
	}

	/**
	 * @param doc_fim
	 *            the doc_fim to set
	 */
	public void setDoc_fim(String doc_fim) {
		this.doc_fim = doc_fim;
	}

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the registroC870
	 */
	public List<RegistroC870> getRegistroC870() {
		if (registroC870 == null) {
			registroC870 = new ArrayList<RegistroC870>();
		}
		return registroC870;
	}

	/**
	 * @return the registroC880
	 */
	public List<RegistroC880> getRegistroC880() {
		if (registroC880 == null) {
			registroC880 = new ArrayList<RegistroC880>();
		}
		return registroC880;
	}

	/**
	 * @return the registroC890
	 */
	public List<RegistroC890> getRegistroC890() {
		if (registroC890 == null) {
			registroC890 = new ArrayList<RegistroC890>();
		}
		return registroC890;
	}

}
