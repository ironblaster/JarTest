package persistence;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import pojos.PojoTest;

public class PersistenceSqLite {
	
	
	public static void main (String[] args) throws SQLException, IOException {
		
		
		leggi();
		
	
	}
	
	
	
	private static void leggi() throws SQLException {
		
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/temp/sqliteironblaster.db");
		
		
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("SELECT * FROM `persone`");
		
    	                                                                                                                                                                                                                                                                                                                                             
    	while (rs.next()) {
    		
    		if(rs.getBytes("numeri")!=null) {
    			PojoTest test = read(rs.getBytes("numeri"));
    			System.out.println(test.getNome());
    			System.out.println(test.getCognome());
    			
    			for (Long num : test.getNumeri())
    				System.out.println(num);
    			
    		}
    			
    		
    	}
		rs.close();
		stmt.close();
		conn.close();

	}
	
	
	
	
	private static void scrivi() throws SQLException {
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
		
		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/temp/sqliteironblaster.db");
		
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO `persone` VALUES (?,?,?);");
		
		
		
		
		stmt.setString(1, "prova nome 1");
		stmt.setString(2, "prova cognome 1");
		try {
		stmt.setBytes(3,makebyte(prova));}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		stmt.execute();
		stmt.close();
		conn.close();
		
	}
	
	
	
	
	
	
	
	public static byte[] makebyte(PojoTest modeldata) {
        try {

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(modeldata);
            byte[] employeeAsBytes = baos.toByteArray();
            return employeeAsBytes;
           
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
	
	
	
	
	
	private static PojoTest read(byte[] data) {
	    try {


	        ByteArrayInputStream baip = new ByteArrayInputStream(data);
	        ObjectInputStream ois = new ObjectInputStream(baip);
	        PojoTest dataobj = (PojoTest) ois.readObject();
	        return dataobj ;

	    } catch (IOException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
	
	

}














