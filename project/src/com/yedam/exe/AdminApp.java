package com.yedam.exe;

import java.util.Scanner;

import com.yedam.inter.InterService;
import com.yedam.member.MemberService;
import com.yedam.post.postService;
import com.yedam.product.ProductService;

public class AdminApp {
	boolean run = true;
	Scanner sc = new Scanner(System.in);
	ProductService ps = new ProductService();
	postService ps2 = new postService();
	MemberService ms = new MemberService();
	InterService is = new InterService();
	public AdminApp() {
		start();
	}

	private void start() {
		
		// TODO Auto-generated method stub
		while(run) {
			menu();
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				ms.authModify();
				break;
			case 2:
				ms.memberList();
				ms.memberDelete();
				break;
			case 3:
				
				is.transMsg();
				break;
			case 4:
				ps2.shareListPost();
				ps2.modifyListPost();	
				break;
			case 5:
				ps.pctInsert();
				break;
			case 6:
				ps.pctModify();
				break;
			case 7:	
				ms.logOut();
				run = false;
				break;
				

			}
		}
	}

	private void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. 회원 권한 부여 | 2. 회원 삭제 | 3.관심분야별 회원에게 전달사항 보내기 | 4.게시물 삭제 | 5. 상품 등록 | 6.상품 수정 삭제 | 7. 로그아웃");
	}
}
