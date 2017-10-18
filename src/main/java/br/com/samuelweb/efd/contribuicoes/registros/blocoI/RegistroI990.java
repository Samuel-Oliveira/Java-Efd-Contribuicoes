/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoI;

/**
 * @author Yuri Lemes
 *
 */
public class RegistroI990 {

	private final String reg = "I990";
	private String qtd_lin_i;

	/**
	 * @return the reg
	 */
	public String getReg() {
		return reg;
	}

	/**
	 * @return the qtd_lin_i
	 */
	public String getQtd_lin_i() {
		return qtd_lin_i;
	}

	/**
	 * @param qtd_lin_i
	 *            the qtd_lin_i to set
	 */
	public void setQtd_lin_i(String qtd_lin_i) {
		this.qtd_lin_i = qtd_lin_i;
	}

}
