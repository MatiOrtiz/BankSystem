package Exceptions;

public class BoundaryViolationException extends Exception {

	
	/**
	 * Excepci�n que se lanza cuando un �ndice est� fuera de los l�mites
	 * @param a mensaje que se mostrar�
	 */
	public BoundaryViolationException(String a) {
		super(a);
	}
}

