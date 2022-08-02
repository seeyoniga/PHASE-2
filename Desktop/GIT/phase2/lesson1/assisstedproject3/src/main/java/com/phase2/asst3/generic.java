package com.phase2.asst3;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class generic
 */
public class generic extends GenericServlet {
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public generic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("HI THIS IS THE GENERIC SERVLETS'S OUTPUT");
	}

}
