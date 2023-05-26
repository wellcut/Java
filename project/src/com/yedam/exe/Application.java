package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class Application {
	
	
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	
	public Application() {
		start();
	}

	private void start() {
		while(true) {
			if(MemberService.memberInfo == null) {
				System.out.println(" 1. 로그인 | 2. 회원가입 | 3.종료");
				int menu = Integer.parseInt(sc.nextLine());
				
				if(menu == 1 ) {
					ms.login();
				}else if(menu == 2) {
					ms.insertMember();
				}else if (menu == 3) {
					System.out.println("종료");
					break;
				}else {
					System.out.println("없는 메뉴 선택");
				}
			}else if(MemberService.memberInfo != null) {
				if(MemberService.memberInfo.getMemberAuth().equals("U")) {
					new MemberApp();
				}else if(MemberService.memberInfo.getMemberAuth().equals("A")) {
					new AdminApp();
				}
			}
		}
	}
	
	
}
