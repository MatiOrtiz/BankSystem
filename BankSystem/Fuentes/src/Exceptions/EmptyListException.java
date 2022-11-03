package Exceptions;


public class EmptyListException extends Exception {

	
	/**
	 * Excepci�n que se lanza cuando la lista est� vacia
	 * @param msg mensaje que se mostrar�
	 */
	public EmptyListException(String msg) {
		super(msg);
	}
}
