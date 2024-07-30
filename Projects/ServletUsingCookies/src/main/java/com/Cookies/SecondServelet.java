package com.Cookies;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServelet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	Cookie[] cookies =request.getCookies();
		
	if(cookies != null)
	{
		for(Cookie c:cookies)
		{
			String tname=c.getName();
			if(tname.equals("uname"))
			{
				String name=c.getValue();
				out.println("<h1> hi,"+ name+"welcome</h1>");
			}
		}
	}
	else
	{
		out.println("You are new please login");
	}

	

}
}