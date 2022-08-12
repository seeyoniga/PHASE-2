<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Flight</title>
</head>
<body style="background-color:rgb(135, 206, 235);">
<center>
<h1>WELCOME TO FLYAWAY</h1></center>
<center>
<form action = "insertflightservlet" method = "post" style = "margin: auto; width: 220px;">  
        <div class="container"> 
        	<label>FLIGHT NO : </label>   
            <input type="text" placeholder="Enter Flight NO" name="fno" >  <br></br>    
            <label>AIRLINES ID : </label>   
            <input type="text" placeholder="Enter Flight NO" name="aid" >  <br></br>  
            <label>FLIGHT SOURCE : </label>   
            <input type="text" placeholder="Enter Source" name="source" >  <br></br>  
            <label>FLIGHT DESTINATION : </label>   
            <input type="text" placeholder="Enter Destination" name="dest" >  <br></br> 
            <label>FLIGHT DEPARTURE TIME : </label>   
            <input type="text" placeholder="Enter Departure Time" name="dtime" >  <br></br>  
            <label>FLIGHT ARRIVAL TIME : </label>   
            <input type="text" placeholder="Enter Arrival Time" name="atime" >  <br></br>   
            <label>FLIGHT CAPACITY: </label>   
            <input type="text" placeholder="Enter Capacity" name="seat" >  <br></br>  
            <label>TICKET PRICE: </label>   
            <input type="text" placeholder="Enter Per Ticket Price" name="tprice" >  <br></br> 
            <button type="submit">Add Flight</button>   
        </div>   
    </form>  
   </center>
   <br></br>
   <img src="pic1.jpg" style="width:1600px;height:600px;">
</body>
</html>