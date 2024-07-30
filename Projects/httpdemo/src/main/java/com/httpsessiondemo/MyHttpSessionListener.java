package com.httpsessiondemo;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


 
public class MyHttpSessionListener implements HttpSessionListener{
	public static int totaluser=0, currentuser=0;
	
	public void sessionCreated(HttpSessionEvent se)
	{
	  totaluser++;
	  currentuser++;
	  System.out.println(totaluser);
	  System.out.println(currentuser);
	}
	public void sessionDestroyed(HttpSessionEvent se)
	{
	currentuser--;	
	}

}
