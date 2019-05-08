/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.contadores;

import br.com.swconsultoria.efd.contribuicoes.registros.blocoI.BlocoIEnum;

/**
 * @author Yuri Lemes
 *
 */
public class ContadoresBlocoI {

	// Bloco I
	private int contRegistroI001 = 0;
	private int contRegistroI010 = 0;
	private int contRegistroI100 = 0;
	private int contRegistroI199 = 0;
	private int contRegistroI200 = 0;
	private int contRegistroI299 = 0;
	private int contRegistroI300 = 0;
	private int contRegistroI399 = 0;
	private int contRegistroI990 = 0;

	public void incrementar(BlocoIEnum registrosBlocoI) {
		contRegistroI990++;

		switch (registrosBlocoI) {
			case RegistroI001:
				contRegistroI001++;
				break;
			case RegistroI010:
				contRegistroI010++;
				break;
			case RegistroI100:
				contRegistroI100++;
				break;
			case RegistroI199:
				contRegistroI199++;
				break;
			case RegistroI200:
				contRegistroI200++;
				break;
			case RegistroI299:
				contRegistroI299++;
				break;
			case RegistroI300:
				contRegistroI300++;
				break;
			case RegistroI399:
				contRegistroI399++;
				break;
		default:
			break;
		}
	}

	/**
	 * @return the contRegistroI001
	 */
	public int getContRegistroI001() {
		return contRegistroI001;
	}

	/**
	 * @return the contRegistroI010
	 */
	public int getContRegistroI010() {
		return contRegistroI010;
	}

	/**
	 * @return the contRegistroI100
	 */
	public int getContRegistroI100() {
		return contRegistroI100;
	}

	/**
	 * @return the contRegistroI199
	 */
	public int getContRegistroI199() {
		return contRegistroI199;
	}

	/**
	 * @return the contRegistroI200
	 */
	public int getContRegistroI200() {
		return contRegistroI200;
	}

	/**
	 * @return the contRegistroI299
	 */
	public int getContRegistroI299() {
		return contRegistroI299;
	}

	/**
	 * @return the contRegistroI300
	 */
	public int getContRegistroI300() {
		return contRegistroI300;
	}

	/**
	 * @return the contRegistroI399
	 */
	public int getContRegistroI399() {
		return contRegistroI399;
	}

	/**
	 * @return the contRegistroI990
	 */
	public int getContRegistroI990() {
		return contRegistroI990;
	}

}
