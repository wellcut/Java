package com.yedam.member;

public class Member {
//	member_id VARCHAR2(20) primary key,
//	memeber_pw VARCHAR2(20),
//	memeber_phone VARCHAR2(13),
//	member_addr VARCHAR2(20),
//	member_grade char
	private String memberId;
	private String memberPw;
	private String memberPhone;
	private String memberAddr;
	private String memberGrade;
	
	
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public String getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}
	
	
	
	
}
