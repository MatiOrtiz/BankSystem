package Exceptions;

public class InvalidNameException extends Exception {
	
	/**
	 * Excepción que se lanza cuando un nombre es inválido
	 * @param msg mensaje que se mostrará
	 */
	public InvalidNameException(String msg) {
		super(msg);
	}
}
