package com.servletfilterdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{

		response.setContentType("text/html");
		
	PrintWriter out=response.getWriter();
	
	String name=request.getParameter("username");
	String pwd=request.getParameter("password");
	
	out.println("Hii!"+name+"Welcome to oranium");
		

}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{

		
		doGet(request,response);

}
	
	
	
}
