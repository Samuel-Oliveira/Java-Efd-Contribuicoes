/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.contadores;

import br.com.samuelweb.efd.contribuicoes.registros.blocoA.BlocoAEnum;

/**
 * @author Yuri Lemes
 *
 */
public class ContadoresBlocoA {

	// Bloco A
	private int contRegistroA001 = 0;
	private int contRegistroA010 = 0;
	private int contRegistroA100 = 0;
	private int contRegistroA110 = 0;
	private int contRegistroA111 = 0;
	private int contRegistroA120 = 0;
	private int contRegistroA170 = 0;
	private int contRegistroA990 = 0;

	public void incrementar(BlocoAEnum registroBlocoA) {

		contRegistroA990++;

		switch (registroBlocoA) {
		case RegistroA001:
			contRegistroA001++;
			break;
		case RegistroA010:
			contRegistroA010++;
			break;
		case RegistroA100:
			contRegistroA100++;
			break;
		case RegistroA111:
			contRegistroA111++;
			break;
		case RegistroA120:
			contRegistroA120++;
			break;
		case RegistroA170:
			contRegistroA170++;
			break;
		default:
			break;
		}
	}

	/**
	 * @return the contRegistroA001
	 */
	public int getContRegistroA001() {
		return contRegistroA001;
	}

	/**
	 * @return the contRegistroA010
	 */
	public int getContRegistroA010() {
		return contRegistroA010;
	}

	/**
	 * @return the contRegistroA100
	 */
	public int getContRegistroA100() {
		return contRegistroA100;
	}

	/**
	 * @return the contRegistroA110
	 */
	public int getContRegistroA110() {
		return contRegistroA110;
	}

	/**
	 * @return the contRegistroA111
	 */
	public int getContRegistroA111() {
		return contRegistroA111;
	}

	/**
	 * @return the contRegistroA120
	 */
	public int getContRegistroA120() {
		return contRegistroA120;
	}

	/**
	 * @return the contRegistroA170
	 */
	public int getContRegistroA170() {
		return contRegistroA170;
	}

	/**
	 * @return the contRegistroA990
	 */
	public int getContRegistroA990() {
		return contRegistroA990;
	}

}
