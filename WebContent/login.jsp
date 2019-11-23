<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mercury Medical</title>
</head>
<body>
	<div id="adminLink" style="text-align:right">
      <a href='<%= response.encodeURL("admin/admin_main.jsp")%>'>
                Register New Patient </a>
    </div>
		
		<h1 style='text-align:center'>Welcome to Mercury Medical</h1>
        <form action='<%= response.encodeURL("GoToUserMain.do") %>' method="POST">
            <table style="margin-left:auto;margin-right:auto">
                <tr>
                    <td>Username:</td>
                    <td><input type="text" name="username" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="text" name="password" /></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align:center">
                        <input type="submit" value="Enter"/>
                    </td>
                </tr>
            </table>
        </form>

</body>
</html>

