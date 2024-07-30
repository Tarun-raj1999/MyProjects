package com.hiddenForm1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	public void doPost (HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		
		out.println("<form action=secondservlet >");
		out.println("<input type='text' name='tname' value="+name+"/>");
		out.println("<input type='text' name='temail' value="+email+"/>");
		out.println("<input type='submit'/>");
		out.println("</form>");
		
				
	}
}
