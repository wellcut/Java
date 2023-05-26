package com.yedam.exe;

import java.util.Scanner;

import com.yedam.cart.CartService;
import com.yedam.member.MemberService;
import com.yedam.post.postService;
import com.yedam.product.ProductService;

public class MemberApp {
	Scanner sc = new Scanner(System.in);
	postService ps = new postService();
	ProductService ps2 = new ProductService();
	MemberService ms = new MemberService();
	CartService cs = new CartService();
	public MemberApp() {
		start();
	}

	private void start() {
		
		while(true) {
			menu();
			int menuNo = Integer.parseInt(sc.nextLine());
			if(menuNo==1) {
				ms.memberInfo2();
			}else if(menuNo==2) {
				ms.memberModify();
			}else if(menuNo==3) {
				ps.insertPost();
			}else if(menuNo==4) {
				ps.listPost();
				
			}else if(menuNo==5) {
				ps.modifyListPost();
			}else if(menuNo==6) {
				ps2.pctList();
				cs.pctBuy();
			}else if(menuNo==7) {
				ms.logOut();
				break;
			}else if(menuNo ==8) {
				ms.memberDelete2();
				MemberService.memberInfo=null;
				break;
			}
		}
	}

	private void menu() {
		System.out.println("1.정보 조회 | 2. 정보 수정 | 3. 게시물 등록 | 4. 게시물 보기 | 5. 게시물 수정 삭제| 6. 상품 구매 | 7. 로그아웃 ");
	}
	
	
	
	
	
}
