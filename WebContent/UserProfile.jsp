<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile Page</title>

<style>
table {
  border: 1px solid black;
}
</style>
</head>
<body>

<h3>User Profile</h3>
<table>
  <tr>
    <td>First Name: Bob</td>
    <td>Middle Initial: B</td> 
    <td>Last Name: Bobby</td>
  </tr>
  <tr>
    <td>Date of Birth: YYYY/MM/DD</td>
    <td>Gender: XX/XY</td>
  </tr>
  <tr>
    <td>OHIP Number: 1234567890</td>
    <td>OHIP version code: 0000</td>
  </tr>
  <tr>
    <td>Username: BobbyB</td>
    <td>Password: ******</td>
  <tr>
  <tr>
  	<td></td>
  	<td></td>
  	<td>
    	<form action="/action_page.php">
     	<input type="button" value="Edit Details">
     	</form>
     </td>
    </tr>
</table>

<h4>Past Appointments</h4>
<table>
  <tr>
    <th>Date: YYYY/MM/DD</th>
    <th>Time: HH:MM</th>
    <th>Physician: DR. XYZ</th>
  </tr>
  </tr>
  	<td>Reason for Visit: 123</td>
  <tr>
</table>

</body>
</html>