package kr.or.ddit.user.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.user.model.User;

public class UserServiceTest {
	
	private IUserService userService;
	
	@Before
	public void setup() {
		userService = new UserService();
	}
	
	
	/**
	* Method : getUserListTest
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : getUserList 테스트
	*/
	@Test
	public void getUserListTest() {
		/***Given***/
		

		/***When***/
		List<User> userList = userService.getUserList();

		/***Then***/
		assertEquals(105, userList.size());
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

		/***When***/
		User user = userService.getUser(userId);

		/***Then***/
		assertEquals("브라운", user.getUserNM());
		assertEquals("brown1234", user.getPass());
		
	}
	
	
	/**
	* Method : getUserListOnlyHalfTest
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : getUserListOnlyHalfTest 테스트
	*/
	@Test
	public void getUserListOnlyHalfTest() {
		/***Given***/

		/***When***/
		List<User> halfUserList = userService.getUserListOnlyHalf();

		/***Then***/
		assertEquals(50, halfUserList.size());
	}
	
}
