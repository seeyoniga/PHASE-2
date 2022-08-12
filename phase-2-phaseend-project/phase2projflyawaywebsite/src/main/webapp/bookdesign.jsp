<%@page import="com.demo.availableflight"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Flight Details</title>
  </head>
<body style="background-color:rgb(135, 206, 235);">
   <br></br>
   <h1></h1>
    <center><h1> Flight Details</h1>
    <form action ="register.jsp" method = post>
    	<b>FLIGHT ID : </b><%=session.getAttribute("fno")%><br></br>
    	<b>AIRLINES ID : </b><%=session.getAttribute("aid")%><br></br>	
		<b>SOURCE : </b><%=session.getAttribute("sc")%><br></br>
		<b>DESTINATION : </b><%=session.getAttribute("dst")%><br></br>
		<b>TRAVEL DATE : </b><%=session.getAttribute("tdate")%><br></br>
		<b>DEPARTURE TIME : </b><%=session.getAttribute("dt")%><br></br>
		<b>ARRIVAL TIME : </b><%=session.getAttribute("at")%><br></br>
		<b>TOTAL NO OF PASSENGERS : </b><%=session.getAttribute("nop")%><br></br>
		<b>TICKET PRICE : </b><%=session.getAttribute("tprice")%><br></br>
		<% int nop = (Integer)session.getAttribute("nop");
		int tp = (Integer)session.getAttribute("tprice");
		int ttp = nop*tp;
		out.println("TOTAL TICKET PRICE :");
		out.println(ttp);
		%>
		  <%%>	 
		 <input type="submit" value="BOOK TICKET" style="width:200px;height:200px;"/>
		</form>
		</center> 
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>