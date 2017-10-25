/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoC {

	private RegistroC001 registroC001;
	private List<RegistroC010> registroC010;
	private RegistroC990 registroC990;

	/**
	 * @return the registroC001
	 */
	public RegistroC001 getRegistroC001() {
		return registroC001;
	}

	/**
	 * @param registroC001
	 *            the registroC001 to set
	 */
	public void setRegistroC001(RegistroC001 registroC001) {
		this.registroC001 = registroC001;
	}

	/**
	 * @return the registroC990
	 */
	public RegistroC990 getRegistroC990() {
		return registroC990;
	}

	/**
	 * @param registroC990
	 *            the registroC990 to set
	 */
	public void setRegistroC990(RegistroC990 registroC990) {
		this.registroC990 = registroC990;
	}

	/**
	 * @return the registroC010
	 */
	public List<RegistroC010> getRegistroC010() {
		if (registroC010 == null) {
			registroC010 = new ArrayList<RegistroC010>();
		}
		return registroC010;
	}

}
