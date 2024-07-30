package com.servletfilterdemo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/login")
public class AuthenticationFilter implements Filter {

	@Override

	

		public void doFilter(ServletRequest request,ServletResponse response,FilterChain filterchain)throws IOException,ServletException
		{
			HttpServletRequest req=(HttpServletRequest)request;
					HttpServletResponse res=(HttpServletResponse)response;
					
					String user=req.getParameter("username");
					String pwd=req.getParameter("password");
					
					if(user.equals("admin")&& pwd.equals("admin"))
					{
						filterchain.doFilter(request, response);
					}
					else {
						res.sendRedirect("index.html");
					}
		
	}
	
	}

	

	
	


	

