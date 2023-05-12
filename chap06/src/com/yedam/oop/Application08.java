package com.yedam.oop;

import java.util.Scanner;

import com.yedam.access.Access;

public class Application08 {

	//필드선언
	static int num=1;
	//메소드 선언
	 void info() {
		System.out.println("info출력");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = num+1;
		System.out.println(a);
		//자기 자신을 객체로 만든 예제 -> 절대로 하지 말 것.
		Application08 app = new Application08();
		app.info();
		
		//클래스에 정의된 정적 멤버 사용
		//클래스명.필드명 | 클래스명.메소드명
		
		//정적 필드
		System.out.println(StaticCal.PI);
		
		//정적 메소드
		System.out.println(StaticCal.plus(5, 4));
		System.out.println(StaticCal.minux(13, 8));
		
		
		Person p1 = new Person("11111-111111", "김또치");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("지구의 반지름 : " + StaticCal.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + StaticCal.PI * StaticCal.EARTH_RADIUS * StaticCal.EARTH_RADIUS);
		
		//다른패키지 import함
		Access ac = new Access();
		
		ac.free = "public";
		//패키지가 달라서 오류
//		ac.parent = "protected";
//		ac.basic = "default";
//		ac.privacy = "private";
		
		
		
		
		
	}

}
