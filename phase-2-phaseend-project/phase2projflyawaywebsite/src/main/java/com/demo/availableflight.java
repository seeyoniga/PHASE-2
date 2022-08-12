package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class availableflight extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  	
		response.setContentType("text/html"); 
		String source = request.getParameter("source");
		String dest = request.getParameter("dest");
		int nop = Integer.parseInt(request.getParameter("nop"));
		java.util.Date date;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dot"));
		   	java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		PrintWriter out = response.getWriter(); 
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();   
         	PreparedStatement ps=con.prepareStatement("SELECT * FROM flightss WHERE source=? AND dest=?;");  
        	ps.setString(1,source);
        	ps.setString(2,dest);
        	ResultSet rs = ps.executeQuery();
            HttpSession session = request.getSession();
        	out.println("<table border=1 width=50%");  
        	out.println("<tr><th>FLIGHT NO</th><th>AIRLINES ID</th><th>SOURCE</th><th>DESTINATION</th><th>DEPARTURE TIME</th><th>ARRIVAL TIME</th><th>NO OF SEATS</th><th>TICKET PRICE</th><tr>");  
             while (rs.next()) 
             {  
             	 String fno = rs.getString("fno");
                 String aid = rs.getString("aid");  
                 String sourcee = rs.getString("source"); 
                 String destt = rs.getString("dest"); 
                 String dtime = rs.getString("dtime"); 
                 String atime = rs.getString("atime"); 
                 int seat = rs.getInt("seat");
                 int tprice = rs.getInt("tprice");
                 if(source.equalsIgnoreCase(sourcee)&& dest.equalsIgnoreCase(destt)) {
                	 
                 if(nop<=seat) {
  
                 out.println("<tr><td>" + fno + "</td><td>" + aid + "</td><td>" + sourcee + "</td><td>" + destt + "</td><td>" + dtime + "</td><td>" + atime + "</td><td>" + seat + "</td><td>" + tprice + "</td></tr>");   
                 out.println("</table>");  
                 out.println("</html></body>");  
                 session.setAttribute("fno", fno);
                 session.setAttribute("aid", aid);
                 session.setAttribute("sc", sourcee);
                 session.setAttribute("dst", destt);
                 session.setAttribute("dt", dtime);
                 session.setAttribute("at", atime);
                 session.setAttribute("nop", nop);
                 session.setAttribute("tprice", tprice);
                 session.setAttribute("tdate", sqlDate);
             	request.getRequestDispatcher("bookdesign.jsp").forward(request, response); 
                 }
                 else{
                	 out.println("Flight Fully Booked");
                  	 request.getRequestDispatcher("userdesign.jsp").include(request, response); 
                 }
                 } 
             else {
            	 out.println("No Flights Available");
             	request.getRequestDispatcher("userdesign.jsp").include(request, response); 
             }  
          }
        }
        catch (Exception e2) {
        	e2.printStackTrace();
        }  
        finally{
        	out.close();
        }  
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  