package com.servletrequestdemo;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener{

	static int count=0;
	public void requestInitialized(ServletRequestEvent sre)
	{
		count++;
		System.out.println( sre.getServletRequest()+"Request Initialized");
	}
	
	public void requestDestroyed(ServletRequestEvent sre)
	{
		System.out.println(sre.getServletRequest()+"Request Destroyed");
	}
}