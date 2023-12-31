package com.ssafy.product.dto;

public class Member {
	String memberId;
	String password;
	String name;
	String registerDate;

	public Member() {
		super();
	}

	public Member(String memberId, String password, String name, String registerDate) {
		super();
		this.memberId = memberId;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
}
