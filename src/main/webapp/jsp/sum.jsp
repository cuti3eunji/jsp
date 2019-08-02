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


		int number = Integer.parseInt(request.getParameter("number"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		int result = 0;
		for(int i=number; i<=number2; i++){
			result += i;
		}
		
		
%>
	<h3>두 수 사이 모든 수의 합은 ????????!!!!!</h3>
	<%=number%> +  <%=number2 %>  =  <%=result %><br>
	
</body>
</html>