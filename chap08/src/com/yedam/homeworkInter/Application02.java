package com.yedam.homeworkInter;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4) 아래와 같이 출력결과가 나오도록 실행코드를 구현한다.
		//- 출력결과
		//NOTEBOOK_MODE
		//한글2020을 통해 문서를 작성.
		//영화를 시청.
		//TABLET_MODE
		//안드로이드앱을 실행.
		//크롬을 통해 인터넷을 검색.
		PortableNotebook ptn = new PortableNotebook();
		ptn = new PortableNotebook("한글2020","영화","안드로이드앱","크롬");
		ptn.writeDocumentaion();;
		ptn.watchVideo();
		ptn.changeMode();
		ptn.useApp();
		ptn.searchInternet();
		
		
	}

}
