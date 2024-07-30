package MyServletRequestDemo;

import javax.print.attribute.PrintRequestAttribute;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class MyServletRequestListenerAttribute  implements ServletRequestAttributeListener{

	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("\n i am in Attribute Removed Method");
   System.out.println(srae.getName()+ " and "+srae.getValue() );   
	}
	
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("\n i am in Attribute Replaced Method");
		   System.out.println(srae.getName()+ " and "+srae.getValue() );   
	}
	
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("\n i am in Attribute Added Method");
		   System.out.println(srae.getName()+ " and "+srae.getValue() );  
	}
}
