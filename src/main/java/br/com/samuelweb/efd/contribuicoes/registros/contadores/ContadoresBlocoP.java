/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.contadores;

import br.com.samuelweb.efd.contribuicoes.registros.blocoP.BlocoPEnum;

/**
 * @author Yuri Lemes
 *
 */
public class ContadoresBlocoP {

	// Bloco P
	private int contRegistroP001 = 0;
	private int contRegistroP010 = 0;
	private int contRegistroP100 = 0;
	private int contRegistroP110 = 0;
	private int contRegistroP199 = 0;
	private int contRegistroP200 = 0;
	private int contRegistroP210 = 0;
	private int contRegistroP990 = 0;

	public void incrementar(BlocoPEnum registrosBlocoP) {
		contRegistroP990++;

		switch (registrosBlocoP) {
			case RegistroP001:
				contRegistroP001++;
				break;
			case RegistroP010:
				contRegistroP010++;
				break;
			case RegistroP100:
				contRegistroP100++;
				break;
			case RegistroP110:
				contRegistroP110++;
				break;
			case RegistroP199:
				contRegistroP199++;
				break;
			case RegistroP200:
				contRegistroP200++;
				break;
			case RegistroP210:
				contRegistroP210++;
				break;
		default:
			break;
		}
	}

	/**
	 * @return the contRegistroP001
	 */
	public int getContRegistroP001() {
		return contRegistroP001;
	}

	/**
	 * @param contRegistroP001
	 *            the contRegistroP001 to set
	 */
	public void setContRegistroP001(int contRegistroP001) {
		this.contRegistroP001 = contRegistroP001;
	}

	/**
	 * @return the contRegistroP010
	 */
	public int getContRegistroP010() {
		return contRegistroP010;
	}

	/**
	 * @param contRegistroP010
	 *            the contRegistroP010 to set
	 */
	public void setContRegistroP010(int contRegistroP010) {
		this.contRegistroP010 = contRegistroP010;
	}

	/**
	 * @return the contRegistroP100
	 */
	public int getContRegistroP100() {
		return contRegistroP100;
	}

	/**
	 * @param contRegistroP100
	 *            the contRegistroP100 to set
	 */
	public void setContRegistroP100(int contRegistroP100) {
		this.contRegistroP100 = contRegistroP100;
	}

	/**
	 * @return the contRegistroP110
	 */
	public int getContRegistroP110() {
		return contRegistroP110;
	}

	/**
	 * @param contRegistroP110
	 *            the contRegistroP110 to set
	 */
	public void setContRegistroP110(int contRegistroP110) {
		this.contRegistroP110 = contRegistroP110;
	}

	/**
	 * @return the contRegistroP199
	 */
	public int getContRegistroP199() {
		return contRegistroP199;
	}

	/**
	 * @param contRegistroP199
	 *            the contRegistroP199 to set
	 */
	public void setContRegistroP199(int contRegistroP199) {
		this.contRegistroP199 = contRegistroP199;
	}

	/**
	 * @return the contRegistroP200
	 */
	public int getContRegistroP200() {
		return contRegistroP200;
	}

	/**
	 * @param contRegistroP200
	 *            the contRegistroP200 to set
	 */
	public void setContRegistroP200(int contRegistroP200) {
		this.contRegistroP200 = contRegistroP200;
	}

	/**
	 * @return the contRegistroP210
	 */
	public int getContRegistroP210() {
		return contRegistroP210;
	}

	/**
	 * @param contRegistroP210
	 *            the contRegistroP210 to set
	 */
	public void setContRegistroP210(int contRegistroP210) {
		this.contRegistroP210 = contRegistroP210;
	}

	/**
	 * @return the contRegistroP990
	 */
	public int getContRegistroP990() {
		return contRegistroP990;
	}

	/**
	 * @param contRegistroP990
	 *            the contRegistroP990 to set
	 */
	public void setContRegistroP990(int contRegistroP990) {
		this.contRegistroP990 = contRegistroP990;
	}

}
