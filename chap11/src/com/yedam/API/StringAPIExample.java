package com.yedam.API;

import java.util.Scanner;

public class StringAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) 문자열 뒤집기
		//String str = "abcdefg" -> "gfedcba"
		String str = "abcdefg";
		String reverse = "";
		for(int i = str.length()-1; i >=0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
		//2)문자 개수 찾기
		//String str = "1n2ASD 330naa1"
		//숫자 : 6개 알파벳 : 7개 공백(뜨위쓰기) : 1
		
		str = "1n2ASD 330naa1";
		int alpha = 0;
		int space =0;
		int num =0;
		int[] str2 = new int[3]; 
		for( int i =0; i < str.length(); i++) {
			char tempCh = str.charAt(i);
			if(tempCh ==' ') {
				space++;
			}else if(tempCh >= '0' && tempCh <='9') {
				num++;
			}else if(tempCh >='A' && tempCh <='Z' ||tempCh >='a' && tempCh <='z' ) {
				alpha++;
			}
			
		}
			System.out.println("공백 : " + space + " 숫자 : " + num + " 문자 : " + alpha);
		
		//3) 주민등록번호 입력 후 나이 계산하기
		//단, 올해 기준으로 00 ~ 23년생 -> 21세기(2000년대), 24 ~ 99년생 -> 20세기(1900년대)
		//String ssn = "980102-1234567"
		//나이 : 26
		//String ssn = "000102-1234567"
		//나이 : 24
		
		Scanner sc = new Scanner(System.in);
		String birth = sc.nextLine();
		//년도 문자열을 자르고 정수로 변환
		int birthNo = Integer.parseInt(birth.substring(0,2));
		
		if(birthNo <=23) {
			System.out.println("나이 : " + (24-birthNo) + "살");
		}else {
			System.out.println("나이 : " + (124-birthNo) + "살");
		}
		
		//4) 문자열 개수 파악 
		//String str = "KKHSSSSSSSSE"
		str = "KKHSSSSSSSSE";
		String result = "";
		int count =1;
		for(int i =0; i<str.length(); i++) {
			if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
			}else {
				result += str.charAt(i);
				if(count >1 ) {
					result += String.valueOf(count);
				}
				count = 1;
			}
		}
		
		System.out.println(result);
		
		
		
		
	}



	

}
