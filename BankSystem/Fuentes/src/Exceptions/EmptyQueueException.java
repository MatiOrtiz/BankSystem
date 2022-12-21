package Exceptions;


public class EmptyQueueException extends Exception{
	
	/**
	 * Excepción que se lanza cuando la cola está vacía
	 * @param msg mensaje que se mostrará
	 */
	public EmptyQueueException(String msg) {
		super(msg);
	}
}