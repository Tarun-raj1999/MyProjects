package jDBCcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateProcess {
	
	public CreateProcess(String name,int age,String gender)
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kalviibatch","root","");
		Statement st=con.createStatement();
		int i=st.executeUpdate("Insert into student values(id,'"+name+"','"+age+"','"+gender+"')");
System.out.println(i);
		if(i==1)
		{
			System.out.println("Inserted");
		}
		con.close();
	}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		CreateProcess sc=new CreateProcess("arjun",30,"male");
	}
	

}
