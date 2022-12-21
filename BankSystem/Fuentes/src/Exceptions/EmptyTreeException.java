package Exceptions;


public class EmptyTreeException extends Exception {

	/**
	 * Excepción que se lanza cuando el árbol está vacío
	 * @param msg mensaje que se mostrará
	 */
	public EmptyTreeException(String msg) {
		super(msg);
	}
}
