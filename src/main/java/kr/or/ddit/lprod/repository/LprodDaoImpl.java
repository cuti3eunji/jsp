package kr.or.ddit.lprod.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.util.MybatisUtil;

public class LprodDaoImpl implements ILprodDao {

	/**
	* Method : getLprodList
	* 작성자 : PC-14
	* 변경이력 :
	* @return
	* Method 설명 : 
	*/
	@Override
	public List<LprodVO> getLprodList() {
		
		SqlSession sqlSession = MybatisUtil.getSession();
		List<LprodVO> lprodList = sqlSession.selectList("lprod.getLprodList");
		sqlSession.close();
		
		return lprodList;
	}

}
