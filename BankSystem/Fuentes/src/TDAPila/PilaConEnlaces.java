package TDAPila;
import Exceptions.EmptyStackException;

public class PilaConEnlaces <E> implements Stack <E>{
	
	protected Nodo<E> head;
	protected int size;
	
	/**
	 * Crea una instancia de clase PilaConEnlaces
	 */
	public PilaConEnlaces() {
		head=null;
		size=0;
	}
	
	/**
	 * Inserta un elemento en el tope de la pila.
	 * @param element Elemento a insertar.
	 */
	public void push(E elem) {
		Nodo<E> aux = new Nodo<E>(elem, head);
		head = aux;
		size++;	
	}
	
	/**
	 * Remueve el elemento que se encuentra en el tope de la pila.
	 * @return Elemento removido.
	 * @throws EmptyStackException si la pila está vacía. 
	 */
	public E pop() throws EmptyStackException {
		if(isEmpty())
			throw new EmptyStackException("No se puede eliminar. Pila vacía");
		E aux = head.getElem();
		head = head.getSig();
		size--;
		return aux;
	}

	/**
	 * Examina el elemento que se encuentra en el tope de la pila.
	 * @return Elemento que se encuentra en el tope de la pila.
	 * @throws EmptyStackException si la pila está vacía. 
	 */
	public E top() throws EmptyStackException {
		if(size == 0)
			throw new EmptyStackException("Error. Pila Vacia");
		return head.getElem();
	}

	/**
	 * Consulta si la pila está vacía.
	 * @return Verdadero si la pila está vacía, falso en caso contrario.
	 */
	public boolean isEmpty() {
		return head==null;
	}

	/**
	 * Consulta la cantidad de elementos de la pila.
	 * @return Cantidad de elementos de la pila.
	 */
	public int size() {
		return size;
	}
}
