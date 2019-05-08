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
public class BlocoM {

	private RegistroM001 registroM001;
	private List<RegistroM100> registroM100;
	private RegistroM200 registroM200;
	private List<RegistroM300> registroM300;
	private RegistroM350 registroM350;
	private List<RegistroM400> registroM400;
	private List<RegistroM500> registroM500;
	private RegistroM600 registroM600;
	private List<RegistroM700> registroM700;
	private List<RegistroM800> registroM800;
	private RegistroM990 registroM990;

	/**
	 * @return the registroM001
	 */
	public RegistroM001 getRegistroM001() {
		return registroM001;
	}

	/**
	 * @param registroM001
	 *            the registroM001 to set
	 */
	public void setRegistroM001(RegistroM001 registroM001) {
		this.registroM001 = registroM001;
	}

	/**
	 * @return the registroM200
	 */
	public RegistroM200 getRegistroM200() {
		return registroM200;
	}

	/**
	 * @param registroM200
	 *            the registroM200 to set
	 */
	public void setRegistroM200(RegistroM200 registroM200) {
		this.registroM200 = registroM200;
	}

	/**
	 * @return the registroM350
	 */
	public RegistroM350 getRegistroM350() {
		return registroM350;
	}

	/**
	 * @param registroM350
	 *            the registroM350 to set
	 */
	public void setRegistroM350(RegistroM350 registroM350) {
		this.registroM350 = registroM350;
	}

	/**
	 * @return the registroM600
	 */
	public RegistroM600 getRegistroM600() {
		return registroM600;
	}

	/**
	 * @param registroM600
	 *            the registroM600 to set
	 */
	public void setRegistroM600(RegistroM600 registroM600) {
		this.registroM600 = registroM600;
	}

	/**
	 * @return the registroM990
	 */
	public RegistroM990 getRegistroM990() {
		return registroM990;
	}

	/**
	 * @param registroM990
	 *            the registroM990 to set
	 */
	public void setRegistroM990(RegistroM990 registroM990) {
		this.registroM990 = registroM990;
	}

	/**
	 * @return the registroM100
	 */
	public List<RegistroM100> getRegistroM100() {
		if (registroM100 == null) {
			registroM100 = new ArrayList<RegistroM100>();
		}
		return registroM100;
	}

	/**
	 * @return the registroM300
	 */
	public List<RegistroM300> getRegistroM300() {
		if (registroM300 == null) {
			registroM300 = new ArrayList<RegistroM300>();
		}
		return registroM300;
	}

	/**
	 * @return the registroM400
	 */
	public List<RegistroM400> getRegistroM400() {
		if (registroM400 == null) {
			registroM400 = new ArrayList<RegistroM400>();
		}
		return registroM400;
	}

	/**
	 * @return the registroM500
	 */
	public List<RegistroM500> getRegistroM500() {
		if (registroM500 == null) {
			registroM500 = new ArrayList<RegistroM500>();
		}
		return registroM500;
	}

	/**
	 * @return the registroM700
	 */
	public List<RegistroM700> getRegistroM700() {
		if (registroM700 == null) {
			registroM700 = new ArrayList<RegistroM700>();
		}
		return registroM700;
	}

	/**
	 * @return the registroM800
	 */
	public List<RegistroM800> getRegistroM800() {
		if (registroM800 == null) {
			registroM800 = new ArrayList<RegistroM800>();
		}
		return registroM800;
	}

}
