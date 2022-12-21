package Exceptions;


public class EmptyListException extends Exception {

	
	/**
	 * Excepción que se lanza cuando la lista está vacía
	 * @param msg mensaje que se mostrará
	 */
	public EmptyListException(String msg) {
		super(msg);
	}
}
