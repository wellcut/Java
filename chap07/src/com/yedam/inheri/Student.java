package com.yedam.inheri;

public class Student extends People {
	//필드
	int stdNo;
	
	
	//생성자
	public Student(String name, String ssn, int stdNo) {
		
		//부모클래스 객체 생성
		super(name, ssn);
		
		this.stdNo = stdNo;
	}
	
}
