package com.yedam.oop;

public class Student {
	//학생의 정보를 관리하는 객체
	//이름,학년, 국어, 영어, 수학
	String name;
	String grade;
	int kor;
	int eng;
	int math;
	//기본 생성자
	Student(){
		
	}
	//메소드
	//모든 정보를 출력 getInfo()
	void getInfo() {
		System.out.println("이름 : "+name);
		System.out.println("학년 : "+grade);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		
	}
}
