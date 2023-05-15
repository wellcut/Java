package com.yedam.homework;

public class Application03 {

	public static void main(String[] args) {
		//4) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
		//- 출력결과
//			영화제목 : 추격자
//			감독 : 7
//			배우 : 5
//			영화총점 : 12
//			영화평점 : ☆☆☆☆
//			=====================
//			공연제목:지킬앤하이드
//			감독:9
//			배우:10
//			공연총점 : 46
//			공연평점 : ☆☆☆☆☆
		//- 조건
//			관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다
		Culture cul = new Movie("추격자", 5, 7);
		cul.getInformation();
		cul.setTotalScore(12);
		cul.getGrade();
		System.out.println("==================");
		Performance per = new Performance("지킬앤하이드", 9, 10);
		per.getInformation();
		per.setTotalScore(3);
		per.getGrade();
	}

}
