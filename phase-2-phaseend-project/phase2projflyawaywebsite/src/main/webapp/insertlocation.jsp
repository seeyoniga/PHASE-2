<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Location</title>
</head>
<body style="background-color:rgb(135, 206, 235);">
<center>
<h1>WELCOME TO FLYAWAY</h1></center>
<center>
<form action = "insertlocationservlet" method = "post" style = "margin: auto; width: 220px;">  
        <div class="container"> 
        	<label>LOCATION ID : </label>   
            <input type="text" placeholder="Enter Location ID" name="lid" >  <br></br>    
            <label>LOCATION NAME : </label>   
            <input type="text" placeholder="Enter Location Name" name="locations" >  <br></br>  
            <button type="submit">Add LOCATION</button>   
        </div>   
    </form>  
   </center>
   <br></br>
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>