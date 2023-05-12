package com.yedam.access;

import java.util.Arrays;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dice = null;
		int diceNo = 0;		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===1.주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료===");
			System.out.println("메뉴>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch (selectNo) {
			case 1:
				System.out.println("주사위 크기>");
				diceNo = Integer.parseInt(sc.nextLine());
				if(diceNo<5 || diceNo>10) {
					System.out.println("주사위 범위를 벗어 났습니다");
					diceNo = 0;
				}
				break;
			case 2:
				if(diceNo ==0) {
					System.out.println("주사위 번호를 다시 입력하세요");
					
				}else {
					dice = new int[diceNo];
					int count =0;
					while(true){
						count++;
						int randomDice = (int)(Math.random()*diceNo)+1;
						//dice[randomDice-1]= dice[randomDice-1]+1;
						dice[randomDice-1]++;
						if(randomDice ==5) {
							System.out.println("5가 나올 때까지 "+ count + "번 걸렸습니다.");
							break;
						}
					}
				}
				break;
			case 3:
				for(int i = 0; i<dice.length; i++) {
					System.out.println((i+1) + "은 " + dice[i]);
				}
				break;
			case 4:
				int max =dice[dice.length-1];
				int temp =0;
				for(int i =dice.length-2; i>=0; i--) {
					
					if(max<dice[i]) {
						max = dice[i];
						temp =i+1;
					}
				}
				System.out.println(temp);
				break;
			case 5:
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			if(selectNo==1) {
//				System.out.println("주사위 크기>");
//				arrNum = Integer.parseInt(sc.nextLine());
//				if(arrNum <5 || arrNum>10) {
//					System.out.println("주사위 크기 5~10을 입력하세요.");
//					
//				}
//			}else if(selectNo==2) {
//				arr= new int[arrNum];
//				for(int i =0; i<arr.length; i++) {
//					arr[i] = (int)(Math.random()*arrNum)+1;
//					System.out.println("주사위"+arr[i]);
//					if(arr[i]==5) {
//						System.out.println("5가 나올 때까지 주사위를 "+(i+1)+"번 굴렸습니다");
//						break;
//					}
//				}
//			}else if(selectNo==3) {
//				int[] no = new int[arrNum];
//				
//				for(int i =0; i <arr.length; i++) {
//					
//						if(arr[i]==0) {
//							no[i]=0;
//						}else if(arr[i]==5){
//							no[arr[i]-1]=no[arr[i]-1]+1;
//						}
//						else {
//							no[arr[i]-1]=no[arr[i]-1]+1;
//						}
//					
//					System.out.println((i+1)+"은"+no[i]);
//				}
//				
//
//				
//			}else if(selectNo==4) {
//				
//			}else if(selectNo==5) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//			
			
			
			
			
			
		}
		
		
	}
}
