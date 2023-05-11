package com.yedam.oop;

public class Application04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book myBook = new Book("혼자 공부하는 자바","학습서",20000,"0001","한빛미디어");
		myBook.getInfo();
		
		System.out.println();
		Book myBook2 = new Book("자바 스크립트","학습서",15000,"0002", "한빛미디어");
		myBook2.getInfo();
	}

}
