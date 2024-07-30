package com.Aj;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
public class Div extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		
		response.setContentType("text/html");
		
		int i=(int) request.getAttribute("number1");
		int j=(int) request.getAttribute("number2");
		int k=i/j;
		
		PrintWriter out=response.getWriter();
		out.println("<h1>The division of two numbers are"+k+"</h1>");
		
	}
}
