package Exceptions;

public class InsuficientAmountException extends Exception {
	
	/**
	 * Excepción que se lanza cuando el monto en la cuenta bancaria es insuficiente
	 * @param msg mensaje que se mostrará
	 */
	public InsuficientAmountException(String msg) {
		super(msg);
	}
}
