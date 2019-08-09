package kr.or.ddit.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookieUtil {

	/**
	* Method : getCookie
	* 작성자 : PC-14
	* 변경이력 :
	* @param cookieString
	* @param string
	* @return
	* Method 설명 : 쿠키 문자열로부터 특정 쿠키의 값을 반환한다
	*/
	private static final Logger logger = LoggerFactory.getLogger(CookieUtil.class);
	
	public static String getCookie(String cookieString, String cookieId) {
		
		String[] cookies = cookieString.split("; ");
		String cookieValue = "";
		String cooId = "";
		
		for(String coo : cookies) {
			cooId = coo.substring(0, coo.indexOf("="));
			
			if(cooId.equals(cookieId)) {
				cookieValue = coo.substring(coo.indexOf("=")+1);
			}
		}
		
		return cookieValue;
	}
	
	public static String getCookieSEM(String cookieString, String cookieId) {
		
		String[] cookies = cookieString.split("; ");
		String cookieValue = "";
		for(String cookie : cookies) {
			String[] cookieNmVal = cookie.split("=");
			
			if(cookieId.equals(cookieNmVal[0])) {
				cookieValue = cookieNmVal[1];
			}
		}
		return cookieValue;
	}

}
