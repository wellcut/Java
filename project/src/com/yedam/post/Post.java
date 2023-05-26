package com.yedam.post;

import lombok.Data;

@Data
public class Post {
//	POST_NO      NOT NULL NUMBER         
//	POST_CONTENT          VARCHAR2(1000) 
//	POST_ID               VARCHAR2(20)   
//	POST_LIKE             NUMBER         
//	POST_UNLIKE           NUMBER  
	
	private int postNo;
	private String postContent;
	private String postId;
	private int postLike;
	private int postUnLike;
	private String postTitle;
	
	private String memberId;
	private int memberPoint;
	
}
