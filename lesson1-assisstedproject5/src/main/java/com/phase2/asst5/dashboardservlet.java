package com.phase2.asst5;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

public class dashboardservlet extends  HttpServlet {

	@Override
	protected void doGet(HttpServletRequest requst, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.print("Welcome to the Dashboard page");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request, response);
	}
	
	

}