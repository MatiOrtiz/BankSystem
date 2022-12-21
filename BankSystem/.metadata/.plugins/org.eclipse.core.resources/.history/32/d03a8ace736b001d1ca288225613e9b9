package TDADiccionario;

import java.util.Iterator;
import Auxiliar.Position;
import Exceptions.*;
import TDALista.*;

public class DiccionarioHashAbierto<K, V> implements Dictionary<K, V> {

	protected PositionList<Entrada<K, V>>[] A;
	protected int n;
	protected int N = 13;
	protected static final double fc = 0.9;
	
	/**
	 * Crea una instancia de clase DiccionarioHashAbierto
	 */
	@SuppressWarnings("unchecked")
	public DiccionarioHashAbierto() {
		A = (ListaDoblementeEnlazada<Entrada<K, V>>[]) new ListaDoblementeEnlazada[N];
		n = 0;
		for (int i = 0; i < A.length; i++) {
			A[i] = new ListaDoblementeEnlazada<Entrada<K, V>>();
		}
	}
	
	/**
	 * Devuelve el valor hash
	 * @param key clave a calcular
	 * @return valor hash
	 */
	private int H(K key) {
		return key.hashCode() % N;
	}


	public int size() {
		return n;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public Entry<K,V> find(K key) throws InvalidKeyException {
		checkKey(key);
		Entry<K, V> ret = null;
		int clave = H(key);
		Iterator<Entrada<K, V>> it = A[clave].iterator();
		boolean esta = false;

		Entrada<K, V> act = it.hasNext() ? it.next() : null;
		while (!esta && act != null) {
			if (key.equals(act.getKey())) {
				esta = true;
				ret = act;
			} else {
				act = it.hasNext() ? it.next() : null;
			}
		}
		return ret;
	}


	public Iterable<Entry<K, V>> findAll(K key) throws InvalidKeyException {
		checkKey(key);
		PositionList<Entry<K, V>> lista = new ListaDoblementeEnlazada<Entry<K, V>>();
		int clave = H(key);

		for (Entry<K, V> elem : A[clave]) {
			if (key.equals(elem.getKey())) {
				lista.addLast(elem);
			}
		}
		return lista;
	}


	public Entry<K, V> insert(K key, V value) throws InvalidKeyException {
		checkKey(key);

		if (n / N >= fc)
			rehash();
		int clave = H(key);
		Entrada<K, V> nueva = new Entrada<K, V>(key, value);
		A[clave].addLast(nueva);
		n++;
		return nueva;
	}


	public Entry<K, V> remove(Entry<K, V> e) throws InvalidEntryException {
		if (e == null)
			throw new InvalidEntryException("Entrada Invalida");
		int clave = H(e.getKey());
		PositionList<Entrada<K, V>> l = A[clave];
		Position<Entrada<K, V>> cursor = null;
		Iterator<Position<Entrada<K, V>>> it = l.positions().iterator();
		Entry<K, V> salida = null;
		while (it.hasNext() && salida == null) {
			cursor = it.next();
			if (cursor.element() == e) {
				salida = cursor.element();
				try {
					l.remove(cursor);
				} catch (InvalidPositionException ex) {
					ex.getMessage();
				}
				n--;
			}
		}
		if (salida == null)
			throw new InvalidEntryException("La entrada no se encuentra en el diccionario");

		return salida;
	}


	public Iterable<Entry<K, V>> entries() {
		PositionList<Entry<K, V>> lista = new ListaDoblementeEnlazada<Entry<K, V>>();
		for (int i = 0; i < N; i++) {
			for (Entry<K, V> en : A[i]) {
				lista.addLast(en);
			}
		}
		return lista;
	}

	/**
	 * Chequea si la clave es nula, si es nula lanza una InvalidKeyException
	 * @param key clave a chequear
	 * @throws InvalidKeyException si la posicion es nula
	 */
	private void checkKey(K key) throws InvalidKeyException {
		if (key == null)
			throw new InvalidKeyException("Clave invalida");
	}

	/**
	 * Crea una tabla hash más grande, luego inserta todas las entradas de la tabla antigua en la nueva
	 */
	@SuppressWarnings("unchecked")	
	private void rehash() {
		Iterable<Entry<K, V>> entradas = entries();
		N = proximo_primo(N * 2);
		A = (PositionList<Entrada<K, V>>[]) new ListaDoblementeEnlazada[N];
		n = 0;
		for (int i = 0; i < N; i++)
			A[i] = new ListaDoblementeEnlazada<Entrada<K, V>>();
		for (Entry<K, V> e : entradas)
			try {
				insert(e.getKey(), e.getValue());
			} catch (InvalidKeyException ex) {
				ex.getMessage();
			}

	}

	/**
	 * Devuelve el siguiente número primo del número pasado por parámetro
	 * @param n entero 
	 * @return siguiente número primo de n
	 */
	private int proximo_primo(int n) {
		boolean es = false;
		n++;
		while (!es) {
			if (esPrimo(n))
				es = true;
			else
				n++;

		}
		return n;
	}

	/**
	 * Devuelve true si el número pasado por parámetro es primo y falso en caso contrario
	 * @param n entero
	 * @return true si el número pasado por parámetro es primo y falso en caso contrario
	 */
	private boolean esPrimo(int n) {
		boolean es = false;
		int divisor = 2;
		while (divisor < n && !es) {
			if (n % divisor == 0)
				es = true;
			else
				divisor++;
		}
		return es;
	}

	public Iterable<V> eliminarTodos(K key) throws InvalidKeyException{
		if(key == null)
			throw new InvalidKeyException("Clave nula");
		PositionList<V> lista = new ListaDoblementeEnlazada<V>();
		try {
		for(Entry<K, V> e : findAll(key)) {
			lista.addLast(remove(e).getValue());
		}
		}catch(InvalidEntryException e) {
			e.printStackTrace();
		}
		return lista;
	}

}
