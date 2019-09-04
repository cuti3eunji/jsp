<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="${cp }/js/jquery-3.4.1.min.js"></script>

<script>
$(function(){
	
	$('#locale').on('change', function(){
		$('#frm').submit();
	})
})

</script>

</head>
<body>

<form id="frm" action="${cp }/selectLocale" method="get">
	<select name="locale" id="locale">
	<c:choose>
		<c:when test="${locale == 'ko' }">
			<option value="ko" selected>한국어</option>
			<option value="en">English</option>
			<option value="zh">中国话</option>
		</c:when>
		
		<c:when test="${locale == 'en' }">
			<option value="ko">한국어</option>
			<option value="en" selected>English</option>
			<option value="zh">中国话</option>
		</c:when>
		
		<c:otherwise>
			<option value="ko">한국어</option>
			<option value="en">English</option>
			<option value="zh" selected>中国话</option>
		</c:otherwise>
	</c:choose>
	</select>
<!-- 	<input type="submit" value="전송"> -->
</form>

<fmt:setLocale value="${locale }"/>
<fmt:setBundle basename="kr.or.ddit.msg.message" var="msg"/>
<fmt:message key="GREETING" bundle="${msg }"/> <br>

</body>
</html>