package com.servletfilterdemo;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/login")
public class LogFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req =(HttpServletRequest) request;
				String remoteAddr=req.getRemoteAddr();
		String dateString=new Date(0).toString();
				
		System.out.println("The address is the client machine is "+remoteAddr+"\n and the time is "+ dateString);
		
		chain.doFilter(request, response);
		
	}

}
