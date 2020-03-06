package persistence;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import pojos.Autore;
import pojos.Libro;

public class PersistenceMongodb {
	
	
	private static String url="mongodb://test:test@172.16.16.65:27017";
	private static String db="provaMap";
	
	static Morphia morphia;
	static MongoClient client;
	static Datastore datastore;
	static {
		morphia = new Morphia();
		morphia.mapPackage("com.baeldung.morphia");
		client = new MongoClient(new MongoClientURI(url));
		datastore = morphia.createDatastore(client,db);
		datastore.ensureIndexes();
	}
	
	
	
	
	
	
	
	public static void main (String[] args) {
		
	try { 
		

		salvaDocumento();
			
			
		
			
			
		//cancellatutti();
		//salvaDocumento();
		
		/*Map <String,String> mappa = new HashMap<>();
		
		
	
		//test[1]="prova 1";
		//test[2]="prova 2";
		
		mappa.put("1010", "test");
		mappa.put("1012", "te5st");333333333                                         
		mappa.put("104510", "tes46t");
		
		
		DBCollection test = datastore.getCollection(Map.class);
		
		datastore.save(new BasicDBObject(mappa));*/
		
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
		List<Libro> libri = datastore.createQuery(Libro.class).field("titolo").contains("principale").asList();
				
		
	
		
		
		int i =0;
	}
	
	
	
	
	public static void salvaDocumento() throws IOException {
		
		Autore autore = new Autore();
		autore.setNome("salvatore");
		autore.setCognome("esposito");
		
		
		
			Libro libro = new Libro();
			libro.setIsbn("000");
			libro.setAutore(autore);
			libro.setTitolo("test titolo libro principale");
			libro.setCosto(12.50);
			
			Libro secondo = new Libro();
			secondo.setIsbn("001");
			secondo.setAutore(autore);
			secondo.setTitolo("test titolo secondo libro");
			secondo.setCosto(10.30);
			
			libro.addCorrelato(secondo);
			
			
			datastore.save(libro);
			datastore.save(secondo);
		
		
	
	}

	
}