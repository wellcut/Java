package com.yedam.access;

public class Application03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//하나의 객체를 외부로 전다
		
		Singleton s1 =  Singleton.getInstance();
		Singleton s2 =  Singleton.getInstance();
		
		System.out.println(s1==s2);
		
		s1.age = 100;
		s1.name="홍길돌";
		System.out.println(s2.age);
		System.out.println(s2.name);
		Member member = new Member();
		member.instance();
		
	}

}
