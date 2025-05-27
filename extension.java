package com.cyber;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class extension extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	
	{
		HttpSession session= request.getSession();
	int k = (int)session.getAttribute("k");
	
	k*=k;
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor='blue'><center>Welcome to Programming</br> the answer is " + k + "</center></body>");
		
	}
}
