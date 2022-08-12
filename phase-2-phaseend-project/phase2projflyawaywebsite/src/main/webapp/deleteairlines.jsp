<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Airlines</title>
</head>
<body style="background-color:rgb(135, 206, 235);">
<center>
<h1>WELCOME TO FLYAWAY</h1></center>
<center>
<form action = "deleteairlineservlet" method = "post" style = "margin: auto; width: 220px;">  
        <div class="container">    
            <label>AIRLINES NAME : </label>   
            <input type="text" placeholder="Enter Airlines Name" name="airlines" >  <br></br>  
            <button type="submit">DELETE AIRLINES</button>   
        </div>   
    </form>  
   </center>
   <br></br>
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>