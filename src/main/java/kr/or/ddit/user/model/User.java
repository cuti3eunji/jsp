package kr.or.ddit.user.model;

public class User {
	private String userId;		//사용자 아이디
	private String pass;		//사용자 비밀번호
	private String userNM;	//사용자이름

	
	public User() {
		
	}
	
	public User(String userNM) {
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
	
	public boolean checkLoginValidate(String userId, String pass) {
		
		if(userId.equals(this.userId) && pass.equals(this.pass)) 
			return true;
		
		return false;
	}
	
	
	
}
