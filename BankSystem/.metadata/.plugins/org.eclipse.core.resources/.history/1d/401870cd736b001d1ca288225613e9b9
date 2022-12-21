package TDALista;


import java.util.*;

import Auxiliar.Position;
import Exceptions.*;

public class ElementIterator<E> implements Iterator<E> {
	
	protected PositionList<E> list;
	protected Position<E> cursor;
	
	/**
	 * Crea una instancia de clase ElementIterator
	 * @param l
	 */
	public ElementIterator(PositionList <E> l) {
		list=l;
		if(list.isEmpty())
			cursor=null;
		else
			try {
				cursor=list.first();
			} catch (EmptyListException e) {
				e.printStackTrace();
			}
	}
	
	/**
	 * Devuelve true si hay un elemento siguiente, falso en caso contrario
	 * @return  true si hay un elemento siguiente, falso en caso contrario
	 */
	public boolean hasNext() {
		return cursor!=null;
	}

	/**
	 * Devuelve el elemento almacenado en la posición del cursor y apunta el cursor al siguiente elemento
	 * @return E elemento almacenado en la posición del cursor
	 * @throws NoSuchElementException si no hay elemento siguiente
	 */
	@Override
	public E next() throws NoSuchElementException {
		if(cursor==null)
			throw new NoSuchElementException("Error: No hay siguiente");
		E toReturn= cursor.element();
		try {
			cursor= (cursor==list.last())? null: list.next(cursor);
		} catch (EmptyListException | InvalidPositionException | BoundaryViolationException e) {
			e.printStackTrace();
		}
		
		return toReturn;
	}

}