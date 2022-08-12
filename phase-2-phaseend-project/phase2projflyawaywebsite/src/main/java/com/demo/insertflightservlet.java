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

public class insertflightservlet extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  	
		response.setContentType("text/html"); 
		String fno = request.getParameter("fno");
		String aid = request.getParameter("aid");
		String source = request.getParameter("source");
		String dest = request.getParameter("dest");
		String dtime = request.getParameter("dtime");
		String atime = request.getParameter("atime");
		int seat = Integer.parseInt(request.getParameter("seat"));
		int tprice = Integer.parseInt(request.getParameter("tprice"));
		PrintWriter out = response.getWriter(); 
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
        	PreparedStatement ps=con.prepareStatement("insert into flightss(fno,aid,source,dest,dtime,atime,seat,tprice) values (?,?,?,?,?,?,?,?)");  
        	ps.setString(1,fno);  
        	ps.setString(2,aid);
        	ps.setString(3,source);  
        	ps.setString(4,dtime); 
        	ps.setString(5,atime);  
        	ps.setString(6,dest); 
        	ps.setInt(7,seat);  
        	ps.setInt(8,tprice); 
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