package com.URLDemo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SecondServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
	    response.setContentType("text/html");
	    PrintWriter out =response.getWriter();
	    
	    String Sname=request.getParameter("name");
	    String Semail=request.getParameter("email");
	    
	    out.println("<h1> Your name is"+ Sname +"and your email id is " +Semail + "</h1>");
		
	}
}