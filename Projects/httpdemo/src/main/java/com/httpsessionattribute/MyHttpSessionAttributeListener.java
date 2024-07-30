package com.httpsessionattribute;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpSessionAttributeListener implements HttpSessionAttributeListener{
	
	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println(se.getName()+se.getValue());
		System.out.println("i am Http session Attribute Replaced");
		
	}
	
public void attributeRemoved(HttpSessionBindingEvent se) {
	System.out.println(se.getName()+se.getValue());
	System.out.println("i am Http session Attribute Removed");
		
	}


public void attributeAdded(HttpSessionBindingEvent se) {
	System.out.println(se.getName()+se.getValue());
	System.out.println("i am Http session Attribute Added");
}


}