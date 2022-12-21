package Exceptions;


public class InvalidPositionException extends Exception {
	
	/**
	 * Excepción que se lanza cuando una posición es inválida
	 * @param msg mensaje que se mostrará
	 */
	public InvalidPositionException(String msg) {
		super(msg);
	}

}
