package MyServletRequestDemo;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServletRequestAttribute extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		request.setAttribute("company", "oranium");
		request.setAttribute("college", "Engineering");
		request.setAttribute("company", "oranium tech");
		request.removeAttribute("company");
	}

	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		doGet(request,response);
	}
}
