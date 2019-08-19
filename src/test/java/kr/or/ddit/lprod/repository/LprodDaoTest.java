package kr.or.ddit.lprod.repository;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.lprod.model.LprodVO;

public class LprodDaoTest {
	
	/**
	* Method : getLprodListTest
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : getLprodList 테스트
	*/
	@Test
	public void getLprodListTest() {
		/***Given***/
		ILprodDao lprodDao = new LprodDaoImpl();

		/***When***/
		List<LprodVO> lprodList = lprodDao.getLprodList();

		/***Then***/
		assertEquals(9, lprodList.size());
	}
	
	@Test
	public void getProdListTest() {
		/***Given***/
		ILprodDao lprodDao = new LprodDaoImpl();

		/***When***/
		List<LprodVO> prodList = lprodDao.getProdList("P101");

		/***Then***/
		assertEquals(6, prodList.size());
	}
	
}
