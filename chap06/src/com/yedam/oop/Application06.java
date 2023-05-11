package com.yedam.oop;

import java.util.Scanner;

public class Application06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생의 정보를 관리하는 프로그램
		//학생의 정보를 관리하는 객체
		//이름,학년, 국어, 영어, 수학
		
		//기본 생성자
		
		//메소드
		//모든 정보를 출력 getInfo()
		//학생 정보를 보관하는 배열
		Student[] stAry = null;
		//학생 수
		int stNum = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("=============================================");	
		System.out.println("1.학생수 | 2.정보입력 | 3.정보 확인 | 4.분석 | 5.종료");
		System.out.println("=============================================");	
		int selectNo = Integer.parseInt(sc.nextLine());
		if(selectNo ==1) {
			System.out.println("학생수 입력>");
			stNum = Integer.parseInt(sc.nextLine());
			
		}else if(selectNo==2){
			stAry = new Student[stNum];
			
			for(int i =0; i<stAry.length; i++) {
				//1.객체를 생성하고 배열에 저장
				Student student = new Student();
				System.out.println("이름 : ");
				student.name = sc.nextLine();
				System.out.println("학년 : ");
				student.grade = sc.nextLine();
				System.out.println("국어 성적 : ");
				student.kor = sc.nextInt();
				System.out.println("영어 성적 : ");
				student.eng = sc.nextInt();
				System.out.println("수학 성적 : ");
				student.math = sc.nextInt();
				String s = sc.nextLine();
				//2. 객체를 배열에 저장
				stAry[i] = student;
				
				//배열에 바로 객체를 만듬
//				stAry[i] = new Student();
//				System.out.println("이름 : ");
//				stAry[i].name = sc.nextLine();
//				System.out.println("학년 : ");
//				stAry[i].grade = sc.nextLine();
//				System.out.println("국어 성적 : ");
//				stAry[i].kor = sc.nextInt();
//				System.out.println("영어 성적 : ");
//				stAry[i].eng = sc.nextInt();
//				System.out.println("수학 성적 : ");
//				stAry[i].math = sc.nextInt();
//				String s = sc.nextLine();
				
			}
		}else if(selectNo==3){
			for(int i=0; i<stAry.length; i++) {
				System.out.println((i+1)+"번째 학생 정보");
				stAry[i].getInfo();
				System.out.println();
			}
		}else if(selectNo==4){
			int total =0;
			double avg =0;
			int min = 0;
			int max = 0;
			for(int i =0; i<stAry.length; i++) {
				total = total + stAry[i].kor+stAry[i].eng+stAry[i].math;
				max = stAry[i].kor;
				min = stAry[i].kor;
				//1)if문
				if(stAry[i].eng < stAry[i].math) {
					if(max < stAry[i].math) {
						max = stAry[i].math;
					}
				}else {
					if(max < stAry[i].eng) {
						max = stAry[i].eng;
					}
				}
				
				if(stAry[i].eng < stAry[i].math) {
					if(min > stAry[i].eng) {
						min = stAry[i].eng;
					}
				}else {
					if(min > stAry[i].math) {
						min = stAry[i].math;
					}
				}
				//2
				System.out.println(stAry[i].name);
				System.out.println(max);
				System.out.println(min);
				System.out.println(total);
				avg=(double)total/stAry.length;
				System.out.println(avg);
			}
			
		}else if(selectNo==5){
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("없는 번호 입니다.");
		}
		//1. 학생수
		//2. 정보입력
		//3. 정보 확인
		//4. 분석 - 개인별 가장 점수가 높은 과목 / 낮은 과목
		// 		 - 전체 학생의 점수를 총합(국 + 영 + 수) 		
		//		 - 총점의 평균 
		//5. 종료
		}
	}

}
