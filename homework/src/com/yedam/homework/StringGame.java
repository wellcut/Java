package com.yedam.homework;

import java.util.Scanner;

public class StringGame {
	char input;
	String output;
	String data;
	String result = "";
	int num2 =0;
	boolean isContain = false;
	public StringGame() {
		int num = (int)(Math.random()*4)+1;
		switch(num) {
		case 1:
			data = "Orange";
			break;
		case 2:
			data = "Game";
			break;
		case 3:
			data = "Phone";
			break;
		case 4:
			data = "Smart";
			break;
		}
	}
	Scanner sc = new Scanner(System.in);
	public void setCharData() {
		System.out.println("입력 값>>");
		input = sc.next().charAt(0);

		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		for(int i =0; i<data.length(); i++) {
			char data2 = data.toLowerCase().charAt(i);
			
			 if(data2 == input) {
				System.out.println("맞다");
				result += input;
				isContain = true;
				System.out.println(result);			 
				if(result.length() == data.length()) {
					System.out.println("문자열 다 입력했습니다");
				
				}
			}
		}
		if(isContain =false) {
			System.out.println("다시입력");
		}
	}

	public void setStrData() {
		System.out.println(result);
		System.out.println("입력 값>>");
		String input2 = sc.next();
		for(int i = 0; i<data.length(); i++) {			
			if(data.toLowerCase().charAt(i)==input2.charAt(i)) {
				result +="O";
			}else {
				result +="X";
			}
		}
		System.out.println(result);
		
	}

	public void showCharData() {
		System.out.println("현재까지 확인된 입력 내용 ");
		System.out.println(result);
	}

	public void init() {
		System.out.println("새로운 게임 시작");
	}

}
