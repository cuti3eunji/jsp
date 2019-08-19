<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
 <form action="${cp}/jsp/sum.jsp" method="get">
	<h3> 두 숫자 사이의 모든 숫자의 합</h3>
	<h4>* 첫번째 숫자보다 두번째숫자를 크게 입력하세요옹~</h4><br>
	
	첫번째 숫자입력 : <input name="number" ><br>
	두번째 숫자입력 : <input name="number2" ><br>
	<input type="submit" value="전송"><br>
</form>
</body>
</html>