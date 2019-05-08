/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoF;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoF {

	private RegistroF001 registroF001;
	private List<RegistroF010> registroF010;
	private RegistroF990 registroF990;

	/**
	 * @return the registroF001
	 */
	public RegistroF001 getRegistroF001() {
		return registroF001;
	}

	/**
	 * @param registroF001
	 *            the registroF001 to set
	 */
	public void setRegistroF001(RegistroF001 registroF001) {
		this.registroF001 = registroF001;
	}

	/**
	 * @return the registroF990
	 */
	public RegistroF990 getRegistroF990() {
		return registroF990;
	}

	/**
	 * @param registroF990
	 *            the registroF990 to set
	 */
	public void setRegistroF990(RegistroF990 registroF990) {
		this.registroF990 = registroF990;
	}

	/**
	 * @return the registroF010
	 */
	public List<RegistroF010> getRegistroF010() {
		if (registroF010 == null) {
			registroF010 = new ArrayList<RegistroF010>();
		}
		return registroF010;
	}

}
