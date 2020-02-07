package persistence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Serializer;

import pojos.PojoTest;

public class PersistenceMapDb {
	
	
	static DB database = DBMaker.fileDB("test.Db").closeOnJvmShutdown().make();
	
	
	
	static Map<String,PojoTest> mappa = database.hashMap("persone",Serializer.STRING,Serializer.JAVA).createOrOpen();	
	
	
	
	
	public static void main (String[] args) {
		
		

		
		ricevidati();
		
		
	
	}
	
	
	
	
	
	
	private static void salvadati(){
		
		PojoTest prova = new PojoTest();
		prova.setCognome("cognome");
		prova.setNome("nome");
		Collection<Long> numeri = new ArrayList<Long>();
		numeri.add(123456789l);
		numeri.add(1246783456789l);
		numeri.add(12345667899l);
		numeri.add(12345665439l);
		numeri.add(1000456789l);
		numeri.add(12456456789l);
		prova.setNumeri(numeri);
		
		mappa.put("prova1", prova);
		database.commit();	
		
		
	}
	
	
	
	private static void ricevidati() {
		
		
		PojoTest test = mappa.get("prova1");
		
		System.out.println(test.getNome());
		System.out.println(test.getCognome());
		
		for (Long num : test.getNumeri())
			System.out.println(num);
		
		
		
		
	}
	
	
	
	
	

}

















