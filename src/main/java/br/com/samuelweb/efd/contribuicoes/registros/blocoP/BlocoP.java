/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoP;

import java.util.ArrayList;
import java.util.List;

import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP001;
import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP010;
import br.com.samuelweb.efd.contribuicoes.registros.blocoP.RegistroP990;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoP {

	private RegistroP001 registroP001;
	private List<RegistroP010> registroP010;
	private List<RegistroP200> registroP200;
	private RegistroP990 registroP990;

	/**
	 * @return the registroP001
	 */
	public RegistroP001 getRegistroP001() {
		return registroP001;
	}

	/**
	 * @param registroP001
	 *            the registroP001 to set
	 */
	public void setRegistroP001(RegistroP001 registroP001) {
		this.registroP001 = registroP001;
	}

	/**
	 * @return the registroP990
	 */
	public RegistroP990 getRegistroP990() {
		return registroP990;
	}

	/**
	 * @param registroP990
	 *            the registroP990 to set
	 */
	public void setRegistroP990(RegistroP990 registroP990) {
		this.registroP990 = registroP990;
	}

	/**
	 * @return the registroP010
	 */
	public List<RegistroP010> getRegistroP010() {
		if (registroP010 == null) {
			registroP010 = new ArrayList<RegistroP010>();
		}
		return registroP010;
	}

	/**
	 * @return the registroP200
	 */
	public List<RegistroP200> getRegistroP200() {
		if (registroP200 == null) {
			registroP200 = new ArrayList<RegistroP200>();
		}
		return registroP200;
	}

}
