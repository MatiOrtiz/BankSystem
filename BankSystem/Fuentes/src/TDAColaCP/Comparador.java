package TDAColaCP;

public class Comparador<E> implements java.util.Comparator<E> {

	/**
	 * Compara los dos elementos recibidos por parametro y devuelve un entero positivo si el primero es mayor, entero negativo si es menor y 0 si ambos elementos son iguales.
	 * @param o1 primer elemento de la comparación 
	 * @param o2 segundo elemento de la comparación
	 * @return entero positivo si el primer elemento es mayor, entero negativo si es menor, 0 si ambos elementos son iguales.
	 */
	@Override
	public int compare(E o1, E o2) {
		
		return ((Comparable<E>) o1).compareTo(o2);
	}
	
	

}
