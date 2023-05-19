package com.yedam.homeworkInter;

import java.util.Scanner;

public class Application03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Question 1]을 이용하여 랜덤게임 프로그램을 구현하라.
//	1) 프로그램을 실행할 경우 50% 확률로 두 개의 게임 중 하나가 셋팅된다.
//		( kpgame or ArcadeGame )
//	2) 다음과 같이 메뉴를 구성한다.
//		<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
//	3) 아래와 같이 출력결과가 나오도록 실행코드를 구현한다.
//	- 출력결과
//		PRGgame 실행
//		============================================================================================
//		<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
//		============================================================================================
//		choice>>1
//		캐릭터가 위쪽으로 이동한다.
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int no = (int)(Math.random()*2)+1;
		Keypad kp = null;
		if(no ==1) {
			kp = new RPGgame();
			
		}else {
			kp = new ArcadeGame();
		}	
			while(run) {	
				System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
				System.out.println("choice>>");
				int num = Integer.parseInt(sc.nextLine());
				if(num==1) {
					kp.leftUpButton();
				}
				if(num==2) {
					kp.leftDownButton();
				}
				if(num==3) {
					kp.rightUpButton();
				}
				if(num==4) {
					kp.rightDownButton();
				}
				if(num==5) {
					kp.changeMode();
				}
				if(num==0) {
					if(kp instanceof RPGgame) {
						kp = new ArcadeGame();
					}else {
						kp = new RPGgame();
					}					
				}
				if(num==9) {
					System.out.println("EXIT");
					run=false;
				}
			}
		}
			
		
		
	}


