package com.yedam.oop;

public class Car {
	//필드 : 객체를 만들었을 때 정보를 담아주는 역할
	//필드 선언
	String name; //자동차 이름
	int price; //가격
	//클래스 내부에서 필드에 정보 입력
	String company = "벤틀리"; //제조사
	
	
	//생성자 : 객체를 생성할때 우선적으로 해야하는 행동을 정의함
	//생성자 : 클래스 이름과 동일
	//생성자 : 다양한 방법으로 객체를 생성하기 위헤서 생성자를 오버로딩
	Car(){
		//기본 생성자
	}
	Car(String name, int price){
		
	}
	Car(int price,String company){
		
	}
	Car(String name){
		this(name, 10000, "현대");
		//this.name=name;
		System.out.println("자동차 이름만 입력");
	}
	Car(int price){
		
	}
	Car(String name, int price, String company){
		this.name = name;
		this.price = price;
		this.company = company;
		System.out.println("모든 필드 초기화");
	}
	//메소드 : 객체가 사용할 수 있는 기능
	//반환값이 없는 메소드 :void
	void run() {
		System.out.println("자동차가 달립니다");
	}
	
	//문자열을 변화(리턴)하는 메소드
	String info() {
		String data = company + " : " + name + " : " + price;
		return data;
	}
	
	
	
	
}
