package com.tel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	 public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	 {
		response.setContentType("text/html");
		String name=request.getParameter("Username");
		String password=request.getParameter("password");
		
		PrintWriter out =response.getWriter();
		out.println("<h1>Name"+name+"</h1>");
		out.println("<h1>password"+password+"</h1>");
	 
	 }
}
