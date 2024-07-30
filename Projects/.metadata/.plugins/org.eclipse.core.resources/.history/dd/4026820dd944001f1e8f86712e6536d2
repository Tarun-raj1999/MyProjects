package com.URLDemo2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstServlet extends HttpServlet {
  
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		
		
		out.println("<h1> Hii"+ name + "my email id is " + email + "</h1>"  );
		out.println("<a href=secondservlet?user="+ name + "&email=" + email +">Go to next page</a>");
		
		
	}

}
