package com.yedam.member;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.post.Post;

public class MemberDAO extends DAO{
	
	private static MemberDAO memberDao = null;
	private MemberDAO() {
		
	}
	public static MemberDAO getInstance() {
		if(memberDao ==null) {
			memberDao = new MemberDAO();
			
		}
		return memberDao;
	}

	//회원가입
	public int insertMember(Member member) {
		int result =0;
		try {
			conn();
			String sql = "INSERT INTO member VALUES(?,?,?,?,?,0,'U','')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPw());
			pstmt.setString(3, member.getMemberTel());
			pstmt.setString(4, member.getMemberInter());
			pstmt.setString(5, member.getMemberName());

			result = pstmt.executeUpdate();
	
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
	
		return result;
	}
	//로그인
		public Member login(String id) {
			Member member = null;
			try {
				conn();
				String sql = "SELECT * FROM member WHERE member_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,id);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					member = new Member();
					member.setMemberId(rs.getString("member_id"));
					member.setMemberPw(rs.getString("member_pw"));
					member.setMemberTel(rs.getString("member_tel"));
					member.setMemberInter(rs.getString("member_inter"));
					member.setMemberName(rs.getString("member_name"));
					member.setMemberPoint(rs.getInt("member_point"));
					member.setMemberAuth(rs.getString("member_auth"));
					
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				disconn();
			}
			return member;
		}
		
		//정보 조회
		public Member memberInfo(String id) {
		Member member = null;
			try {
				conn();
				String sql = "SELECT * FROM member m JOIN  inter i ON m.member_inter = i.inter_name WHERE m.member_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs=pstmt.executeQuery();
				while(rs.next()) {
					member = new Member();
					member.setMemberId(rs.getString("member_id"));
					member.setMemberPw(rs.getString("member_pw"));
					member.setMemberTel(rs.getString("member_tel"));
					member.setMemberInter(rs.getString("member_inter"));
					member.setMemberName(rs.getString("member_name"));
					member.setMemberPoint(rs.getInt("member_point"));
					member.setMemberAuth(rs.getString("member_auth"));
					member.setInterMessage(rs.getString("inter_message"));
									
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				disconn();
			}
			return member;
		}
		
		
		//정보수정
		public int memberModify(Member member,int modNo) {
			int result = 0;
			try {
				conn();
				if(modNo == 1) {
					String sql = "UPDATE member SET member_pw = ? WHERE member_id= ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, member.getMemberPw());
					pstmt.setString(2, member.getMemberId());
					result = pstmt.executeUpdate();
				}
				else if(modNo == 2) {					
					String sql = "UPDATE member SET member_tel = ? WHERE member_id= ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, member.getMemberTel());
					pstmt.setString(2, member.getMemberId());
					result = pstmt.executeUpdate();
				}else if(modNo == 3) {					
					String sql = "UPDATE member SET member_inter = ? WHERE member_id= ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, member.getMemberInter());
					pstmt.setString(2, member.getMemberId());
					result = pstmt.executeUpdate();
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				disconn();
			}
			return result;
		}
		
		
		//회원 삭제
		public int memberDelete(String id) {
				int result = 0;
				try {
					conn();
					String sql2 = "DELETE FROM member WHERE member_id = ?";
					pstmt=conn.prepareStatement(sql2);
					pstmt.setString(1, id);
					result = pstmt.executeUpdate();				
				}catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}finally {
					disconn();
				}
				return result;
		}
		
		//회원 전체 조회
		public List<Member> MemberList(){
			List<Member> list = new ArrayList<>();		
			try {
				conn();
				String sql = "SELECT * FROM member";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Member member = new Member();
					member.setMemberId(rs.getString("member_id"));
					member.setMemberName(rs.getString("member_name"));
					member.setMemberAuth(rs.getString("member_auth"));
					list.add(member);
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				disconn();
			}
			
			return list;
			
			
		}
		
		
		//회원 권한 부여
		public int authModify(String id, String auth) {
			int result = 0;		
			try {
				conn();				
				String sql="UPDATE member SET member_auth = ? WHERE member_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, auth);
				pstmt.setString(2, id);
				result = pstmt.executeUpdate();			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				disconn();
			}
			
			return result;
		}
		
		
}


	














