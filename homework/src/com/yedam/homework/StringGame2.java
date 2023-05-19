package com.yedam.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringGame2 {
	private String[] strData = {"Orange", "Game", "Phone", "Smart"};
	private String strAnswer;
	
	//램덤으로 뽑은 단어와 입력한 문자가 존재하면 list에 담는다.
	private List<Character> charData;
	
	
	public StringGame2() {
		init();
	}

	public void setCharData() {
		showStrData();
		//list의 길이와 문자열의 길이가 같다면,, 단어가 가진 문자는 다 찾았다.
		if(charData.size() == strAnswer.length()) {
			System.out.println("문자열을 구성하는 문자를 다 입력했습니다");
		}else {
			String inputStr = inputData();
			if(strAnswer.indexOf(inputStr.charAt(0)) != -1) {
				System.out.println("문자열을 구성하는 문자입니다");
				charData.add(inputStr.charAt(0));
			}else {
				System.out.println("문자열을 구성하는 문자가 아닙니다");
			}
		}
		
	}



	public void showStrData() {
		// TODO Auto-generated method stub
		System.out.println("현재까지 확인된 문자열은 다음과 같습니다");
//		for(char data : charData) {
//			System.out.print(data + " ");
//		}
		for(int i =0; i<charData.size(); i++) {
			System.out.print(charData.get(i)+" ");
		}
		System.out.println();
	}



	private String inputData() {
		System.out.println("입력값>");
		
		return new Scanner(System.in).next().toLowerCase();
	}



	public void setStrData() {
		showStrData();
		String inputStr = inputData();
		if(strAnswer.equals(inputStr)) {
			System.out.println("정답입니다");
		}else {
			showStrData(inputStr);
		}
	}



	private void showStrData(String inputStr) {
		if(strAnswer.length()==inputStr.length()) {
			for(int i =0; i < strAnswer.length(); i++) {
				if(strAnswer.charAt(i)==inputStr.charAt(i)) {
					System.out.print("O");
				}else {
					System.out.print("X");
				}
			}
			System.out.println();
		}else {
			System.out.println("입력된 문자열의 길이가 정답과 다릅니다");
		}
	}






	public void init() {
		//랜덤단어
		strAnswer = getStrAnswer();
		//입력내역 초기화
		charData = new ArrayList<Character>();
	}



	private String getStrAnswer() {
		int idx = (int)(Math.random()*4);
		String str = strData[idx].toLowerCase();
		return str;
	}
	
	
}
