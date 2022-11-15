package com.javassem.domain;

public class MemberVO {
	private String userId;			// ID
	private String userPass;		// 비밀번호
	private String userName;		// 이름
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName =userName;
	}
	
	
}
