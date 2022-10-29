package TDAPila;


public class Nodo<E> {
	
	private E elemento;
	private Nodo<E> siguiente;

	/**
	 * Crea una instancia de clase Nodo
	 */
	public Nodo() {
		elemento = null;
		siguiente = null;
	}
	/**
	 * Crea una instancia de clase Nodo
	 * @param elem Elemento a insertar en el nodo
	 */
	public Nodo(E elem) {
		elemento = elem;
		siguiente = null;

	}

	/**
	 * Crea una instancia de clase Nodo
	 * @param elem Elemento a insertar en el nodo
	 * @param sig Nodo a asignar como siguiente
	 */
	public Nodo(E elem, Nodo<E> sig) {
		elemento = elem;
		siguiente = sig;
	}

	/**
	 * Devuelve el elemento almacenado en el nodo
	 * @return E elemento almacenado en el nodo
	 */
	public E getElem() {
		return elemento;
	}

	/**
	 * Establece un nuevo elemento en el nodo
	 * @param elem Elemento a insertar en el nodo
	 */
	public void setElem(E elem) {
		elemento = elem;
	}

	/**
	 * Devuelve el nodo siguiente al nodo en cuestión
	 * @return Nodo siguiente
	 */
	public Nodo<E> getSig() {
		return siguiente;
	}
	
	/**
	 * Establece un nuevo nodo siguiente 
	 * @param e Nodo siguiente
	 */
	public void setSig(Nodo<E> e) {
		siguiente=e;
	}
	
}
