package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcExample2 {

	public static void main(String[] args) {
		
		Connection connection =null;
		Statement statement=null;
		try {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("Driver loading complted...");
		   
		   connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
		System.out.println("Connection created sucessfullly"+connection);
		
	statement=connection.createStatement();
	
  int x=statement.executeUpdate("drop table emp23");
	System.out.println("table droped successfully...."+x);
	
		}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
   finally {
	   try {
	        if(statement!=null)statement.close();   
	       if(connection!=null) connection.close();
	        
         }
	   catch(SQLException e)
	   {
		   e.printStackTrace();
	   }
   }
	}

}
