package com.yedam.member;


import lombok.Data;

@Data
public class Member {
	
	
//	member_id VARCHAR2(20) PRIMARY KEY,
//	member_pw VARCHAR2(20) not null,
//	member_tel VARCHAR2(20),
//	member_inter VARCHAR2(20),
//	member_name VARCHAR2(20),
//	member_point NUMBER,
//	member_auth char
	
	private String memberId;
	private String memberPw;
	private String memberTel;
	private String memberInter;
	private String memberName;
	private int memberPoint;
	private String memberAuth;


	private String interName;
	private String interMessage;
	private String postId;
	
	private int postNo;
	private String postContent;
	private int postLike;
	private int postUnLike;
	private String postTitle;
	
}
