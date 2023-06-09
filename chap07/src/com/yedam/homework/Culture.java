package com.yedam.homework;

public abstract class Culture {
//	1) Culture 클래스를 정의한다.
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//(2) public String getGrade() : 평점을 구하는 기능
//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
//
	String title;
	int directorNo;
	int actorNo;
	int attendNo;
	int totalScore;
	Culture(){
		
	}
	Culture(String title, int directorNo, int actorNo){
		this.title = title;
		this.directorNo = directorNo;
		this.actorNo = actorNo;
	}
	 public void setTotalScore(int score) {
		 
		 while(score != attendNo) {
			 ++attendNo;
			 totalScore = score + attendNo ;
		 }
		 System.out.println("영화 총점 : "+totalScore);
	 }
	 String result="";
	 public String getGrade() {
		if(totalScore > 20) {
			result = "☆☆☆☆☆";
		}else if(totalScore > 15) {
			result = "☆☆☆☆";
		}else if(totalScore >10) {
			result = "☆☆☆";
		}else if(totalScore >5){
			result = "☆☆";
		}else {
			result = "☆";
		}
		
		System.out.println("영화평점 : " + result);
		return result;
		
		 
	 }
	 public abstract void getInformation();

}

