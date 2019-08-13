<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}() %>/redirectServlet" method="post">
	<input name="userName" value="brown"><br>
	<input type="submit" value="전송"><br>
</form>


</body>
</html>