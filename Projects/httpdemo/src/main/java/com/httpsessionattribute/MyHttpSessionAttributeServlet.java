package com.httpsessionattribute;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyHttpSessionAttributeServlet extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
	    String name=request.getParameter("username");	
	    
	    HttpSession session=request.getSession();
                session.setAttribute("username", "Oranium");
                session.setAttribute("username", "Tech");
                session.removeAttribute("username");
	
	}
	
}
