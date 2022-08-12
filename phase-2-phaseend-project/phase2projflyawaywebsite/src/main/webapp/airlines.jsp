<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AIRLINES</title>
</head>
<body style="background-color:rgb(135, 206, 235);">
<center>
<h1>WELCOME TO FLYAWAY</h1></center>
<center>
<form  action="viewairlines" method="get" style="margin: auto; width: 220px;">
      <input type="submit" value="VIEW ALL AIRLINES"  style="height:1500px; width:200px" />
    </form> <br></br>
    <form  action="insertairlines.jsp" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="INSERT AIRLINES"  style="height:1500px; width:200px" />
    </form> <br></br>  
    <form  action="deleteairlines.jsp" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="DELETE AIRLINES"  style="height:1500px; width:200px" />
     </form> <br></br>
      <form  action="adminhome.html" method="post" style="margin: auto; width: 220px;">
      <input type="submit" value="GO BACK"  style="height:1500px; width:200px" />
    </form>   <br></br>
   </center>
   <br></br>
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>