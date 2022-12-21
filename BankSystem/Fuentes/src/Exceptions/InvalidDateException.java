package Exceptions;

public class InvalidDateException extends Exception {
	
	/**
	 * Excepción que se lanza cuando una fecha ingresada es inválida
	 * @param msg mensaje que se mostrará
	 */
	public InvalidDateException(String msg) {
		super(msg);
	}
}
