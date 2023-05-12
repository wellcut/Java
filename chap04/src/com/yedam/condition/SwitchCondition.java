package com.yedam.condition;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random()*6+1);
		
		switch(number) {
		case 1:
			System.out.println("주사위 번호 1");
			break;
		case 2:
			System.out.println("주사위 번호 2");
			break;
		case 3:
			System.out.println("주사위 번호 3");
			break;
		case 4:
			System.out.println("주사위 번호 4");
			break;
		case 5:
			System.out.println("주사위 번호 5");
			break;
		case 6:
			System.out.println("주사위 번호 6");
			break;		
		}
		
		
		//char
		char grade = 'B';
		String grade2 = "b";
		switch(grade2) {
		case "A":
			System.out.println("우수 회원");
			break;
		case "B":
		case "b":
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("불량 회원");
			break;
		}
		
		//입력한 성적을 등급으로 표현
		int score;
		Scanner sc = new Scanner(System.in);
		System.out.println("성적입력>");
		score = Integer.parseInt(sc.nextLine());
		
		//주 : switch 부 : if
		//0~100
		//90 이상은 A -> 95 이상이면 A+ 95 이
		//80 이상은 B -> 90 ~ 85 B+ 80 ~ 84 B
		//70 이상은 C -> 80 ~ 75 C+ 70 ~ 74 C
		//그 이하는 D

		switch(score/10) {
		case 9:
			if(score>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A");
			}
			break;
		case 8:
			if(score>=85) {
				System.out.println("B+");
			}else {
				System.out.println("B");
			}
			break;
		case 7:
			if(score>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C");
			}
			break;
		default:
			System.out.println("D");
			break;
			
		}
		
		//메뉴 선택
		System.out.println("1. 글 보기 2. 글 수정 3. 글 삭제 4. 뒤로가기");
		int selectNo = Integer.parseInt(sc.nextLine());
		switch(selectNo) {
		case 1:
			System.out.println("1번 선택");
			System.out.println("글 보는 기능");
			break;
		case 2:
			System.out.println("2번 선택");
			System.out.println("글 수정하는 기능");
			break;
		case 3:
			System.out.println("3번 선택");
			System.out.println("글 삭제하는 기능");
			break;
		case 4:
			System.out.println("4번 선택");
			System.out.println("뒤로가기");
			break;
		}
		
		
		
		
		
		
		
	}

}
