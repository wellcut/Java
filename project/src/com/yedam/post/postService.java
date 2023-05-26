package com.yedam.post;

import java.util.List;
import java.util.Scanner;

import com.yedam.exe.MemberApp;
import com.yedam.member.Member;
import com.yedam.member.MemberService;

public class postService {
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	public static  Post postInfo = null;
	
	//게시물 작성
	public void insertPost() {
		Post post = new Post();
		System.out.println("제목>");
		post.setPostTitle(sc.nextLine());
		
		System.out.println("내용>");
		post.setPostContent(sc.nextLine());
		
		post.setPostId(MemberService.memberInfo.getMemberId());
		
		int result = PostDAO.getInstance().insertPost(post);
		if(result >0) {
			System.out.println("등록 성공");
			postInfo = post;
			getPoint();
		}else {
			System.out.println("등록 실패");
		}
		
	}
	
	//게시물 리스트보기
	public void shareListPost() {
		List<Post> list = PostDAO.getInstance().listPost();
		System.out.println("=========게시물 리스트===========");
		for(Post post : list ) {
			System.out.println("============");
			System.out.println("번호 : " + post.getPostNo());
			System.out.println("제목 : " + post.getPostTitle());
			System.out.println("============");
		}
	}
	
	public void listPost() {
			shareListPost();
			shareGetPostDetail();
	}
	//게시물 조회
	public void shareGetPostDetail() {
		
		System.out.println("조회할 게시물 번호 입력>");
		int postNo = Integer.parseInt(sc.nextLine());
		Post post = PostDAO.getInstance().getPostDetail(postNo);
		
		if(post ==null) {
			System.out.println("없는 번호 입니다");
			new MemberApp();
		}else if(post !=  null){
					
			if(MemberService.memberInfo.getMemberId().equals(post.getPostId())||MemberService.memberInfo.getMemberAuth().equals("A")) {
				System.out.println("===========================");
				System.out.println("번호 : " + post.getPostNo());
				System.out.println("작성자 : " + post.getPostId());
				System.out.println("제목 : " + post.getPostTitle());
				System.out.println("내용 : " + post.getPostContent());
				System.out.println("추천 : " + post.getPostLike() + " 비추천 : " + post.getPostUnLike());
				System.out.println("===========================");
			}else {		
				System.out.println("===========================");
				System.out.println("번호 : " + post.getPostNo());
				System.out.println("작성자 : " + post.getPostId());
				System.out.println("제목 : " + post.getPostTitle());
				System.out.println("내용 : " + post.getPostContent());
				System.out.println("추천 : " + post.getPostLike() + " 비추천 : " + post.getPostUnLike());
				System.out.println("===========================");
				postInfo = post;
				recommendPost();
			}
		}
		
	}
	

	
	public void recommendPost() {
		// TODO Auto-generated method stub
//		String postId ="";
//		int postNo =0;
//		List<Post> list = PostDAO.getInstance().listPost();
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).getPostId().equals(MemberService.memberInfo.getMemberId())) {
//				shareGetPostDetail();
//				System.out.println(MemberService.memberInfo.getMemberId());
//				System.out.println(list.get(i).getPostId());
//				System.out.println(list.get(i).getPostNo());
//				break;
//			}else {	
//				shareGetPostDetail();
				Post post = new Post();
//				postId = list.get(i).getPostId();
//				postNo = list.get(i).getPostNo();
//				post.setPostId(postId);
//				post.setPostNo(postNo);
//				System.out.println(postId);
//				System.out.println(postNo);
				post.setPostNo(postService.postInfo.getPostNo());
				post.setPostId(postService.postInfo.getPostId());
				System.out.println(postService.postInfo.getPostNo());
				System.out.println(postService.postInfo.getPostId());
				System.out.println("추천 비추천 번호 입력>");
				int likeNo = Integer.parseInt(sc.nextLine());
				if(likeNo==1) {
					System.out.println("추천");
				}else if(likeNo == 2) {
					System.out.println("비추천");
				}else {
					System.out.println("번호를 다시 입력하세요");
				}
				int result = PostDAO.getInstance().recommendPost(post, likeNo);
				if(result > 0) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
				
//			}
//		}
	
		
	}
	
	//게시물 작성 시 포인트 획득
	public void getPoint() {
		// TODO Auto-generated method stub
	
			Post post = new Post();			
			post.setPostId(postService.postInfo.getPostId());
			int result = PostDAO.getInstance().getPoint(post);
			if(result >0) {
				System.out.println("포인트 적립 성공");
			}else {
				System.out.println("실패");
			}
		
	}
	//수정 삭제할 게시판 목록
	public void modifyListPost() {
		String id = MemberService.memberInfo.getMemberId();
		List<Post> list = PostDAO.getInstance().modifyListPost(id);
		String title ="";
		String content = "";
		Post post2 = new Post();
		for(Post post : list ) {
			System.out.println("============");
			System.out.println("번호 : " + post.getPostNo());
			System.out.println("제목 : " + post.getPostTitle());
			System.out.println("============");
		}
		shareGetPostDetail();
		System.out.println("1. 수정 | 2.삭제");
		int num = Integer.parseInt(sc.nextLine());
		if(num==1) {
			System.out.println("수정");
			System.out.println("제목>");
			title = sc.nextLine();
			
			System.out.println("내용>");
			content = sc.nextLine();
		}else if(num==2) {
			System.out.println("삭제");
		}else {
			System.out.println("번호를 다시 입력하세요");
		}
		post2.setPostTitle(title);
		post2.setPostContent(content);
		int result = PostDAO.getInstance().deletePost(post2,postService.postInfo.getPostNo(), num);
		if(result >0) {
			System.out.println("게시물 수정 삭제 성공");
		}else {
			System.out.println("실패");
		}
	}
		
	
	
	
}
