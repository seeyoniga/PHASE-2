package com.demo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * Servlet implementation class loginnn
 */
public class loginn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginn() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**	
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String username = request.getParameter("email");
        String password = request.getParameter("pass");
        String u = "admin";
        String p = "admin";
        RequestDispatcher rs = null;
        HttpSession session = request.getSession();
        if(username.equalsIgnoreCase(u) && password.equals(p))
        {
        	session.setAttribute("user", username);
            rs = request.getRequestDispatcher("successservlet");
            rs.forward(request, response);
        }
        else
        {
           rs = request.getRequestDispatcher("invalid.jsp");
           PrintWriter out = response.getWriter();
           rs.include(request, response);
           out.println("<center> <font color=red>INVALID CREDENTIALS !!! </font></center>");
        }
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}