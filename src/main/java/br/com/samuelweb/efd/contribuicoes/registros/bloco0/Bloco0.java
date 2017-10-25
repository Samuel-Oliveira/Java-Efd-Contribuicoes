/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.bloco0;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class Bloco0 {

	private Registro0000 registro0000;
	private Registro0001 registro0001;
	private List<Registro0035> registro0035;
	private List<Registro0100> registro0100;
	private Registro0110 registro0110;
	private List<Registro0120> registro0120;
	private List<Registro0140> registro0140;
	private List<Registro0500> registro0500;
	private List<Registro0600> registro0600;
	private Registro0990 registro0990;

	/**
	 * @return the registro0000
	 */
	public Registro0000 getRegistro0000() {
		return registro0000;
	}

	/**
	 * @param registro0000
	 *            the registro0000 to set
	 */
	public void setRegistro0000(Registro0000 registro0000) {
		this.registro0000 = registro0000;
	}

	/**
	 * @return the registro0001
	 */
	public Registro0001 getRegistro0001() {
		return registro0001;
	}

	/**
	 * @param registro0001
	 *            the registro0001 to set
	 */
	public void setRegistro0001(Registro0001 registro0001) {
		this.registro0001 = registro0001;
	}

	/**
	 * @return the registro0110
	 */
	public Registro0110 getRegistro0110() {
		return registro0110;
	}

	/**
	 * @param registro0110
	 *            the registro0110 to set
	 */
	public void setRegistro0110(Registro0110 registro0110) {
		this.registro0110 = registro0110;
	}

	/**
	 * @return the registro0990
	 */
	public Registro0990 getRegistro0990() {
		return registro0990;
	}

	/**
	 * @param registro0990
	 *            the registro0990 to set
	 */
	public void setRegistro0990(Registro0990 registro0990) {
		this.registro0990 = registro0990;
	}

	/**
	 * @return the registro0035
	 */
	public List<Registro0035> getRegistro0035() {
		if (registro0035 == null) {
			registro0035 = new ArrayList<Registro0035>();
		}
		return registro0035;
	}

	/**
	 * @return the registro0100
	 */
	public List<Registro0100> getRegistro0100() {
		if (registro0100 == null) {
			registro0100 = new ArrayList<Registro0100>();
		}
		return registro0100;
	}

	/**
	 * @return the registro0120
	 */
	public List<Registro0120> getRegistro0120() {
		if (registro0120 == null) {
			registro0120 = new ArrayList<Registro0120>();
		}
		return registro0120;
	}

	/**
	 * @return the registro0140
	 */
	public List<Registro0140> getRegistro0140() {
		if (registro0140 == null) {
			registro0140 = new ArrayList<Registro0140>();
		}
		return registro0140;
	}

	/**
	 * @return the registro0500
	 */
	public List<Registro0500> getRegistro0500() {
		if (registro0500 == null) {
			registro0500 = new ArrayList<Registro0500>();
		}
		return registro0500;
	}

	/**
	 * @return the registro0600
	 */
	public List<Registro0600> getRegistro0600() {
		if (registro0600 == null) {
			registro0600 = new ArrayList<Registro0600>();
		}
		return registro0600;
	}

}
