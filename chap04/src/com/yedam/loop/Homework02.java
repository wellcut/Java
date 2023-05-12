package com.yedam.loop;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1
		System.out.println("x값 입력>");
		int x = Integer.parseInt(sc.nextLine());
		System.out.println("y값 입력>");
		int y = Integer.parseInt(sc.nextLine());
		if(x>0 && y>0) {
			System.out.println("제 1사분면");
		}else if(x<0 && y>0) {
			System.out.println("제2사분면");
		}else if(x<0 && y<0) {
			System.out.println("제2사분면");
		}else {
			System.out.println("제4사분면");
		}
		
		//2
		System.out.println("년도를 입력하세요");
		int year = Integer.parseInt(sc.nextLine());
		if(year % 4 ==0 || year % 400==0 ) {
			if(year % 100!=0) {
				System.out.println(year+"년은 윤년입니다");
			}else {
				System.out.println(year + "년은 윤년 아닙니다");
			}
		}
		
		
		//3
		System.out.println("가위 바위 보를 입력하세요");
		String ga = sc.next();
    	 String s = sc.nextLine();
		switch(ga) {
		case "가위":
			System.out.println("이기기 위해선 바위를 내야합니다");
			break;
		case "바위":
			System.out.println("이기기 위해선 보를 내야합니다");
			break;
		case "보":
			System.out.println("이기기 위해선 가위를 내야합니다");
			break;
		}
		
		//4
		for(int i =1; i<=5; i++) {
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//5
		System.out.println("m단을 입력");
		int m = Integer.parseInt(sc.nextLine());
		System.out.println("n단을 입력");
		int n = Integer.parseInt(sc.nextLine());
		
		
		for(int j = 1; j<=n; j++) {
			System.out.println(m + "*" + j + "=" + (m*j));
		}
		
		
	}

}
