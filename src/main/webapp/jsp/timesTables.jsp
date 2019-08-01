<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	table{
		text-align : center;
	}
	td{
		width : 100px;
		height : 50px;
		border : 3px double black;
	}
</style>

</head>
<body>
	times tables.jsp
	<br><br>
	<table>
	<% for(int i=1; i<=9; i++){ %>
		<tr>
		<% for(int j=2; j<=9; j++){ %>
		<td> <%= j + " * " + i + " = " + i*j  %> </td>
		<%}%>
		</tr>
	<%}%>

		
	</table>
	
</body>
</html>