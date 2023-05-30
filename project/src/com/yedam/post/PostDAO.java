package com.yedam.post;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.member.Member;

public class PostDAO extends DAO{
	private static PostDAO postDao = null;
	
	private PostDAO() {
		
	}
	public static PostDAO getInstance() {
		if(postDao == null) {
			postDao = new PostDAO();
		}
		return postDao;
	}
	
	//게시물 등록
	public int insertPost(Post post) {
		int result = 0;
		try {
			conn();
			String sql ="INSERT  INTO posts(post_no, post_title, post_content, post_id, post_like, post_unlike)"
					+ " VALUES( (SELECT nvl(max(post_no),0)+1 FROM posts),?,?,?,0,0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, post.getPostTitle());
			pstmt.setString(2, post.getPostContent());
			pstmt.setString(3, post.getPostId());
			result = pstmt.executeUpdate();
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	
	
	
	//게시물 목록 보기
	
	public List<Post> listPost(){
		List<Post> list = new ArrayList<>();
		Post post = null;
		try {
			conn();
			String sql = "SELECT post_no, post_title, post_content, post_id FROM posts ORDER BY post_no";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				post = new Post();
				post.setPostNo(rs.getInt("post_no"));
				post.setPostTitle(rs.getString("post_title"));
				post.setPostContent(rs.getString("post_content"));
				post.setPostId(rs.getString("post_id"));
				list.add(post);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return list;
	}
	
	//게시물 상세 보기
	public Post getPostDetail(int postNo) {
		Post post  = null;
		try {
			conn();
			String sql = "SELECT * FROM posts WHERE post_no =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, postNo);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				post = new Post();
				post.setPostNo(rs.getInt("post_no"));
				post.setPostId(rs.getString("post_id"));
				post.setPostTitle(rs.getString("post_title"));
				post.setPostContent(rs.getString("post_content"));
				post.setPostLike(rs.getInt("post_like"));
				post.setPostUnLike(rs.getInt("post_unlike"));
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return post;
	}
	
	
	
	
	//게시물 작성 포인트 얻기
	public int getPoint(Post post) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE member set member_point = member_point+3 \r\n"
					+ "WHERE member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, post.getPostId() );
			
			result = pstmt.executeUpdate();	
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//게시물 추천 비추천 
	public int recommendPost(Post post, int likeNo) {
		int result =0;
		try {
			conn();
			String sql = "";
			String sql3="";
			String sql2 = "SELECT member_point FROM member WHERE member_id =?";
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, post.getPostId());
			rs= pstmt.executeQuery();
			//포인트를 담는 변수
			int point = 0;
			if(rs.next()) {
				point = rs.getInt("member_point");
			}
			
			if(likeNo == 1) {
				sql = "UPDATE posts \r\n"
						+ "SET POST_LIKE = POST_LIKE + 1 \r\n"
						+ "WHERE post_no = ? ";
				if(point >=0) {
				sql3 = "UPDATE member SET member_point = member_point + 1\r\n"
						+ "WHERE member_id = ?";
				pstmt = conn.prepareStatement(sql3);
			 	pstmt.setString(1, post.getPostId());
				result = pstmt.executeUpdate();
				}
			}else if(likeNo ==2) {				
					sql = "UPDATE posts "
							+"SET POST_UNLIKE = POST_UNLIKE + 1"
							+ "WHERE post_no = ? ";
					if(point>0) {
						sql3 = "UPDATE member SET member_point = member_point - 1 WHERE member_id = ?";
						pstmt = conn.prepareStatement(sql3);
					 	pstmt.setString(1, post.getPostId());
						result = pstmt.executeUpdate();
						}else if(point < 0) {
							sql3 = null;
							System.out.println("포인트가 없습니다");
						}
			}	 	
			pstmt = conn.prepareStatement(sql);		
		 	pstmt.setInt(1, post.getPostNo());	 	
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//수정및 삭제할 게시판 목록
	public List<Post> modifyListPost(String id){
		List<Post> list = new ArrayList<>();
		Post post = null;
		try {
			conn();
			String sql = "SELECT post_no, post_title, post_content, post_id FROM posts WHERE post_id=? ORDER BY post_no";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				post = new Post();
				post.setPostId(id);
				post.setPostNo(rs.getInt("post_no"));
				post.setPostTitle(rs.getString("post_title"));
				post.setPostContent(rs.getString("post_content"));
				list.add(post);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}	
		return list;
	}
	//게시판 삭제
	public int deletePost(Post post,int postNo, int num) {
		int result = 0;
		try {
			conn();
			if(num==1) {
				String sql = "UPDATE posts SET post_title =? , post_content = ? WHERE post_no=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, post.getPostTitle());
				pstmt.setString(2, post.getPostContent());
				pstmt.setInt(3, postNo);
				result = pstmt.executeUpdate();
			}else if(num==2) {
				String sql2 = "DELETE FROM posts WHERE post_no = ? ";
				pstmt = conn.prepareStatement(sql2);
				pstmt.setInt(1, postNo);
				result=pstmt.executeUpdate();
			}
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
		}
		return result;
		
	}
	
	
	
	
	
	
}
