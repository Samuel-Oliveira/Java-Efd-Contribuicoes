/**
 * 
 */
package br.com.swconsultoria.efd.contribuicoes.registros.blocoD;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoD {

	private RegistroD001 registroD001;
	private List<RegistroD010> registroD010;
	private RegistroD990 registroD990;

	/**
	 * @return the registroD001
	 */
	public RegistroD001 getRegistroD001() {
		return registroD001;
	}

	/**
	 * @param registroD001
	 *            the registroD001 to set
	 */
	public void setRegistroD001(RegistroD001 registroD001) {
		this.registroD001 = registroD001;
	}

	/**
	 * @return the registroD990
	 */
	public RegistroD990 getRegistroD990() {
		return registroD990;
	}

	/**
	 * @param registroD990
	 *            the registroD990 to set
	 */
	public void setRegistroD990(RegistroD990 registroD990) {
		this.registroD990 = registroD990;
	}

	/**
	 * @return the registroD010
	 */
	public List<RegistroD010> getRegistroD010() {
		if (registroD010 == null) {
			registroD010 = new ArrayList<RegistroD010>();
		}
		return registroD010;
	}

}
