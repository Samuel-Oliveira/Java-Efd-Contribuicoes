package br.com.swconsultoria.efd.contribuicoes.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes do EFD.
 * 
 * @author Samuel Oliveira
 */
public class EfdException extends Exception {

	private static final long serialVersionUID = 8157032997005835424L;
	
	String message;
	
	/**
	 * Construtor da classe.
	 * 
	 * @param e
	 */
	public EfdException(Throwable e) {
		super(e);
	}

	
	/**
	 * Construtor da classe.
	 * 
	 * @param code
	 */
	public EfdException(String message) {
		this((Throwable) null);
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	
}