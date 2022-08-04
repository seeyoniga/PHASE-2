package com.phase2.asst4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class interfacee implements Servlet {

	private ServletConfig  config=null;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		config=null;
		System.out.println("Destroy Called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return config.getServletName();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		System.out.println("Init Called");
		this.config=config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Interface class Service Called");
		PrintWriter  out= res.getWriter();
		out.println("This is The Interface Servlet page");
		
	}

	
	
	 
}
