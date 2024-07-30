package com.servletcontext;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class servletContextListenerDemo implements ServletContextListener{



	public void contextInitialized(ServletContextEvent objsce)
	{
		ServletContext servletContext=objsce.getServletContext();
		
		System.out.println(servletContext + "has been initialized");
	}
	
	public void contextDestroyed(ServletContextEvent objsce)
	{
		ServletContext servletContext=objsce.getServletContext();
		System.out.println(servletContext + "has been initialized");
	}
	
}