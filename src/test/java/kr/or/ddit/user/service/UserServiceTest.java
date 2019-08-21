package kr.or.ddit.user.service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import kr.or.ddit.common.model.Page;
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
	/**
	* Method : getUserPagingListText
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : 사용자 페이징 리스트 조회 테스트
	*/
	
	@Test
	public void getUserPagingListText() {
		/***Given***/
		Page page = new Page();
		page.setPage(3);
		page.setPageSize(10);
		
		/***When***/
		 Map<String, Object> resultMap = userService.getUserPagingList(page);
		 List<User> userList = (List<User>) resultMap.get("userList");
		 int paginationSize = (Integer)resultMap.get("paginationSize");

		/***Then***/
		assertEquals(10, userList.size());
		assertEquals("xuserid22", userList.get(0).getUserId());
		assertEquals(11, paginationSize);
	}
	
	
	
	
	@Test
	public void ceilingTest() {
		/***Given***/
		int totalCnt = 1;
		int pagesize = 10;

		/***When***/
		double paginationSize = Math.ceil((double)totalCnt / pagesize);

		/***Then***/
		assertEquals(1, (int)paginationSize);
	}

}
