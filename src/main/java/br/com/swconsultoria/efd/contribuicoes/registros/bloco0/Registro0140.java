/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.bloco0;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class Registro0140 {

	private final String reg = "0140";
	private String cod_est;
	private String nome;
	private String cnpj;
	private String uf;
	private String ie;
	private String cod_mun;
	private String im;
	private String suframa;
	private Registro0145 registro0145;
	private List<Registro0150> registro0150;
	private List<Registro0190> registro0190;
	private List<Registro0200> registro0200;
	private List<Registro0400> registro0400;
	private List<Registro0450> registro0450;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the cod_est
	 */
	public String getCod_est() {
		return cod_est;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @return the ie
	 */
	public String getIe() {
		return ie;
	}

	/**
	 * @return the cod_mun
	 */
	public String getCod_mun() {
		return cod_mun;
	}

	/**
	 * @return the im
	 */
	public String getIm() {
		return im;
	}

	/**
	 * @return the suframa
	 */
	public String getSuframa() {
		return suframa;
	}

	/**
	 * @return the registro0145
	 */
	public Registro0145 getRegistro0145() {
		return registro0145;
	}

	/**
	 * @return the registro0150
	 */
	public List<Registro0150> getRegistro0150() {
		if(registro0150 == null){
			registro0150 = new ArrayList<Registro0150>();
		}
		return registro0150;
	}

	/**
	 * @return the registro0190
	 */
	public List<Registro0190> getRegistro0190() {
		if(registro0190 == null){
			registro0190 = new ArrayList<Registro0190>();
		}
		return registro0190;
	}

	/**
	 * @return the registro0200
	 */
	public List<Registro0200> getRegistro0200() {
		if(registro0200 == null){
			registro0200 = new ArrayList<Registro0200>();
		}
		return registro0200;
	}

	/**
	 * @return the registro0400
	 */
	public List<Registro0400> getRegistro0400() {
		if(registro0400 == null){
			registro0400 = new ArrayList<Registro0400>();
		}
		return registro0400;
	}

	/**
	 * @return the registro0450
	 */
	public List<Registro0450> getRegistro0450() {
		if(registro0450 == null){
			registro0450 = new ArrayList<Registro0450>();
		}
		return registro0450;
	}

	/**
	 * @param cod_est
	 *            the cod_est to set
	 */
	public void setCod_est(String cod_est) {
		this.cod_est = cod_est;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @param uf
	 *            the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @param ie
	 *            the ie to set
	 */
	public void setIe(String ie) {
		this.ie = ie;
	}

	/**
	 * @param cod_mun
	 *            the cod_mun to set
	 */
	public void setCod_mun(String cod_mun) {
		this.cod_mun = cod_mun;
	}

	/**
	 * @param im
	 *            the im to set
	 */
	public void setIm(String im) {
		this.im = im;
	}

	/**
	 * @param suframa
	 *            the suframa to set
	 */
	public void setSuframa(String suframa) {
		this.suframa = suframa;
	}

	/**
	 * @param registro0145
	 *            the registro0145 to set
	 */
	public void setRegistro0145(Registro0145 registro0145) {
		this.registro0145 = registro0145;
	}

}
