/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoA;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoA {

	private RegistroA001 registroA001;
	private List<RegistroA010> registroA010;
	private RegistroA990 registroA990;

	/**
	 * @return the registroA001
	 */
	public RegistroA001 getRegistroA001() {
		return registroA001;
	}

	/**
	 * @param registroA001
	 *            the registroA001 to set
	 */
	public void setRegistroA001(RegistroA001 registroA001) {
		this.registroA001 = registroA001;
	}

	/**
	 * @return the registroA990
	 */
	public RegistroA990 getRegistroA990() {
		return registroA990;
	}

	/**
	 * @param registroA990
	 *            the registroA990 to set
	 */
	public void setRegistroA990(RegistroA990 registroA990) {
		this.registroA990 = registroA990;
	}

	/**
	 * @return the registroA010
	 */
	public List<RegistroA010> getRegistroA010() {
		if (registroA010 == null) {
			registroA010 = new ArrayList<RegistroA010>();
		}
		return registroA010;
	}

}
