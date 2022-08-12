package com.demo;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class viewairlines extends HttpServlet {  
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();   
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from airline");  
            out.println("<table border=1 width=50%");  
            out.println("<tr><th>AIRLINES ID</th><th>AIRLINES NAME</th><tr>");  
            while (rs.next()) 
            {  
                String aid = rs.getString("aid");  
                String airlines = rs.getString("airlines");  
 
                out.println("<tr><td>" + aid + "</td><td>" + airlines + "</td></tr>");   
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