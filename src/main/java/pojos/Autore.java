package pojos;

import java.io.Serializable;
import java.util.List;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;




@Entity
public class Autore implements Serializable{
	
	
	@Id
	String nome;
	String cognome;

	private List<String> libri;
	
	
	

	public List<String> getLibri() {
		return libri;
	}
	public void setLibri(List<String> libri) {
		this.libri = libri;
	}
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

	
	
	

}
