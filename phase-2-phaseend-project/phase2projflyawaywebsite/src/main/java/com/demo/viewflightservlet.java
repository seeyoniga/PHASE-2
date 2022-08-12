package com.demo;

import java.io.*;  
import java.sql.*;  
import javax.servlet.ServletException;  
import javax.servlet.http.*;  
  
public class viewflightservlet extends HttpServlet {  
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();   
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from flightss");  
            out.println("<table border=1 width=50%");  
            out.println("<tr><th>FLIGHT NO</th><th>AIRLINES ID</th><th>SOURCE</th><th>DESTINATION</th><th>DEPARTURE TIME</th><th>ARRIVAL TIME</th><th>NO OF SEATS</th><th>TICKET PRICE</th><tr>");  
            while (rs.next()) 
            {  
            	String fno = rs.getString("fno");
                String aid = rs.getString("aid");  
                String source = rs.getString("source"); 
                String dest = rs.getString("dest"); 
                String dtime = rs.getString("dtime"); 
                String atime = rs.getString("atime"); 
                int seat = rs.getInt("seat");
                int tprice = rs.getInt("tprice");
 
                out.println("<tr><td>" + fno + "</td><td>" + aid + "</td><td>" + source + "</td><td>" + dest + "</td><td>" + dtime + "</td><td>" + atime + "</td><td>" + seat + "</td><td>" + tprice + "</td></tr>");   
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
        }  
  
}  
}  