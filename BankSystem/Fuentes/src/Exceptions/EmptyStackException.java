package Exceptions;


public class EmptyStackException extends Exception{
	
	/**
	 * Excepción que se lanza cuando la pila está vacía
	 * @param a mensaje que se mostrará
	 */
	public EmptyStackException(String a) {
		super(a);
	}

}
