package com.yedam.homework;

public class StandardWeightInfo extends Human{
	//2) StandardWeightInfo 클래스를 정의한다.
	//- Human 클래스를 상속한다.
	//- 메소드는 다음과 같이 정의한다.
	//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
	//(2) public double getStandardWeight() : 표준체중을 구하는 기능
	//( * 표준 체중 : (Height - 100) * 0.9 )
	//
	
	StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
	}

	public void getInformation() {
		System.out.println("이름 : " + name + " 키 : " + height + "몸무게 : " + weight);
	}
	
	public double getStandardWeight() {
	
		return (height-100) * 0.9;
	}
}
