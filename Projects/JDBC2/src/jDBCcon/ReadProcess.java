package jDBCcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadProcess {

	public ReadProcess(int id)
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kalviibatch","root","");
		Statement st=con.createStatement(); 
	ResultSet rs=	st.executeQuery("select * from student where id='"+id+"'");
	while(rs.next())
	{
		System.out.println(rs.getInt("id")+"  |  "+ rs.getString(2));
	}
	con.close();
	
		}
		catch(ClassNotFoundException e) {
                     e.printStackTrace();			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		ReadProcess sc=new ReadProcess(7);
	}
}
