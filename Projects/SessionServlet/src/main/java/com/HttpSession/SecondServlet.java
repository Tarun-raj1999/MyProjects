package com.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession obj =request.getSession();
		String name=(String)obj.getAttribute("username");
		String email=(String)obj.getAttribute("email");
		String area=(String)obj.getAttribute("area");
		
		
		out.println("<h1>Hii " + name + " your email id is "+ email + " your area of intrest " + area+ " </h1>");
		
		
	}

}
