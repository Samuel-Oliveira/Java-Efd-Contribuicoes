/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI001;
import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI010;
import br.com.samuelweb.efd.contribuicoes.registros.blocoI.RegistroI990;

/**
 * @author Yuri Lemes
 *
 */
public class BlocoI {

	private RegistroI001 registroI001;
	private List<RegistroI010> registroI010;
	private RegistroI990 registroI990;

	/**
	 * @return the registroI001
	 */
	public RegistroI001 getRegistroI001() {
		return registroI001;
	}

	/**
	 * @param registroI001
	 *            the registroI001 to set
	 */
	public void setRegistroI001(RegistroI001 registroI001) {
		this.registroI001 = registroI001;
	}

	/**
	 * @return the registroI990
	 */
	public RegistroI990 getRegistroI990() {
		return registroI990;
	}

	/**
	 * @param registroI990
	 *            the registroI990 to set
	 */
	public void setRegistroI990(RegistroI990 registroI990) {
		this.registroI990 = registroI990;
	}

	/**
	 * @return the registroI010
	 */
	public List<RegistroI010> getRegistroI010() {
		if (registroI010 == null) {
			registroI010 = new ArrayList<RegistroI010>();
		}
		return registroI010;
	}

}
