<%@page import="com.demo.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Product Details</title>
  </head>
  <body style="background-color:rgb(247,202,201);">
  	
     <center><h1>Displaying Product Details</h1>
        <%ArrayList<Product> std = (ArrayList<Product>)request.getAttribute("data");
        for(Product s:std){%>
		<b>Product ID : </b><%=s.getPid()%><br></br>
		<b>Product Name : </b><%=s.getPname()%><br></br>
		<b>Product Type : </b><%=s.getPtype()%><br></br>
		<b>Product Price : </b><%=s.getPrice()%><br></br>
		 <%}%>		
		  <%%>	 
		</center> 
    </body>
</html>