<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD PRODUCT</title>
</head>
<body style="background-color:rgb(247,202,201);">    
    <center> <h1> ADD PRODUCT TO DATABASE </h1> </center>   
    <form action = "insert" method = "post" style = "margin: auto; width: 220px;">  
        <div class="container">   
            <label>PRODUCT NAME : </label>   
            <input type="text" placeholder="Enter Product Name" name="pname" ><br></br>  
            <label>PRODUCT TYPE : </label>   
            <input type="text" placeholder="Enter Product Type" name="ptype" >  <br></br> 
            <label>PRODUCT PRICE : </label>   
            <input type="text" placeholder="Enter Product Price" name="price" required>  <br></br>  
            <button type="submit">Add Product To Database</button>   
        </div>   
    </form>     
</body>     
</html>