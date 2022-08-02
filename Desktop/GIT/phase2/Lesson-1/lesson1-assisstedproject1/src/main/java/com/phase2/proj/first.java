package com.phase2.proj;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class first
 */
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public first() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   PrintWriter pw = null;
	       String name = null;
	       String contact = null;
	       response.setContentType("text/html");
	       pw = response.getWriter();
	       name = request.getParameter("name");
	       contact = request.getParameter("cont");
	       pw.println("<h1 style='text-align: center; color:blue'>"
	                 + "HELLO "+ name + "</h1>");
	       pw.println("<h2 style='text-align: center; color:red'>"
	                 + "YOUR CONTACT NUMBER IS : "+ contact + "</h2>");
	       pw.close();
	}

}
