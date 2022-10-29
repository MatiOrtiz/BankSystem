package TDAMapeo;

public interface Entry<K,V> {
	
	/**
	 * Devuelve la clave de la entrada
	 * @return K clave de la entrada
	 */
	public K getKey();

	/**
	 * Devuelve el valor de la entrada
	 * @return V valor de la entrada
	 */
	public V getValue();

}
