package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/sumCalculation")
public class sumCalculation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(sumCalculation.class);
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/sumInput.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sessionStart= request.getParameter("start");
		String sessionEnd = request.getParameter("end");
		
		
		int start = Integer.parseInt(sessionStart);
		int end = Integer.parseInt(sessionEnd);
		
		int sumResult = 0;
		String btwNum = "";
		for(int i=start; i<=end; i++){
			sumResult += i;
			btwNum += i + " ";
		}
		
		logger.debug("start 값 : {}", sessionStart);
		logger.debug("end 값 : {}", sessionEnd);
		logger.debug("{} 부터 {}사이의 값 => {}", sessionStart, sessionEnd, btwNum);
		logger.debug("더한 값 ====> {}", sumResult);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("sumResult", sumResult);
		
		request.getRequestDispatcher("/jsp/sumResult.jsp").forward(request, response);
		
	}

}
