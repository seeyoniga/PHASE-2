<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FLIGHTS</title>
</head>
<body style="background-color:rgb(135, 206, 235);">
<center>
<h1>WELCOME TO FLYAWAY</h1></center>
<center>
<form  action="viewflightservlet" method="get" style="margin: auto; width: 220px;">
      <input type="submit" value="VIEW ALL FLIGHTS"  style="height:1500px; width:200px" />
    </form> <br></br>
    <form  action="insertflight.jsp" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="INSERT FLIGHT"  style="height:1500px; width:200px" />
    </form> <br></br>  
    <form  action="deleteflight.jsp" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="DELETE FLIGHT"  style="height:1500px; width:200px" />
     </form> <br></br>
      <form  action="adminhome.html" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="GO BACK"  style="height:1500px; width:200px" />
    </form>   <br></br>
   </center>
   <br></br>
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>