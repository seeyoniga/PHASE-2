<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Action Tags</title>
</head>
<body>
Usage of useBean tag<br>
<jsp:useBean id="productBean" class="com.demo.productbean" scope="session"></jsp:useBean>
        <jsp:setProperty property="productId" name="productBean" value="7"/>
        <jsp:setProperty property="productName" name="productBean" value="Keyboard"/>
        <jsp:setProperty property="productType" name="productBean" value="Electronic Appliances"/>
        <jsp:setProperty property="price" name="productBean" value="600"/>

<a href="showbean.jsp">Access bean properties from another page</a><br>
<a href="forward.jsp">Use Forward action to go to Google</a><br>

<hr>

<jsp:text>
        <![CDATA[Hi,This is my content.<br/>This will show within a text action tag exactly as it has been entered]]>
</jsp:text>

</body>
</html>
    