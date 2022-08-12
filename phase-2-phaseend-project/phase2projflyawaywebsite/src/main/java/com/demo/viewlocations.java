package com.demo;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class viewlocations extends HttpServlet {  
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();   
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from location");  
            out.println("<table border=1 width=50%");  
            out.println("<tr><th>LOCATION ID</th><th>LOCATION</th><tr>");  
            while (rs.next()) 
            {  
                String lid = rs.getString("lid");  
                String locations = rs.getString("locations");  
 
                out.println("<tr><td>" + lid + "</td><td>" + locations + "</td></tr>");   
            }  
            out.println("</table>");  
            out.println("</html></body>");  
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