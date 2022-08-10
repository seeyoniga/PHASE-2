package com.demo;

import java.io.*;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
  
public class productservlet extends HttpServlet {
  
  protected void processRequest(HttpServletRequest request,
                                HttpServletResponse response)
    throws ServletException, IOException
    {
	  int pid = Integer.parseInt(request.getParameter("pid"));
	  String pname = request.getParameter("pname");
	  String ptype = request.getParameter("ptype");
	  int price = Integer.parseInt(request.getParameter("price"));
     response.setContentType("text/html;charset=UTF-8");
     try (PrintWriter out = response.getWriter()) {
       out.println("<!DOCTYPE html>");
       out.println("<html>");
       out.println("<head>");
       out.println("<title>Servlet ProductServlet</title>");
       out.println("</head>");
       out.println("<body>");
       ArrayList<Product> std = new ArrayList<Product>();
       std.add(new Product(pid,pname,ptype,price));
       request.setAttribute("data", std);
       RequestDispatcher rd = request.getRequestDispatcher("showdetails.jsp");
          rd.forward(request, response);
            out.println("</body>");
            out.println("</html>");
        }
    }
    protected void doGet(HttpServletRequest request,
                        HttpServletResponse response)
        throws ServletException, IOException
    {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request,
                        HttpServletResponse response)
        throws ServletException, IOException
    {
        processRequest(request, response);
    }
    public String getServletInfo()
    {
        return "Short description";
    }
}