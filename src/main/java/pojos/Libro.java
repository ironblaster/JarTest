package pojos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import xyz.morphia.annotations.Embedded;
import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;
import xyz.morphia.annotations.Property;
import xyz.morphia.annotations.Reference;




@Entity("libro")
public class Libro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String isbn;
	private String titolo;
	@Embedded
	private Autore autore;
	@Property("prezzo")
	private double costo;
	@Reference
	private List<Libro> correlati= new ArrayList<>();
	
	
	
	/*public Libro(String isbn,String titolo,String autore,double costo) {
		
		setIsbn(isbn);
		setTitolo(titolo);
		setAutore(autore);
		setCosto(costo);
		
	}*/
	
	
	public void addCorrelato(Libro libro) {
		correlati.add(libro);
	}
	
	public String getIsbn() {
		return isbn;
	}
	public List<Libro> getCorrelati() {
		return correlati;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public Autore getAutore() {
		return autore;
	}
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}
