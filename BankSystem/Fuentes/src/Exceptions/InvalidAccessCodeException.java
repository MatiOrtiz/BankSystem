package Exceptions;

public class InvalidAccessCodeException extends Exception {
	
	/**
	 * Excepción que se lanza cuando la clave de acceso de la cuenta es inválida
	 * @param msg mensaje que se mostrará
	 */
	public InvalidAccessCodeException(String msg) {
		super(msg);
	}
}
