package com.servletcontextattribute;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	public void attributeAdded( ServletContextAttributeEvent objServletContextAttributeEvent)
	{
		System.out.println("Attribute added method called and its name=" +objServletContextAttributeEvent.getName()+"value"+ objServletContextAttributeEvent.getValue());
	}
	
	public void attributeRemoved( ServletContextAttributeEvent objServletContextAttributeEvent)
	{
		System.out.println("Attribute Removed method is called and its name=" +objServletContextAttributeEvent.getName()+ objServletContextAttributeEvent.getValue());
	}
	
	public void attributeReplaced( ServletContextAttributeEvent objServletContextAttributeEvent)
	{
		System.out.println("Attribute Replaced method is called and its name=" +objServletContextAttributeEvent.getName()+ objServletContextAttributeEvent.getValue());
	}
}
