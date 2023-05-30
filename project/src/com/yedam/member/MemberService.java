package com.yedam.member;

import java.util.List;
import java.util.Scanner;

import com.yedam.cart.CartService;
import com.yedam.exe.Application;
import com.yedam.inter.Inter;
import com.yedam.inter.InterDAO;
import com.yedam.inter.InterService;
import com.yedam.post.Post;
import com.yedam.post.PostDAO;
import com.yedam.post.postService;

public class MemberService {
	
	public static  Member memberInfo = null;
	Scanner sc = new Scanner(System.in);
	//회원가입
	CartService cs = new CartService();
	InterService is = new InterService();
	public void insertMember() {
		System.out.println("==========회원 가입 페이지=========");
		String id ="";
		String inter ="";
		
		while(true) {
			
			System.out.println("ID>");
			id = sc.nextLine();
			Member member = MemberDAO.getInstance().login(id);
			if(member !=null) {
				System.out.println("존재하는 아이디 입니다");
			}else if(member == null) {
				System.out.println("사용가능한 아이디 입니다");
				break;
			}
		}
		System.out.println("PW>");
		String pw = sc.nextLine();
		
		System.out.println("Tel>");
		String tel = sc.nextLine();
		
			
		
		while(true) {
			System.out.println("====================================");
			System.out.println("빅데이터, 클라우드, 프론트엔드, 백엔드, 정보보안");
			System.out.println("Inter>");
			inter = sc.nextLine();
			Inter inter2 = new Inter();
			 inter2 = InterDAO.getInstance().interList(inter);
			if(inter2 !=null) {			
				break;
			}else {
				System.out.println("존재하지 않는 분야 입니다");
			}
		}
		
		System.out.println("Name>");
		String name = sc.nextLine();
		Member member = new Member();
		member.setMemberInter(inter);
		member.setMemberId(id);
		member.setMemberPw(pw);
		member.setMemberTel(tel);
		member.setMemberName(name);
		
		int result = MemberDAO.getInstance().insertMember(member);
		if(result >0 ) {
			System.out.println("회원 가입 성공");
		}else {
			System.out.println("회원 가입 실패");
		}
		
		
	}
	//로그인
	public void login() {
		Member member = null;
		System.out.println("ID>");
		String id = sc.nextLine();
		
		System.out.println("PW>");
		String pw = sc.nextLine();
		member = MemberDAO.getInstance().login(id);
		
		if(member != null) {
			if(member.getMemberPw().equals(pw)) {
				System.out.println("정상 로그인 되었습니다");
				System.out.println(member.getMemberId() + "님 환영합니다");
				
				memberInfo = member;
			}else {
				System.out.println("비밀번호가 틀립니다");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다");
		}
		
	}
	
	//정보 조회
	public void memberInfo() {
		String id = MemberService.memberInfo.getMemberId();
		Member member = MemberDAO.getInstance().memberInfo(id);
		
		System.out.println("아이디 : " + member.getMemberId());
		System.out.println("비밀번호 : " + member.getMemberPw());
		System.out.println("전호번호 : " + member.getMemberTel());
		System.out.println("관심분야 : " + member.getMemberInter());
		System.out.println("이름 : " + member.getMemberName());
		System.out.println("포인트 : " + member.getMemberPoint());
		System.out.println("등급 : " +(member.getMemberAuth().equals("U") ? "일반 회원" : "관리자"));
		System.out.println("전달사항 : " + member.getInterMessage());
		
	}
	
	public void memberInfo2() {
		memberInfo();
		System.out.println("1.구매한 상품보기 | 2.뒤로가기");	
		int no = Integer.parseInt(sc.nextLine());
		if(no==1) {
			cs.cartList();
		}else {
			System.out.println("뒤로가기");
		}
	}
	
	//회원 수정
	public void memberModify() {
		Member member = new Member();
		member.setMemberId(MemberService.memberInfo.getMemberId());
		String inter ="";
		System.out.println("수정할 번호 입력");
		System.out.println("1. PW | 2. 연락처 | 3. 관심분야 | 4. 회원 탈퇴");
		int modNo = Integer.parseInt(sc.nextLine());
		
		if(modNo ==1 ) {
			System.out.println("PW를 변경합니다");
			member.setMemberPw(sc.nextLine());
		}else if(modNo==2) {
			System.out.println("연락처를 변경합니다");
			member.setMemberTel(sc.nextLine());
		}else if(modNo==3) {
			System.out.println("관심분야를 변경합니다");
			while(true) {
				System.out.println("====================================");
				System.out.println("빅데이터, 클라우드, 프론트엔드, 백엔드, 정보보안");
				System.out.println("Inter>");
				inter = sc.nextLine();
				Inter inter2 = new Inter();
				 inter2 = InterDAO.getInstance().interList(inter);
				if(inter2 !=null) {		
					member.setMemberInter(inter);
					break;
				}else {
					System.out.println("존재하지 않는 분야 입니다");
				}
			
			}
		}
		else if(modNo==4) {
			memberDelete2();
			MemberService.memberInfo=null;
			new Application();
		}
		else {
			System.out.println("번호를 다시 입력하세요");
		}
		int result = MemberDAO.getInstance().memberModify(member,modNo);
		
		if(result >0) {
			System.out.println("수정 완료");
		}else {
			System.out.println("수정 실패");
		}
	}
	public void logOut() {
		System.out.println("로그아웃 합니다");
		MemberService.memberInfo =null;
	}

	//회원 삭제
	public void memberDelete() {
		
		
		System.out.println("삭제할 회원 ID>");
		String id = sc.nextLine();
		int result = MemberDAO.getInstance().memberDelete(id);
		
		if(result >0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	public void memberDelete2() {

		String id = MemberService.memberInfo.getMemberId();
		int result = MemberDAO.getInstance().memberDelete(id);
		
		if(result >0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	//회원 전체 리스트
	
	public void memberList() {
		System.out.println("======회원 리스트======");
		List<Member> list = MemberDAO.getInstance().MemberList();
		for(Member member : list) {
			System.out.println("아이디 : " + member.getMemberId());
			System.out.println("이름 : " + member.getMemberName());
			System.out.println("등급 : " +(member.getMemberAuth().equals("U") ? "일반 회원" : "관리자"));
			System.out.println("==========================");
		}
	}

	//회원 권한 부여
	public void authModify() {
		memberList();
		String id ="";
		String auth = "";
		
		Member member =new Member();
		while(true) {
			System.out.println("회원>");
			 id = sc.nextLine();
			member = MemberDAO.getInstance().memberInfo(id);	
		if(member != null) {
			System.out.println("존재하는 회원입니다");
			System.out.println("권한 부여>");
			 auth = sc.nextLine();
			if(auth.equals("A")) {
				System.out.println("관리자 권한 부여");
				break;
			}else if(auth.equals("U")) {
				System.out.println("일반 사용자 권한 부여");
				break;
			}else {
				System.out.println("존재하지 않는 권한입니다");
			}
		}else {
			System.out.println("존재하지 않는 회원입니다");
		}
		}
	
		
	
		
	}

}

