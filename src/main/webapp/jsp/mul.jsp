<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
		request.setCharacterEncoding("utf-8");	


		int number1 = Integer.parseInt(request.getParameter("number"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		int result = number1 * number2;
		
%>
	<h3>두 수의 곱</h3>
	<%=number1%> * <%=number2 %>  =  <%=result %><br>	
</body>
</html>