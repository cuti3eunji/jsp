<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
 <form action="${cp}/jsp/mul.jsp" method="get">
	<h3> 두 개의 숫자 파라미터의 곱 구하기</h3>
	
	첫번째 숫자입력 : <input name="number" ><br>
	두번째 숫자입력 : <input name="number2" ><br>
	<input type="submit" value="전송"><br>
</form>
</body>
</html>