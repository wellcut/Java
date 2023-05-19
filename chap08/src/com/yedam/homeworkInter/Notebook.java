package com.yedam.homeworkInter;

public interface Notebook {
//	1) Notebook 인터페이스를 정의한다.
//- 다음과 같이 상수 필드를 정의한다.
//(1) public static final int NOTEBOOK_MODE = 1;
//- 다음과 같이 메소드를 정의한다.
//(1) public abstract void writeDocumentaion() : 문서를 작성하는 기능
//(2) public abstract void searchInternet() : 인터넷을 검색하는 기능
//
	public static final int NOTEBOOK_MODE = 1;

	public abstract void writeDocumentaion();
	public abstract void searchInternet();
}
