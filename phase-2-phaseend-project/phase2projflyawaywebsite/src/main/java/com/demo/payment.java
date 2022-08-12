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
import javax.servlet.http.HttpSession;

public class payment extends HttpServlet {  
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  	
		response.setContentType("text/html"); 
		String name= request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String adr = request.getParameter("adr");
		String email = request.getParameter("email");
		String mbl = request.getParameter("mbl");
		HttpSession session = request.getSession();
		String fno = (String)session.getAttribute("ffno");
		String aid =  (String)session.getAttribute("aaid");
		String source =  (String)session.getAttribute("scc");
		String dest = (String) session.getAttribute("dstt");
		int nop = (Integer)session.getAttribute("nnop");
		int tp = (Integer)session.getAttribute("tpp");
		int ttp =(Integer) session.getAttribute("ttp");
		int tid =260201;
		PrintWriter out = response.getWriter(); 
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
        	Statement stmt = con.createStatement();  
        	PreparedStatement ps=con.prepareStatement("insert into userr(tid,name,age,adr,email,mbl,fno,aid,source,dest,nop,tp,ttp) values (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        	ps.setInt(1,tid);
        	ps.setString(2,name);          	
        	ps.setInt(3,age); 
        	ps.setString(4,adr); 
        	ps.setString(5,email); 
        	ps.setString(6,mbl); 
        	ps.setString(7,fno);          	
        	ps.setString(8,aid); 
        	ps.setString(9,source); 
        	ps.setString(10,dest);  
        	ps.setInt(11,nop);
        	ps.setInt(12,tp); 
        	ps.setInt(13,ttp);
        	ps.executeUpdate();
        	session.setAttribute("tid", tid);
        	session.setAttribute("name",name);
            session.setAttribute("age",age);
            session.setAttribute("adr", adr);
            session.setAttribute("email", email);
            session.setAttribute("mbl", mbl);
        	session.setAttribute("ffno",fno);
    		session.setAttribute("aaid",aid);
    		session.setAttribute("scc",source);
    		session.setAttribute("dstt",dest);
    		session.setAttribute("nnop",nop);
    		session.setAttribute("tpp",tp);
    		session.setAttribute("ttp",ttp);  
        	request.getRequestDispatcher("paymentgateway.jsp").forward(request, response); 
        }
        catch (Exception e2) {
        	e2.printStackTrace();
        }  
        finally{
        	out.close();
        }  
  
	}
	}  