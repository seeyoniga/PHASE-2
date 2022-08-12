package com.demo;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class deleteflightservlet extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  	
		response.setContentType("text/html"); 
		String fno= request.getParameter("fno");
		PrintWriter out = response.getWriter(); 
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
        	PreparedStatement ps=con.prepareStatement("delete from flightss where fno=?");   
        	ps.setString(1,fno);   
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