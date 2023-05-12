package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class keyCode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("입력>");
		
		int keyCode =0;
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		//scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		
		//문자열 읽기
		//nextLine() => enter키 이전까지 데이터를 받아 옴, enter키 기준으로 데이터를 읽어 옴, enter키 소멸된다
		String inputData = scanner.nextLine();
		
		//정수 읽기
		//1.nextInt() => enter키가 남아 있음
		int data = scanner.nextInt();
		//3.해결방법 -> enter키를 소멸시킴
		scanner.nextLine();
		//2.그래서 데이터를 입력하지도 않았는데 공백이 입력이 됨
		inputData = scanner.nextLine();
		System.out.println("Scanner 활용 => " + inputData);
		
		//데이터 비교-> 입력한 값 == 저장된 값 비교
		//기본 타입(정수, 실수 비교 ==) 
		//문자열 -> equals로 비교
		if(inputData.equals("yedam")) {
			System.out.println("yedam과 일치합니다");
		}
		

	}

}
