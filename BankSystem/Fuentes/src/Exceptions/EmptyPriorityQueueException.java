package Exceptions;

public class EmptyPriorityQueueException extends Exception {
	
	/**
	 * Excepción que se lanza cuando la cola está vacía 
	 * @param msg mensaje que se mostrará
	 */
	public EmptyPriorityQueueException(String msg) {
		super(msg);
	}
}
