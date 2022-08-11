<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DISPLAY DETAILS IN JSP </title>
</head>
<body style="background-color:rgb(247,202,201);">   
    <center> <h1> ADD PRODUCT AND DISPLAY DETAILS IN JSP </h1> </center>   
    <form action = "productservlet" method = "post" style = "margin: auto; width: 220px;">  
        <div class="container">  
        	<label>PRODUCT ID : </label>   
            <input type="text" placeholder="Enter Product ID" name="pid" ><br></br> 
            <label>PRODUCT NAME : </label>   
            <input type="text" placeholder="Enter Product Name" name="pname" ><br></br>  
            <label>PRODUCT TYPE : </label>   
            <input type="text" placeholder="Enter Product Type" name="ptype" >  <br></br> 
            <label>PRODUCT PRICE : </label>   
            <input type="text" placeholder="Enter Product Price" name="price" required>  <br></br>  
            <button type="submit">Show Product Details</button>   
        </div> 
    </form>     
</body>     
</html>