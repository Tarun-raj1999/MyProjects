package com.AdvanceJava;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PasswordVerification extends HttpServlet {

	public void doPost(HttpServletRequest request , HttpServletResponse response) throws  ServletException,IOException 
	{
		response.setContentType("text/html");
		
	String nameString=(String)	request.getAttribute("valuetoservlet");
	
	
		PrintWriter out=response.getWriter();
		out.println("<h1>Welcome"+nameString+"</h1>");
		
		
		
}
}