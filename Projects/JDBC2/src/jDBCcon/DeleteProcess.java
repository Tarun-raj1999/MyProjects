package jDBCcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteProcess {

	public DeleteProcess(int id)
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kalviibatch","root","");
		Statement st=con.createStatement();
		int i=st.executeUpdate("delete from student where id='"+id+"'");
		
		System.out.println(i);
		if(i==1)
		{
			System.out.println("Deleted");
		}
		else {
			System.out.println("user not found");
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
		DeleteProcess dp=new DeleteProcess(7);
	}
}