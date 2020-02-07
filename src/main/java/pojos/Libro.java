package pojos;

import java.io.Serializable;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;


@Entity("libro")
public class Libro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String isbn;
	private String titolo;
	private String autore;
	@Property("prezzo")
	private double costo;
	
	
	
	/*public Libro(String isbn,String titolo,String autore,double costo) {
		
		setIsbn(isbn);
		setTitolo(titolo);
		setAutore(autore);
		setCosto(costo);
		
	}*/
	
	
	public String getIsbn() {
		return isbn;
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
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
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
