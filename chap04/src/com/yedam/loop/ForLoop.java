package com.yedam.loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<= 100; i++) {
			System.out.println(i);
		}
		
		int result =0;
		for(int i = 1; i<=100; i++) {
			result +=i;
		}
		System.out.println("1~100사이의 합 : "+result);
		
		//1~100사이의 짝, 홀수 구하기
		for(int i =0 ; i<=100; i++) {
			if (i%2==0) {
				System.out.println("짝수 : " + i);
			}else if(!(i%2==0)) {
				System.out.println("홀수 : " + i);
			}
		}
		
		//입력한 숫자에 대한 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		
		//2 -> 2*1, 2*2...2*9=18
		System.out.println("구구단 입력>");
		int gugu = Integer.parseInt(sc.nextLine());
		int i;
		for(i=1; i<=9; i++) {
			System.out.println(gugu+ " * " + i +" = " + gugu*i);
		}
		
		//입력한 값에 대해 총합, 평균, 최대값, 최소값 구하기
		//몇번 반복 값을 입력 받는다.
		//ex) 5번 -> 2,50,20,10,5
		
//		System.out.println("몇번 값 입력>");
//		int count = Integer.parseInt(sc.nextLine());
//		int total =0;
//		int avg =0;
//		int max =0;
//		int min =0;
//		i=0;
//		for(int i1 =0; i1<count; i1++) {
//			System.out.println("데이터 입력>");
//			int data = Integer.parseInt(sc.nextLine());
//			total += data;
//			avg =total/count;
//			if(i1==0) {
//				max= data;
//				min = data;
//			}else {
//				if(max < data) {
//					max = data;
//				}
//				if(min > data) {
//					min = data;
//				}
//			}
//			
//		}
//		
//		System.out.println("총합 : "+total+" 평균 : "+ avg + " 최대값 : " + max + " 최소값 : " + min);
	
		
		//임의의 랜덤 값(1~100) 하나 추출
		//5번 기회안에 해당 랜덤 값을 맞추는 프로그램 구현
		//예시) 랜덤 값 : 50
		//입력 -> 30
		//컴퓨터 : up
		//입력 -> 40
		//컴퓨터 : up
		//사용자 입력 ->60
		//컴퓨터 :down
		
		//1) 맞춘 경우 -> 정답, 몇 번만에 맞추셨습니다 -> 반복문 강제 종료 break;
		//2)기회 안에 못 맞춘 경우 -> 모든 기회를 소진하셨습니다
		
		
		int randomNo = (int)(Math.random()*100)+1;
		for(i=1; i<=5; i++) {
			System.out.println("값을 입력하세요");
			int num = Integer.parseInt(sc.nextLine());
			if(num == randomNo) {
				System.out.println("정답, " +i+ "번만에 맞추셨습니다");
				break;
			}
			 else if(num<randomNo){				
				System.out.println("UP");
				} 
			 else {
				 System.out.println("down");
				}
			if(i==5) {
				System.out.println("모든 기회 소진");
				}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
