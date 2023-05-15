package com.yedam.inheri;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 메소드 실행");
		return Math.PI * r * r;
	}
}
