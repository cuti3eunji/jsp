package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.model.ProdVO;
import kr.or.ddit.util.MybatisUtil;

public class ProdDao implements IProdDao {
	
	/**
	* Method : getProdList
	* 작성자 : SEM-PC
	* 변경이력 :
	* @param lprod_gu
	* @return
	* Method 설명 :제품 리스트 조회
	*/
	@Override
	public List<ProdVO> getProdList(String lprod_gu) {
		SqlSession sqlSession = MybatisUtil.getSession();
		
		List<ProdVO> prodList = sqlSession.selectList("getProdList", lprod_gu);
		sqlSession.close();
		
		return prodList;
	}

}
