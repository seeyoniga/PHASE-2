package com.phase2.asst10;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class Dservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		PrintWriter out=  response.getWriter();
		
		response.setContentType("text/html");
		
		
		HttpSession session= request.getSession(false);
		
		
		if(session!=null) {
			
			String userFromSession=(String) session.getAttribute("key");
			
			if(userFromSession!=null) {
				out.print("User Exist "+userFromSession);
				out.print("<a href='Logoutservlet'>Logout</a>");
			}
			
		}
		else {
			out.print("Kindly Login First");
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	

}