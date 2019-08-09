package kr.or.ddit.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CookieUtilTest {
	
	/**
	* Method : getCookieTest
	* 작성자 : PC-14
	* 변경이력 :
	* Method 설명 : 쿠키 가져오기 테스트
	*/
	@Test
	public void getCookieTest() {
		/***Given***/
		String cookieString = "userId=brown; rememberMe=Y; test=testValue";

		/***When***/
		String userIdCookieValue = CookieUtil.getCookie(cookieString, "userId");
		String rememCookieValue = CookieUtil.getCookie(cookieString, "rememberMe");
		String testCookieValue = CookieUtil.getCookie(cookieString, "test");
		String notExistsCookieValue = CookieUtil.getCookie(cookieString, "notExists");

		/***Then***/
		assertEquals("brown", userIdCookieValue);
		assertEquals("Y", rememCookieValue);
		assertEquals("testValue", testCookieValue);
//		assertNull(notExistsCookieValue);
	}
}
