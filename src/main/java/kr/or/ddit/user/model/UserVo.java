package kr.or.ddit.user.model;

public class UserVo {
	private String userId;		//사용자 아이디
	private String pass;		//사용자 비밀번호
	private String userNM;	//사용자이름

	
	public UserVo() {
		
	}
	
	public UserVo(String userNM) {
		this.userNM = userNM;
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
}
