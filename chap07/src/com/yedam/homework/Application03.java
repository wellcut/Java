package com.yedam.homework;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("영화 관객수 입력");
		int attend = Integer.parseInt(sc.nextLine());
		Culture movie = new Movie("추격자", 5, 7);
		
		for(int i = 1; i<=attend; i++) {
			System.out.println(i + "번째 점수 입력");
			int score = Integer.parseInt(sc.nextLine());
			movie.setTotalScore(score);
		}
		movie.getInformation();
		System.out.println("==================");
		
		System.out.println("극장 관객수 입력");
		int attend2 = Integer.parseInt(sc.nextLine());
		Performance per = new Performance("지킬앤하이드", 9, 10);
		for(int i = 1; i<=attend2; i++) {
			System.out.println(i + "번째 점수 입력");
			int score = Integer.parseInt(sc.nextLine());
			per.setTotalScore(score);
		}
		per.getInformation();
		
	}

}