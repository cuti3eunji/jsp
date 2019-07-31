package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TimesTablesServlet extends HttpServlet {
	
//	private Logger logger = LoggerFactory.getLogger(TimesTablesServlet.class);	// 클래스정보를 넣어줌
	
	private static final Logger logger = LoggerFactory.getLogger(TimesTablesServlet.class);
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("TimesTablesServlet doGet()");
		
		String method = req.getMethod();
		
		
		logger.trace("trace TimesTablesServlet doGet()" + method);
		logger.debug("debug TimesTablesServlet doGet() {} {}", method, method +"test");		// sysout 보다 효율적~~!
		logger.info("info TimesTablesServlet doGet()");
		logger.warn("warn TimesTablesServlet doGet()");
		logger.error("error TimesTablesServlet doGet()");
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("	<head>"); 
		pw.println("		<title>구구단</title>"); 
		pw.println("	<style>"); 
		pw.println("		table{ text-align : center;}"); 
		pw.println("		td{ width : 100px; height : 50px; border : 1px solid black; }");
		pw.println("	</style>"); 
		pw.println("	</head>"); 
		pw.println("	<body>"); 
		pw.println("		<table>"); 
		for(int i=1; i<=9; i++) {
			pw.println("			<tr>");
			for(int j=2; j<=9; j++) {
				pw.println("				<td>" + j + " * " + i + " = " + i*j + "</td>");
			}
			pw.println("			</tr>");
		}
		pw.println("		</table>"); 
		pw.println("	</body>"); 
		pw.println("</html>");
	
	}
}
