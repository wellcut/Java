package com.yedam.array;

import java.util.Scanner;

public class StudentAry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------");
			int selectNo = Integer.parseInt(sc.nextLine());
			System.out.println("선택>" + selectNo);
			if(selectNo == 1) {
				 studentNum = Integer.parseInt(sc.nextLine());
				System.out.println("학생수> " + studentNum);
				
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int i =0; i < scores.length; i++) {
					scores[i] = Integer.parseInt(sc.nextLine());
				}
						
			}else if(selectNo == 3) {
				for(int i =0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> "+scores[i]);
				}
				
				
			}else if(selectNo == 4) {
				int max = scores[0];
				int sum =0;
				for(int i =0; i<scores.length; i++) {					
					if(max < scores[i]) {
						max = scores[i];
					}
					sum = sum+scores[i];
				}
				System.out.println("최고점수 : " + max);
				System.out.println("평균점수 : " + (double)sum/scores.length);
				
				
			}else if(selectNo == 5) {
				run = false;
			}		
		}
		System.out.println("프로그램 종료");
		
	}

}
