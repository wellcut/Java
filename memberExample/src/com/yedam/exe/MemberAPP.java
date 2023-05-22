package com.yedam.exe;

import java.util.Scanner;

import com.yedam.member.MemberService;

public class MemberAPP {
	boolean run = true;
	Scanner sc = new Scanner(System.in);
	MemberService ms = new MemberService();
	
	public MemberAPP() {
		start();
	}

	private void start() {
		while(run) {
			//로그인 되어 있을 때 -> MemberService.memberInfo != null
			//로그인이 안 되어 있을 떄-> MemberService.memberInfo == null
			if(MemberService.memberInfo != null) {
				loginMenu();
			}else if(MemberService.memberInfo == null) {
				logoutMenu();
			}
		}
	}

	private void logoutMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
		System.out.println("입력>");
		String menu =sc.nextLine();
		if(menu.equals("1")) {
			ms.login();
		}else if(menu.equals("2")){
			//회원가입
			ms.insertMember();		
		}		
		else if(menu.equals("3")){
			run = false;
			System.out.println("프로그램 종료");
		}else {
			System.out.println("없는 메뉴 선택!");
		}
	}

	private void loginMenu() {
		
		//A : admin, N : normal
		if(MemberService.memberInfo.getMemberGrade().equals("A")) {
			//관리자 메뉴
			System.out.println("1. 모든정보 조회 | 2. 회원 정보 수정 | 3. 회원 삭제 | 4. 로그아웃 | 5. 종료");
			String menu = sc.nextLine();
			switch (menu) {
			case "1":
				ms.getMemberList();
				break;
			case "2":
				ms.updatePhone();
				break;
			case "3":
				ms.deleteMember();
				break;
			case "4":
				ms.logout();
				break;
			case "5":
				run=false;
				System.out.println("프로그램 종료");
				break;
			
			}
			
		}else if(MemberService.memberInfo.getMemberGrade().equals("N")) {
			//일반 사용자 메뉴
			System.out.println("1. 내 정보 조회 | 2. 로그아웃 | 3.종료");
			String menu = sc.nextLine();
			if(menu.equals("1")) {
				//id는 변함이 없음
				//MemberDAO -> login(id) -> 데이터 재조회
				ms.confirmInfo();
			}else if(menu.equals("2")) {
				ms.logout();
			}else if(menu.equals("3")) {
				run = false;
				System.out.println("프로그램 종료");
			}else {
				System.out.println("없는 메뉴 입력");
			}
		}
//		System.out.println("1. 로그아웃 | 2. 종료");
//		String menu = sc.nextLine();
//		
//		switch (menu) {
//		case "1":
//			MemberService.memberInfo = null;
//			System.out.println("로그아웃 완료");
//			break;
//		case "2":
//			run = false;
//			System.out.println("프로그램 종료");
//			break;
//
//		
//		}
		
		
	}
}
