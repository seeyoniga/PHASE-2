package com.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.DBConnection;

/**
* Servlet implementation class changepassword
*/
public class changepassword extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public changepassword(){
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                try {
                    	String password = request.getParameter("pass");
                    	String cpassword = request.getParameter("pass1");
                    	RequestDispatcher rs = null;
                    	if(password.equals(cpassword)) {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");                       
                        InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
                        Properties props = new Properties();
                        props.load(in);
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/flyaway", "root", "");              
                    	Statement stmt = con.createStatement();  
                    	PreparedStatement ps=con.prepareStatement( "UPDATE  admin set pass = ? where auname ='admin'");   
                    	ps.setString(1,password);   
                        ps.executeUpdate();
                        ps.close();
                        con.close();
                        out.println("</body></html>");
                        con.close();
                        rs = request.getRequestDispatcher("adminhome.html");
                        rs.forward(request, response);
                    	}
                    	else {
                    		rs = request.getRequestDispatcher("changepassword.jsp");
                            PrintWriter out = response.getWriter();
                            rs.include(request, response);
                            out.println("<center> <font color=red>passwords dont match !!! </font></center>");
                    	}
                } catch (SQLException e) {
                        e.printStackTrace();
                } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        }

        /**
         * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                doGet(request, response);
        }

}
