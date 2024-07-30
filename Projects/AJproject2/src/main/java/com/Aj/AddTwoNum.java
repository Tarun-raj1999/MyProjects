package com.Aj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTwoNum extends HttpServlet{

	public void doPost (HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException
	{
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		 int num2=Integer.parseInt(request.getParameter("num2"));
		String addition=request.getParameter("add");
		
		 request.setAttribute("number1", num1);
		 request.setAttribute("number2", num2);
		 
		  if(addition.equals("add")) {
		   RequestDispatcher rDispatcher=request.getRequestDispatcher("Addition");
			rDispatcher.forward(request, response);
		  }
		  else if(addition.equals("sub")){
			  RequestDispatcher rDispatcher=request.getRequestDispatcher("Sub");
			  rDispatcher.forward(request, response);
		  }
		  else if(addition.equals("mul")) {
			  RequestDispatcher rDispatcher=request.getRequestDispatcher("Mul");
			  rDispatcher.forward(request, response);
			  
		  }
		  else if(addition.equals("div"))
				  {
			         RequestDispatcher rDispatcher=request.getRequestDispatcher("Div");
			         rDispatcher.forward(request, response);
				  }
		  else if(addition.equals("mod"))
		  {
			  RequestDispatcher rDispatcher=request.getRequestDispatcher("Mod");
			  rDispatcher.forward(request, response);
		  }
	
		   
	}
}