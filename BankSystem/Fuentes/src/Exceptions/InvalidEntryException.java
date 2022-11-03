package Exceptions;


public class InvalidEntryException extends Exception {
	
	/**
	 * Excepci�n que se lanza cuando la entrada es inv�lida
	 * @param a mensaje que se mostrar�
	 */
	public InvalidEntryException (String a) {
		super(a);
	}

}
