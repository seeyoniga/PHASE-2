package com.pp3.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

@WebServlet("/insert")
public class insertservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out= resp.getWriter();
		
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session= factory.openSession();		
		Transaction tx= session.beginTransaction();
		String sname = req.getParameter("pname");
		String stype = req.getParameter("ptype");
		int sprice = Integer.parseInt(req.getParameter("price"));
		Product s1=new Product(sname,stype,sprice);
		session.save(s1);
		tx.commit();
		session.close();
		out.println("<html><body bgcolor = 'pink',text='green'><h1><i>Product Inserted To Database</i></h1></body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}