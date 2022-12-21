package Exceptions;


public class InvalidEntryException extends Exception {
	
	/**
	 * Excepción que se lanza cuando la entrada es inválida
	 * @param a mensaje que se mostrará
	 */
	public InvalidEntryException (String a) {
		super(a);
	}

}
