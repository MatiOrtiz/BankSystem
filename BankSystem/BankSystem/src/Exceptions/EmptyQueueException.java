package Exceptions;


public class EmptyQueueException extends Exception{
	
	/**
	 * Excepci�n que se lanza cuando la cola est� vac�a
	 * @param msg mensaje que se mostrar�
	 */
	public EmptyQueueException(String msg) {
		super(msg);
	}
}