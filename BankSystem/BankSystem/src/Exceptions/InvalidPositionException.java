package Exceptions;


public class InvalidPositionException extends Exception {
	
	/**
	 * Excepci�n que se lanza cuando una posici�n es inv�lida
	 * @param msg mensaje que se mostrar�
	 */
	public InvalidPositionException(String msg) {
		super(msg);
	}

}
