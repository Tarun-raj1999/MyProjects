package com.AdvanceJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdvanceJava extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String name=request.getParameter("username");
		String password=request.getParameter("password");
		
		
		
		
		PrintWriter out=response.getWriter();
		out.println("<h1>Name"+name+"</h1>");
		out.println("<h1>Password"+password+"</h1>");
		
		request.setAttribute("valuetoservlet", name);	
		if(password.equals("oranium"))
		{
			RequestDispatcher rDispatcher =request.getRequestDispatcher("PasswordVerification");
			rDispatcher.forward(request, response);
			
		}
		else {
			out.println("please enter the correct password");
			RequestDispatcher rDispatcher=request.getRequestDispatcher("index.html");
			rDispatcher.include(request,response);
		}
		
		
	}

	
	
}
