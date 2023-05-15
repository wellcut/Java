package com.yedam.homework;

public class ObesityInfo extends StandardWeightInfo {

	//3) ObesityInfo 클래스를 정의한다.
	//- StandardWeightInfo 클래스를 상속한다.
	//- 메소드는 다음과 같이 정의한다.
	//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
	//(2) public double getObesity() : 비만도를 구하는 기능
	//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )
	//(BMI가 18.5 이하면 저체중 ／ 18.5 ~ 22.9 사이면 정상 ／ 23.0 ~ 24.9 사이면 과체중 ／ 25.0 이상부터는 비만으로 판정.)
	//
	ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	public void getInformation() {
		System.out.println("이름 : " + name + " 키 : " + height + "몸무게 : " + weight + "비만도 : " + (weight-super.getStandardWeight())/super.getStandardWeight()*100);
	}
	
	public double getObesity() {
		if((weight-super.getStandardWeight())/super.getStandardWeight()*100>=25.0) {
			return 1;
		}else if((weight-super.getStandardWeight())/super.getStandardWeight()*100>=23.0){
			return 2;
		}else if((weight-super.getStandardWeight())/super.getStandardWeight()*100>=18.5){
			return 3;
		}else {
			System.out.println("저체중");
			return 4;
		}
		
	}

}
