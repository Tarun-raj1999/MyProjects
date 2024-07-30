package com.httpsessiondemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		
		HttpSession session=request.getSession();
		session.setAttribute("User", name);
		
		out.println("Total users="+ MyHttpSessionListener.totaluser);
		out.println("Current users="+MyHttpSessionListener.currentuser);
		out.println("<a href='logoutservlet'>Logout</a>");
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		doGet(request,response);
	}

}
