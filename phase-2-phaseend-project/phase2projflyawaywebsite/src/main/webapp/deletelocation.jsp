<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Location</title>
</head>
<body style="background-color:rgb(135, 206, 235);">
<center>
<h1>WELCOME TO FLYAWAY</h1></center>
<center>
<form action = "deletelocationservlet" method = "post" style = "margin: auto; width: 220px;">  
        <div class="container"> 
        <label>LOCATION NAME : </label>   
            <input type="text" placeholder="Enter Location Name" name="locations" >  <br></br>    
            <button type="submit">DELETE LOCATION</button>   
        </div>   
    </form>  
   </center>
   <br></br>
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>