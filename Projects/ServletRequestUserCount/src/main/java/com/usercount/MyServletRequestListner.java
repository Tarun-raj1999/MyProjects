package com.usercount;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListner implements ServletRequestListener {
	
	public static int count=0;
	
	public void requestInitialized(ServletRequestEvent sRequestEvent)
	{
	     //ServletRequest servletRequest=sRequestEvent.getServletRequest();
	    
		count++;
	}
	public void requestDestroyed()
	{
	  count--	;
	}

	
}
