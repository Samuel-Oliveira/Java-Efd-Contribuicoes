/**
 * 
 */
package br.com.samuelweb.efd.contribuicoes.registros;

import br.com.samuelweb.efd.contribuicoes.registros.bloco0.Bloco0;
import br.com.samuelweb.efd.contribuicoes.registros.bloco1.Bloco1;
import br.com.samuelweb.efd.contribuicoes.registros.bloco9.Bloco9;
import br.com.samuelweb.efd.contribuicoes.registros.blocoA.BlocoA;
import br.com.samuelweb.efd.contribuicoes.registros.blocoC.BlocoC;
import br.com.samuelweb.efd.contribuicoes.registros.blocoD.BlocoD;
import br.com.samuelweb.efd.contribuicoes.registros.blocoF.BlocoF;
import br.com.samuelweb.efd.contribuicoes.registros.blocoI.BlocoI;
import br.com.samuelweb.efd.contribuicoes.registros.blocoM.BlocoM;
import br.com.samuelweb.efd.contribuicoes.registros.blocoP.BlocoP;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBloco0;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBloco1;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBlocoA;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBlocoC;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBlocoD;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBlocoF;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBlocoI;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBlocoM;
import br.com.samuelweb.efd.contribuicoes.registros.contadores.ContadoresBlocoP;

/**
 * @author Yuri Lemes
 *
 */
public class EfdContribuicoes {

	private Bloco0 bloco0;
	private Bloco1 bloco1;
	private Bloco9 bloco9;
	private BlocoA blocoA;
	private BlocoC blocoC;
	private BlocoD blocoD;
	private BlocoF blocoF;
	private BlocoI blocoI;
	private BlocoM blocoM;
	private BlocoP blocoP;

	private ContadoresBloco0 contadoresBloco0;
	private ContadoresBlocoA contadoresBlocoA;
	private ContadoresBlocoC contadoresBlocoC;
	private ContadoresBlocoD contadoresBlocoD;
	private ContadoresBlocoF contadoresBlocoF;
	private ContadoresBlocoI contadoresBlocoI;
	private ContadoresBlocoM contadoresBlocoM;
	private ContadoresBlocoP contadoresBlocoP;
	private ContadoresBloco1 contadoresBloco1;

	/**
	 * 
	 */
	public EfdContribuicoes() {
		this.contadoresBloco0 = new ContadoresBloco0();
		this.contadoresBlocoA = new ContadoresBlocoA();
		this.contadoresBlocoC = new ContadoresBlocoC();
		this.contadoresBlocoD = new ContadoresBlocoD();
		this.contadoresBlocoF = new ContadoresBlocoF();
		this.contadoresBlocoI = new ContadoresBlocoI();
		this.contadoresBlocoM = new ContadoresBlocoM();
		this.contadoresBlocoP = new ContadoresBlocoP();
		this.contadoresBloco1 = new ContadoresBloco1();
	}

	/**
	 * @return the bloco0
	 */
	public Bloco0 getBloco0() {
		return bloco0;
	}

	/**
	 * @param bloco0
	 *            the bloco0 to set
	 */
	public void setBloco0(Bloco0 bloco0) {
		this.bloco0 = bloco0;
	}

	/**
	 * @return the bloco1
	 */
	public Bloco1 getBloco1() {
		return bloco1;
	}

	/**
	 * @param bloco1
	 *            the bloco1 to set
	 */
	public void setBloco1(Bloco1 bloco1) {
		this.bloco1 = bloco1;
	}

	/**
	 * @return the bloco9
	 */
	public Bloco9 getBloco9() {
		return bloco9;
	}

	/**
	 * @param bloco9
	 *            the bloco9 to set
	 */
	public void setBloco9(Bloco9 bloco9) {
		this.bloco9 = bloco9;
	}

	/**
	 * @return the blocoA
	 */
	public BlocoA getBlocoA() {
		return blocoA;
	}

	/**
	 * @param blocoA
	 *            the blocoA to set
	 */
	public void setBlocoA(BlocoA blocoA) {
		this.blocoA = blocoA;
	}

	/**
	 * @return the blocoC
	 */
	public BlocoC getBlocoC() {
		return blocoC;
	}

	/**
	 * @param blocoC
	 *            the blocoC to set
	 */
	public void setBlocoC(BlocoC blocoC) {
		this.blocoC = blocoC;
	}

	/**
	 * @return the blocoD
	 */
	public BlocoD getBlocoD() {
		return blocoD;
	}

	/**
	 * @param blocoD
	 *            the blocoD to set
	 */
	public void setBlocoD(BlocoD blocoD) {
		this.blocoD = blocoD;
	}

	/**
	 * @return the blocoF
	 */
	public BlocoF getBlocoF() {
		return blocoF;
	}

	/**
	 * @param blocoF
	 *            the blocoF to set
	 */
	public void setBlocoF(BlocoF blocoF) {
		this.blocoF = blocoF;
	}

	/**
	 * @return the blocoI
	 */
	public BlocoI getBlocoI() {
		return blocoI;
	}

	/**
	 * @param blocoI
	 *            the blocoI to set
	 */
	public void setBlocoI(BlocoI blocoI) {
		this.blocoI = blocoI;
	}

	/**
	 * @return the blocoM
	 */
	public BlocoM getBlocoM() {
		return blocoM;
	}

	/**
	 * @param blocoM
	 *            the blocoM to set
	 */
	public void setBlocoM(BlocoM blocoM) {
		this.blocoM = blocoM;
	}

	/**
	 * @return the blocoP
	 */
	public BlocoP getBlocoP() {
		return blocoP;
	}

	/**
	 * @param blocoP
	 *            the blocoP to set
	 */
	public void setBlocoP(BlocoP blocoP) {
		this.blocoP = blocoP;
	}

	/**
	 * @return the contadoresBloco0
	 */
	public ContadoresBloco0 getContadoresBloco0() {
		return contadoresBloco0;
	}

	/**
	 * @return the contadoresBlocoA
	 */
	public ContadoresBlocoA getContadoresBlocoA() {
		return contadoresBlocoA;
	}

	/**
	 * @return the contadoresBlocoC
	 */
	public ContadoresBlocoC getContadoresBlocoC() {
		return contadoresBlocoC;
	}

	/**
	 * @return the contadoresBlocoD
	 */
	public ContadoresBlocoD getContadoresBlocoD() {
		return contadoresBlocoD;
	}

	/**
	 * @return the contadoresBlocoF
	 */
	public ContadoresBlocoF getContadoresBlocoF() {
		return contadoresBlocoF;
	}

	/**
	 * @return the contadoresBlocoI
	 */
	public ContadoresBlocoI getContadoresBlocoI() {
		return contadoresBlocoI;
	}

	/**
	 * @return the contadoresBlocoM
	 */
	public ContadoresBlocoM getContadoresBlocoM() {
		return contadoresBlocoM;
	}

	/**
	 * @return the contadoresBlocoP
	 */
	public ContadoresBlocoP getContadoresBlocoP() {
		return contadoresBlocoP;
	}

	/**
	 * @return the contadoresBloco1
	 */
	public ContadoresBloco1 getContadoresBloco1() {
		return contadoresBloco1;
	}

}
