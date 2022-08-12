<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOCATIONS</title>
</head>
<body style="background-color:rgb(135, 206, 235);">
<center>
<h1>WELCOME TO FLYAWAY</h1></center>
<center>
<form  action="viewlocations" method="get" style="margin: auto; width: 220px;">
      <input type="submit" value="VIEW ALL LOCATIONS"  style="height:1500px; width:200px" />
    </form> <br></br>
    <form  action="insertlocation.jsp" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="INSERT LOCATION"  style="height:1500px; width:200px" />
    </form> <br></br>  
    <form  action="deletelocation.jsp" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="DELETE LOCATION"  style="height:1500px; width:200px" />
     </form> <br></br>
      <form  action="adminhome.html" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="GO BACK"  style="height:1500px; width:200px" />
    </form>   <br></br>
   </center>
   <br></br>
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>