package com.phase2.asst8;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class lgnservlet  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String token= request.getParameter("userid");
		
		out.print("<form  action='dashboard' method='post'>");
		out.print("<input type='hidden'name='userid' value='"+token+"'>");
		out.print("<input type='submit' value='Dashboard'>");
		out.print("</form>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
