<%@page import="kr.or.ddit.user.model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp</title>

<%@include file="/commonJsp/basicLib.jsp"%>

<script>
//문서 로딩이 완료되고 나서
$(document).ready(function(){
	
	//사용자 정보 클릭시 이벤트 핸들러
	$(".prodTr").on("click", function(){
		
		console.log("prodTr click");
		
		//클릭된 tr 태그의 자식태그(td)중 두번째 문자열
		console.log($(this).children().eq(1).text());
		
		var dataValue = $(this).data("lprodgu");
		
		//input 태그에 값 설정
		$("#lprodGu").val(dataValue);

		//form 태그이용 전송
// 		console.log("serialize : " + $("#frm").serialize());
		
		$("#frm").submit();
	});
	
})

</script>

<style>
	.prodTr:hover {
		background : #E4F7BA;
		cursor : pointer;
	}
	
	.prodTr:nth-child(even){
		background : #F6F6F6;
	}
	
</style>

</head>

<body>
<form id="frm" action="${cp }/prodList" method="get">
	<input type="hidden" id="lprodGu" name="lprodGu"/>	
</form>

	<!-- Header -->
	<%@include file="/commonJsp/header.jsp"%>


	<div class="container-fluid">
		<div class="row">

			<div class="col-sm-3 col-md-2 sidebar">

				<!-- left -->
				<%@ include file="/commonJsp/left.jsp"%>
				
			</div>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<div class="row">
					<div class="col-sm-8 blog-main">
						<h2 class="sub-header">제품 그룹</h2>
						<div class="table-responsive">
							<table class="table">
								<tr>
									<th>Lprod_ID</th>
									<th>Lprod_GU</th>
									<th>Lprod_NM</th>
								</tr>

								<c:forEach items="${lprodList}" var="lprod">
									<tr class="prodTr" data-lprodgu="${lprod.lprod_gu }">
										<td>${lprod.lprod_id}</td>
										<td>${lprod.lprod_gu}</td>
										<td>${lprod.lprod_nm}</td>
									</tr>
								</c:forEach>
							</table>
						</div>

<!-- 						<a class="btn btn-default pull-right">사용자 등록</a> -->

						<div class="text-center">
							<ul class="pagination">
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
