package com.yedam.homeworkInter;

public class Application01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4)  아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
		//- 출력결과
//			RPGgame 실행
//			캐릭터가 위쪽으로 이동한다.
//			캐릭터가 한칸단위로 점프한다.
//			현재 모드 : HARD_MODE
//			캐릭터가 두칸단위로 점프한다.
//			캐릭터가 HIT 공격.
//			캐릭터가 아래쪽으로 이동한다.
//			현재 모드 : NORMAL_MODE
//			캐릭터가 일반 공격.
//			======================
//			ArcadeGame 실행
//			캐릭터가 앞쪽으로 이동한다.
//			캐릭터가 일반 공격
//			캐릭터가 뒤쪽으로 이동한다.
//			현재 모드 : HARD_MODE
//			캐릭터가 연속 공격.
//			캐릭터가 앞쪽으로 이동한다.
//			캐릭터가 Double HIT 공격.
			Keypad rpg = new RPGgame();
			rpg.leftUpButton();
			rpg.leftDownButton();
			rpg.changeMode();
			rpg.rightUpButton();
			rpg.rightDownButton();
			rpg.leftDownButton();
			rpg.changeMode();
			rpg.rightDownButton();
			System.out.println("========================");
			Keypad arc = new ArcadeGame();
			arc.leftUpButton();
			arc.rightUpButton();
			arc.leftDownButton();
			arc.changeMode();
			arc.rightUpButton();
			arc.leftUpButton();
			arc.rightDownButton();
			
			
	}

}
