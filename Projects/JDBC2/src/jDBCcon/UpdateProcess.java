package jDBCcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateProcess {
	
	public UpdateProcess(pojo a)
	{try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kalviibatch","root","");
       // Statement st=con.createStatement();
        //int i=st.executeUpdate("update student set name='"+name+"',age='"+age+"',gender='"+gender+"' where id='"+id+"'");
	PreparedStatement ps=con.prepareStatement("update student set name=?,age=?,gender=? where id=?");
	ps.setString(1, a.getName());
	ps.setInt(2, a.getAge());
	ps.setString(3, a.getGender());
	ps.setInt(4, a.getId());
	int i=ps.executeUpdate();
	
	
		System.out.println(i);
        if(i==1)
	{
		System.out.println("updated");
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
		//
	     pojo p=new pojo();
	     p.setAge(30);
	     p.setGender("male");
	     p.setId(5);
	     p.setName("kishore");
	     System.out.println(p);
	     UpdateProcess up=new UpdateProcess(p);
	     
	}

}
