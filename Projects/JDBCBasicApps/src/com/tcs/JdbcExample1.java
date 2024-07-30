package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample1 {

	public static void main(String[] args)  throws ClassNotFoundException,SQLException{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loading completed");
		
        Connection connection=DriverManager.getConnection( "jdbc:oracle:thin:@Localhost:1521:xe","system","admin"); 
	System.out.println("Connection created successfully"+connection);
	
	String q1="Create table emp23(eid number,ename varchar2(30),esal number)";
	
	Statement statement=connection.createStatement();
	int x=statement.executeUpdate(q1);
	System.out.println("Table created successfully");
	
	statement.close();
	connection.close();
	
	System.out.println("Connection closed successfully");
	
	}

}
