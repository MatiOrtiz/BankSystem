package TDAMapeo;

public class Entrada<K, V> implements Entry<K, V> {
	private K clave;
	private V valor;

	/**
	 * Crea una instancia de clase Entrada
	 * @param k clave de la entrada
	 * @param v valoe de la entrada
	 */
	public Entrada(K k, V v) {
		clave = k;
		valor = v;
	}

	/**
	 * Devuelve la clave de la entrada
	 * @return K clave de la entrada
	 */
	public K getKey() {
		return clave;
	}

	/**
	 * Devuelve el valor de la entrada
	 * @return V valor de la entrada
	 */
	public V getValue() {
		return valor;
	}

	/**
	 * Establece una nueva clave a la entrada
	 * @param k nueva clave
	 */
	public void setKey(K k) {
		clave = k;
	}

	/**
	 * Establece un nuevo valor a la entrada
	 * @param v nuevo valor
	 */
	public void setValue(V v) {
		valor = v;
	}

	/**
	 * Devuelve un string con la concatenación de la clave y el valor de la entrada
	 * @return string con la concatenación de la clave y el valor de la entrada
	 */
	public String toString() {
	
		return "(" + getKey() + "," + getValue() + ")" ;
	}
}
