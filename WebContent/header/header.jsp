<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="header/headerStyle.css">
</head>
<body>

	<div class="header">
    <h1>MERCURY MEDICAL</h1>
    	<div class="rightContainer">
    		<p>Welcome, FirstName LastName</p>
    		<div id="links">
	        	<a href='<%= response.encodeURL("admin/admin_main.jsp")%>'>Edit Profile</a><br>
	       		<a href='<%= response.encodeURL("admin/admin_main.jsp")%>'>Logout</a>
       		</div>
       	</div>
	</div>

</body>
</html>