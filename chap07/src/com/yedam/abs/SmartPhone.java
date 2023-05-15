package com.yedam.abs;

public class SmartPhone extends Phone{
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷검색");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
