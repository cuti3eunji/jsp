package kr.or.ddit.lprod.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoTest {
	private ILprodDao lprodDao;
	private SqlSession sqlSession;

	@Before
	public void setup() {
		logger.debug("before");
		lprodDao = new LprodDao();
		sqlSession = MybatisUtil.getSession();
	}
	//test에 공통적으로 사용한 자원을 해제 
	@After
	public void tearDown() {
		logger.debug("after");
		sqlSession.close();
	}

	private static final Logger logger = LoggerFactory.getLogger(LprodDaoTest.class);
	
	/**
	* Method : getLprodListTest
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : getLprodList 테스트
	*/
	@Test
	public void getLprodListTest() {
		/***Given***/
		ILprodDao lprodDao = new LprodDao();

		/***When***/
		List<LprodVO> lprodList = lprodDao.getLprodList(sqlSession);

		/***Then***/
		assertEquals(9, lprodList.size());
	}
	
	@Test
	public void getProdListTest() {
		/***Given***/
		IProdDao prodDao = new ProdDao();

		/***When***/
		List<ProdVO> prodList = prodDao.getProdList("P101");

		/***Then***/
		assertEquals(6, prodList.size());
	}
	
}
