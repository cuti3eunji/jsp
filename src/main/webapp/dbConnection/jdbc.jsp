<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
		Connection conn = null; //java.sql
		Statement stmt = null; //java.sql
		ResultSet rs = null; //쿼리문이 select문일경우에만 필요*
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//start
		long start = System.currentTimeMillis();
		
		for(int i=0; i<20; i++){
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "PEJ", "java");
			String sql = "select * from lprod"; //실행할 SQL문장 -> 오라클에서 쓰는 쿼리문 그대로 문자열에 쓰면된다
			stmt = conn.createStatement(); //Statement객체 생성
			rs = stmt.executeQuery(sql);
		
			while (rs.next()) {
				out.println("lprod_id : " + rs.getInt("lprod_id") + "<br>");
				out.println("lprod_gu : " + rs.getString(2) + "<br>"); // 숫자는 컬럼번호를 의미한다.
				out.println("lprod_nm : " + rs.getString("lprod_nm") + "<br>");
				out.println("-----------------------------------------<br>");
			}
			
			rs.close();
			stmt.close();
			conn.close();
		}
		//end
		long end = System.currentTimeMillis();
		out.println("end - start : " + (end-start) + "ms <br>");
	%>

</body>
</html>