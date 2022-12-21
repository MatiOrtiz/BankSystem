package Exceptions;


public class InvalidKeyException extends Exception {
	
	/**
	 * Excepción que se lanza cuando la clave de la entrada es inválida
	 * @param msg mensaje que se mostrará
	 */
	public InvalidKeyException(String msg) {
		super(msg);
	}

}
