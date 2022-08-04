package com.sql.demo;

import java.io.*;  
import java.sql.*;  
import jakarta.servlet.ServletException;  
import jakarta.servlet.http.*;  
  
public class student extends HttpServlet {  
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
        int pid=Integer.parseInt(request.getParameter("pid"));   
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");              
        	PreparedStatement ps=con.prepareStatement("select * from product where pid=?");  
        	ps.setInt(1,pid);               
        	out.print("<table width=50% border=1>");  
        	out.print("<caption>PRODUCT DETAILS:</caption>");    
        	ResultSet rs=ps.executeQuery();  
        	ResultSetMetaData rsmd=rs.getMetaData();  
        	int total=rsmd.getColumnCount();  
        	out.print("<tr>");  
        	for(int i=1;i<=total;i++)  
        	{  
        		out.print("<th>"+rsmd.getColumnName(i)+"</th>");  
        	}    
        	out.print("</tr>");
        	if(rs.next()) {
        		out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getInt(4)+"</td></tr>");
        		out.print("</table>");
        	}
        	else {
        		out.println("<font color=red>There was no element with product ID:</font> " + pid + "<font color=red> found in the table, please try again </font>");
        	}
        }
        catch (Exception e2) {
        	e2.printStackTrace();
        }  
        finally{
        	out.close();
        }  
  
}  
}  