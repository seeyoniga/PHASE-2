package com.demo;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class insertlocationservlet extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  	
		response.setContentType("text/html"); 
		String lid= request.getParameter("lid");
		String locations= request.getParameter("locations");
		PrintWriter out = response.getWriter(); 
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
        	PreparedStatement ps=con.prepareStatement("insert into location(lid,locations) values (?,?)");  
        	ps.setString(1,lid);  
        	ps.setString(2,locations);   
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