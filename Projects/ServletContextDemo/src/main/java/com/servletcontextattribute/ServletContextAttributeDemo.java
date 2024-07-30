package com.servletcontextattribute;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletContextAttributeDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext servletContext=getServletContext();
		servletContext.setAttribute("company Name","oranium");
		//mysleep();
		servletContext.setAttribute("company Name","oranium");
		//mysleep();
		servletContext.removeAttribute("company name");
		
		
		
	
	}
	private void mysleep() {
		try {
			Thread.sleep(100000);
		}catch(InterruptedException e)
		{
			
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
