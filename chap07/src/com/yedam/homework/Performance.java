package com.yedam.homework;

public class Performance extends Culture{

	//3) Performance 클래스를 정의한다.
	//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
	//- 메소드는 다음과 같이 정의한다.
	//(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	//
	String genre;
	Performance(String genre){
		this.genre = genre;
	}
	Performance(String title, int directorNo, int actorNo) {
		super(title, directorNo, actorNo);
		
	}

	@Override
	public void getInformation() {
		System.out.println("극장제목 : " + title);
		System.out.println("감독 : " + directorNo);
		System.out.println("배우 : " + actorNo);

	}
	
}

