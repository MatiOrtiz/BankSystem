package Programa;
import TDAMapeo.*;
import Exceptions.*;
import TDAPila.*;
import TDACola.*;
import TDALista.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import Auxiliar.*;
import TDAColaCP.*;

public class CuentaBancaria {

	//Tributes
	protected String accessCode, firstName, lastName;
	protected int docNumber;
	protected float initialAmount, amount;
	protected PositionList <Transaccion> transactionsHistory;
	
	//Constructors
	public CuentaBancaria(String firstName, String lastName, int docNumber,  String accessCode, float initialAmount) throws InvalidAccessCodeException{
		this.firstName= firstName;
		this.lastName= lastName;
		if(checkCode(accessCode))
			this.accessCode= accessCode;
		this.docNumber= docNumber;
		this.initialAmount= initialAmount;
		this.amount+= this.initialAmount;
		transactionsHistory= new DoubleLinkedList<Transaccion>();
	}
	public CuentaBancaria(String firstName, String lastName, int docNumber, String accessCode) throws InvalidAccessCodeException{
		this(firstName, lastName, docNumber, accessCode, 0);
		amount+= initialAmount;
	}
	
	//Methods
	public boolean checkCode(String code) throws InvalidAccessCodeException{
		boolean aux= false;
		Stack<Character> stack1= new PilaConEnlaces<Character>();
		Stack<Character> stack2= new PilaConEnlaces<Character>();
		Queue<Character> queue= new ColaConArregloCircular<Character>();
		
		if(lastName.length() >= code.length()) {
			aux = false;
			throw new InvalidAccessCodeException("ERROR: La clave de acceso es incorrecta.");
		}
		else {
		for(int i=0; i<lastName.length(); i++) {
			queue.enqueue(lastName.charAt(i));
			stack1.push(lastName.charAt(i));
			stack2.push(lastName.charAt(i));
		}
		queue.enqueue('x');
		
		try {
			while(!stack1.isEmpty())
				queue.enqueue(stack1.pop());
			while(!stack2.isEmpty())
				queue.enqueue(stack2.pop());
			if(queue.size() != code.length()) {
				throw new InvalidAccessCodeException("ERROR: La clave de acceso es incorrecta.");
			}
			else {
			for(int i=0; i<code.length() && !aux; i++) {
				if(queue.dequeue()!=code.charAt(i)) {
					throw new InvalidAccessCodeException("ERROR: La clave de acceso es incorrecta.");
				}	
			}
			aux = true;
			}
		}catch(EmptyStackException | EmptyQueueException e) {
			e.printStackTrace();
		}
		}
		return aux;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public float getAmount() {
		return amount;
	}
	public void transferences(String firstName, String lastName, int docNumber, String payType, float amountTransference) throws InsuficientAmountException {
		if(amount>=amountTransference) {
			amount-=amountTransference;
			Transaccion transference= new Transaccion(firstName, lastName, docNumber,"Débito", amountTransference);
			transactionsHistory.addLast(transference);
		}
		else throw new InsuficientAmountException("ERROR: Saldo insuficiente.");
	}
	public void deposites(String firstName, String lastName, int docNumber, String payType, float amountDeposite) {
		amount+= amountDeposite;
		Transaccion transference= new Transaccion(firstName, lastName, docNumber, "Crédito", amountDeposite);
		transactionsHistory.addLast(transference);
	}
	public String nTrans(int n) {
		String aux = "";
		try {
			Position<Transaccion> pos= transactionsHistory.last();
			for(int i=0; i<n; i++) {
				aux = aux+"\n"+pos.toString();
				pos= transactionsHistory.prev(pos);
			}
		}catch(EmptyListException | BoundaryViolationException | InvalidPositionException e){e.printStackTrace();}
		return aux;
	}
	
	public String nTransMayorValor(int n) {
		PriorityQueue<Float, Transaccion> cp= new Heap<Float, Transaccion>(transactionsHistory.size(), new Comparador<Float>());
		String aux = "";
		try {
			for(Transaccion t : transactionsHistory) {
				cp.insert(t.getAmount(), t);
			}
			for(int i=0; i<n; i++) {
				aux = aux+"\n"+cp.removeMin().getValue().toString();
			}
		}catch(InvalidKeyException | EmptyPriorityQueueException e) {
			e.printStackTrace();
		}
		return aux;
	}
	
	public String operacionMismoValor(float valor) {
		Dictionary<Float, Transaccion> d = new DiccionarioHashAbierto<Float, Transaccion>();
		String aux ="";
		try {
			for(Transaccion t : transactionsHistory) {
				d.insert(t.getAmount(), t);
			}
			if(d.find(valor).getKey() != null) {
				for(Entry<Float, Transaccion> j : d.findAll(valor)){
					
						aux = aux +"\n"+j.toString();
				}
			}
		}catch(InvalidKeyException e) {
			e.printStackTrace();
		}
		return aux;
	}
	
	public String dateTransactions(int dia, int mes, int año) throws InvalidDateException{
		if(!validarFecha(dia, mes, año))
			throw new InvalidDateException("La fecha ingresada es invalida");
		String aux = "";
		Iterator<Transaccion> it = transactionsHistory.iterator();
		while(it.hasNext()) {
			Transaccion t = it.next();
			if(t.getDay() == dia && t.getMonth() == mes && t.getYear() == año) {
				aux = aux+"\n"+t.toString();
			}
		}
		return aux;
	}
	private boolean validarFecha(int dia, int mes, int año) {
		String aux = dia+"/"+mes+"/"+año;
		try {
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			formatoFecha.setLenient(false);
			formatoFecha.parse(aux);
		}catch(ParseException e) {
			return false;
		}
		return true;
	}
	
	public String amountTransactions(float amount, String payType) {
		String aux= "";
		if(payType.equals("Crédito")) {
			Iterator<Transaccion> it = transactionsHistory.iterator();
			while(it.hasNext()) {
				Transaccion t = it.next();
				if(amount < t.getAmount() && t.getPayType().equals("Crédito")) {
					aux = aux+"\n"+t.toString();
				}
			}
		}
		if(payType.equals("Débito")) {
			Iterator<Transaccion> it = transactionsHistory.iterator();
			while(it.hasNext()) {
				Transaccion t = it.next();
				if(amount < t.getAmount() && t.getPayType().equals("Débito")) {
					aux = aux+"\n"+t.toString();
				}
			}
		}
		if(payType.equals(null)) {
			Iterator<Transaccion> it = transactionsHistory.iterator();
			while(it.hasNext()) {
				Transaccion t = it.next();
				if(amount < t.getAmount()) {
					aux = aux+"\n"+t.toString();
				}
			}
		}
		return aux;
	}
	
	public float saldoEnDeterminadaFecha(int dia, int mes, int año) throws InvalidDateException{
		if(!validarFecha(dia, mes, año))
			throw new InvalidDateException("La fecha ingresada es invalida");
		float auxAmount = amount;
		try {
			Position<Transaccion> pos = transactionsHistory.last();
			boolean encontre = true;
			while(transactionsHistory.prev(pos) != null && !encontre) {
				if(pos.element().getPayType().equals("Crédito"))
					auxAmount += pos.element().getAmount();
					else
						auxAmount -= pos.element().getAmount();
				if(pos.element().getDay()==dia && pos.element().getMonth()==mes && pos.element().getYear()==año)
					encontre=true;
				else pos= transactionsHistory.prev(pos);
			}
		}catch(BoundaryViolationException | EmptyListException | InvalidPositionException e) { e.printStackTrace();}
		return auxAmount;
	}
}