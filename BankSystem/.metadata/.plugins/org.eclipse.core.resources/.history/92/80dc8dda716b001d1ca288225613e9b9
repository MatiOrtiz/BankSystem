package TDACola;

import Exceptions.EmptyQueueException;

public class ColaConArregloCircular<E> implements Queue<E> {

	protected E[] q;
	protected int f,r;
	private static final int longitud = 10; //tamaño array
	
	/**
	 * Crea una instancia de clase ColaConArregloCircular
	 */
	@SuppressWarnings("unchecked")
	public ColaConArregloCircular() {
		q = (E[]) new Object[longitud];
		f = 0;
		r = 0;
	}
	
	public int size() {
		return((q.length - f + r) % q.length) ;
	}

	public boolean isEmpty() {
		return f == r;
	}
	
	public E front() throws EmptyQueueException {
		if(isEmpty()) 
			throw new EmptyQueueException("Error. Cola vacía.");
		return q[f];
	}

	public void enqueue(E element) {
		if(size() == q.length-1) {
			E[] aux = copiar(f);
			r = size();
			f = 0;
			q = aux;
		}
			q[r] = element;
			r = (r + 1) % q.length;
	}
	/**
	 * Duplica el tamaño del arreglo de la cola circular, e inserta en el los elementos que contenía anteriormente.
	 * @param start posición en el arreglo, a partir del cual se realizará la copia de los elementos.
	 * @return arreglo de elementos con un el doble de tamaño que el que se tenía anteriormente. 
	 */
	@SuppressWarnings("unchecked")
	private E[] copiar(int start) {
		int j = 0;
		E[] aux = (E[]) new Object[q.length*2];
		for(int i = f;!(start == r);i++) {
			start = i % q.length;
			aux[j++] = q[start];
		}
		return aux;
	} 

	
	public E dequeue() throws EmptyQueueException {
		if( isEmpty()) 
			throw new EmptyQueueException("Cola vacía.");
		E temp = q[f];
		q[f] = null;
		f = (f + 1) % (q.length);
		return temp;
	}
}
