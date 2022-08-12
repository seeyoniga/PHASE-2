package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class insertairlineservlet extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  	
		response.setContentType("text/html"); 
		String aid= request.getParameter("aid");
		String airlines= request.getParameter("airlines");
		PrintWriter out = response.getWriter(); 
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
        	PreparedStatement ps=con.prepareStatement("insert into airline(aid,airlines) values (?,?)");
        	ps.setString(1,aid);          	
        	ps.setString(2,airlines);   
        	ps.executeUpdate();  
            con.close();   
        	request.getRequestDispatcher("admindesign.jsp").include(request, response); 
        }
        catch (Exception e2) {
        	e2.printStackTrace();
        }  
        finally{
        	out.close();
        }  
  
	}
	}  