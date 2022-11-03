package Auxiliar;


public class Pair <K,V> {
	
	protected K key; 
	protected V value; 
	
	/**
	 * Crea una instancia de Pair con key y value como parámetros
	 * @param key 
	 * @param value
	 */
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	/**
	 * Obtiene la clave almacenada en el par y la retorna
	 * @return K clave del par
	 */
	public K getKey() {
		return key;
	}
	
	/**
	 * Obtiene el valor almacenado en el par y lo retorna
	 * @return V valor del par
	 */
	public V getValue() {
		return value;
	}
	
	/**
	 * Establece una clave al par que recibe por mensaje
	 * @param k clave a establecer
	 */
	public void setKey(K k) {
		key = k;
	}
	
	/**
	 * Establece un valor al par que recibe por mensaje
	 * @param v valor a establecer
	 */
	public void setValue(V v) {
		value = v;
	}
	/**
	 * Devuelve la concatenación entre la clave y el valor almacenado en el par
	 * @return String con la clave y el valor del par
	 */
	public String toString() {
		return "["+getKey() + "," + getValue() + "]";
	}

}