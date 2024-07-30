package com.Email;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class SecondServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response )throws ServletException ,IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 
		
		    Cookie[] cookies=request.getCookies();
		    if(cookies != null)
			{
				for(Cookie c:cookies)
				{
					String tname=c.getName();
					String temail=c.getName();
					
					if(tname.equals("uname")&&temail.equals("email"))
					{
						String name=c.getValue();
						String email=c.getValue();
						out.println("<h1> hi,"+ name+ email+"welcome</h1>");
					}
				}
			}
			else
			{
				out.println("You are new please login");
			}
		
	}
}
