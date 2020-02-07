package persistence;

import java.util.List;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import pojos.Libro;

public class PersistenceMongodb {
	
	
	
	
	
	public static void main (String[] args) {
		
		
		cancellatutti();

	}
	
	
	public static void cancellatutti() {
		Morphia morphia = new Morphia();
		morphia.mapPackage("com.baeldung.morphia");
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://"));
		
		
		Datastore datastore = morphia.createDatastore(client, "servername");
		
		Query<Libro> libri = datastore.createQuery(Libro.class).field("titolo").contains("test");
		
		
		
		
		datastore.delete(libri);
		
		
		client.close();
	}
	
	
	
	public static void PrendiDocumento() {
		Morphia morphia = new Morphia();
		morphia.mapPackage("com.baeldung.morphia");
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://"));
		
		
		Datastore datastore = morphia.createDatastore(client, "servername");
		
		
		List<Libro> libri = datastore.createQuery(Libro.class).field("titolo").contains("test").asList();
				 
		
		
				int i =0;
				 
			
		
		client.close();
	}
	
	
	public static void salvaDocumento() {
		Morphia morphia = new Morphia();
		morphia.mapPackage("com.baeldung.morphia");
		
		
		MongoClient client = new MongoClient(new MongoClientURI("mongodb://"));
		Datastore datastore = morphia.createDatastore(client, "servername");
			
		//datastore.ensureIndexes();
		
		

		
		
		for (int i= 0; i<10000;i++) {
		
			Libro libro = new Libro();
			libro.setIsbn("000"+i);
			libro.setAutore("ironblaster"+i);
			libro.setTitolo("test titolo libro"+i);
			libro.setCosto(12.50+i);
			
			datastore.save(libro);
			
		}
		

		

		
		
		
			client.close();
	}
	
	
	
	
	
	
}
