package Exceptions;

public class BoundaryViolationException extends Exception {

	
	/**
	 * Excepción que se lanza cuando un índice está fuera de los límites
	 * @param a mensaje que se mostrará
	 */
	public BoundaryViolationException(String a) {
		super(a);
	}
}

