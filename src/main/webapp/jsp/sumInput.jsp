<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}() %>/sumCalculation" method="post">
	<h3> 두 숫자 사이의 모든 숫자의 합</h3>
	
	첫번째 숫자입력 : <input name="start" ><br>
	두번째 숫자입력 : <input name="end" ><br>
	<input type="submit" value="전송"><br>
	</form>
</body>
</html>