package kr.or.ddit.user.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
	private static final Logger logger = LoggerFactory.getLogger(User.class);
	
	private String userId;		//사용자 아이디
	private String pass;		//사용자 비밀번호
	private String userNM;	//사용자이름
	private String alias;	//별명
	private Date reg_dt;	//등록일
	private String addr1;
	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	private String addr2;
	private String zipcode;
	
	
	public User() {
		
	}
	
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getReg_dt() {
		return reg_dt;
	}
	
	//데이트타입 포맷 변경된버전~~
	public String getReg_dt_fmt() {
		logger.debug("getReg_dt_fmt method call");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(reg_dt);
	}

	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}


	
	public User(String userNM) {
		this.userNM = userNM;
	}
	
	public User(String userId, String userNm, String alias, Date reg_dt, String addr1, String addr2,
			String zipcode, String pass) {
		this.userId = userId;
		this.userNM = userNm;
		this.alias = alias;
		this.reg_dt = reg_dt;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.zipcode = zipcode;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", pass=" + pass + ", userNM=" + userNM + "]";
	}

	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getUserNM() {
		return userNM;
	}


	public void setUserNM(String userNM) {
		this.userNM = userNM;
	}
	
	public boolean checkLoginValidate(String userId, String pass) {
		
		if(userId.equals(this.userId) && pass.equals(this.pass)) 
			return true;
		
		return false;
	}
	
	
	
}
