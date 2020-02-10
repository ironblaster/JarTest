package persistence;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import pojos.Libro;

public class PersistenceMongodb {
	
	
	private static String url="mongodb://test:test@172.16.16.65:27017";
	private static String db="PersistenceMongodb";
	
	static Morphia morphia;
	static MongoClient client;
	static Datastore datastore;
	static {
		morphia = new Morphia();
		morphia.mapPackage("com.baeldung.morphia");
		client = new MongoClient(new MongoClientURI(url));
		datastore = morphia.createDatastore(client,db);
	}
	
	
	
	
	
	
	
	public static void main (String[] args) {
		
		try {
		cancellatutti();
		//salvaDocumento();
		
		
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {client.close();}
		

	}
	
	
	public static void cancellatutti() {
		
		Query<Libro> libri = datastore.createQuery(Libro.class).field("titolo").contains("test");
		datastore.delete(libri);
	}
	
	
	
	
	
	public static void PrendiDocumento() {
		List<Libro> libri = datastore.createQuery(Libro.class).field("titolo").contains("test").asList();
				 
		
		int i =0;
	}
	
	
	
	
	public static void salvaDocumento() {
		
		for (int i= 0; i<100000;i++) {
		
			Libro libro = new Libro();
			libro.setIsbn("000"+i);
			libro.setAutore("ironblaster"+i);
			libro.setTitolo("test titolo libro"+i);
			libro.setCosto(12.50+i);
			
			datastore.save(libro);
			System.out.println(i);
		}
		
	
	}
	
	
	
	
	
	
}
