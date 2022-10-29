package Exceptions;


public class InvalidOperationException extends Exception{
	
	/**
	 * Excepci�n que se lanza cuando una operaci�n no se puede realizar
	 * @param msg mensaje que se mostrar�
	 */
	public InvalidOperationException(String msg) {
		super(msg);
	}

}
