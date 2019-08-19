package kr.or.ddit.lprod.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.repository.ILprodDao;
import kr.or.ddit.lprod.repository.LprodDaoImpl;

/**
 * Servlet implementation class ProdListController
 */
@WebServlet("/prodList")
public class ProdListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger logger = LoggerFactory.getLogger(ProdListController.class);
	
	private ILprodDao lprodDao;
	
	@Override
	public void init() throws ServletException {
		lprodDao = new LprodDaoImpl();
	}
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String lprodGu = request.getParameter("lprodGu");
		
		logger.debug("lprodGu : {}", lprodGu);
		
		List<LprodVO> prodList = lprodDao.getProdList(lprodGu);
		
		request.setAttribute("prodList", prodList);
		
		request.getRequestDispatcher("/prod/prodList.jsp").forward(request, response);
		
	}


}
