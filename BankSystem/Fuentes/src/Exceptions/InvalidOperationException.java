package Exceptions;


public class InvalidOperationException extends Exception{
	
	/**
	 * Excepción que se lanza cuando una operación no se puede realizar
	 * @param msg mensaje que se mostrará
	 */
	public InvalidOperationException(String msg) {
		super(msg);
	}

}
