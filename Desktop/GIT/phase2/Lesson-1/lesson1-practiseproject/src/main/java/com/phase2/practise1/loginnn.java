package com.phase2.practise1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class loginnn
 */
public class loginnn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginnn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String username = request.getParameter("email");
        String password = request.getParameter("pass");
        RequestDispatcher rs = null;
        HttpSession session = request.getSession();
        if(username.equalsIgnoreCase("seeyo2602@gmail.com") && password.equals("seeyo8888"))
        {
        	session.setAttribute("user", username);
            rs = request.getRequestDispatcher("successservlet");
            rs.forward(request, response);
        }
        else
        {
           rs = request.getRequestDispatcher("login.html");
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
