package com.usercount;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestEventDemo extends HttpServlet {

	//public static int count=0;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter() ;
		out.println("The user count is"+MyServletRequestListner.count);
	}
}