package com.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String area=request.getParameter("area");
		HttpSession obj=request.getSession();
	
		obj.setAttribute("username", name);
		obj.setAttribute("email", email);
		obj.setAttribute("area", area);
		out.println("<h1> hii " + name +" your email id is " +email + " your area of intrest is "+ area +"</h1>");
		out.println("<a href='secondservlet'> go to next page</a>" );
		
	}

}
