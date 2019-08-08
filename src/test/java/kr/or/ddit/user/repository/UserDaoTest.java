package kr.or.ddit.user.repository;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import kr.or.ddit.user.model.User;

public class UserDaoTest {
	
	/**
	* Method : getUserListTest
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : getUserList 테스트
	*/
	@Test
	public void getUserListTest() {
		/***Given***/
		IUserDao userDao = new UserDao();

		/***When***/
		List<User> userList = userDao.getUserList();

		/***Then***/
		assertEquals(5, userList.size());
	}
	
	/**
	* Method : getUsetTest
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : 사용자 정보 조회 테스트
	*/
	@Test
	public void getUsetTest() {
		/***Given***/
		String userId = "brown";
		IUserDao userDao = new UserDao();

		/***When***/
		User user = userDao.getUser(userId);

		/***Then***/
		assertEquals("브라운", user.getUserNM());
		assertEquals("brown1234", user.getPass());
		
	}
}
