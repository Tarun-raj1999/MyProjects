package com.Email;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	  String name=request.getParameter("uname");
	  String email=request.getParameter("email");
	  out.println("<h1>Hii"+ name + "youe email id is "+ email+"</h1>"   );
	  out.println("<a href=SecondServlet> Go to next page");
	  
	  Cookie cookie=new Cookie("uname",name);
	  response.addCookie(cookie);
	  
	  Cookie cookie1=new Cookie("email",email);
	  response.addCookie(cookie1);
		  
	}

}