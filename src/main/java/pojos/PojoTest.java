package pojos;

import java.io.Serializable;
import java.util.Collection;

public class PojoTest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nome;
	String cognome;
	
	Collection<Long> numeri;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Collection<Long> getNumeri() {
		return numeri;
	}

	public void setNumeri(Collection<Long> numeri) {
		this.numeri = numeri;
	}
}
