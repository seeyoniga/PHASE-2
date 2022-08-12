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
   <% 
		String fno = (String)session.getAttribute("fno");
		String aid = (String)session.getAttribute("aid");
		String source = (String)session.getAttribute("sc");
		String dest = (String)session.getAttribute("dst");
		int nop = (Integer)session.getAttribute("nop");
		int tp = (Integer)session.getAttribute("tprice");
		int ttp = nop*tp;
		session.setAttribute("ffno",fno);
		session.setAttribute("aaid",aid);
		session.setAttribute("scc",source);
		session.setAttribute("dstt",dest);
		session.setAttribute("nnop",nop);
		session.setAttribute("tpp",tp);
		session.setAttribute("ttp",ttp);
		%>	
    <center><h1> Passenger Details</h1>
    <form action ="payment" method = post>
    		 NAME: <input type="text" name="name" /><br/>
    		 AGE: <input type="text" name="age" /><br/>
    		 ADDRESS: <input type="text" name="adr" /><br/>
    		 EMAIL : <input type="text" name="email" /><br/>
    		 MOBILE NO : <input type="text" name="mbl" /><br/>
    		 <%		
    			out.println("TOTAL TICKET PRICE :");
    			out.println(ttp); %>
    		 <input type="submit" value="PAY" style="width:200px;height:200px;"/>
		</center> 
		</form>
		
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>
		 