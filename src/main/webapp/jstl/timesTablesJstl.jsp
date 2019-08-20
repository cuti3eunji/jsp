<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		border : 1px solid black;
	}
</style>

</head>
<body>
	times tablesJstl.jsp
	<br><br>
	<table>
		<c:forEach begin="1" end="9" var="i" varStatus="loop">
			<tr>
				<c:forEach begin="2" end="9" var="j">
					<td> ${j } * ${i } = ${j*i } </td>		
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>