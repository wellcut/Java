package com.yedam.oop;

import java.util.Scanner;

public class Application07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제2) 다음은 키보드로부터 상품 이름와 상품 가격을 입력받아서
				// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
				// 1) 메뉴는 다음과 같이 구성하세요.
				// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
				// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
				// 3) 제품별 가격을 출력하세요.
				//	출력예시, "상품명 : 가격"
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		Product[] pctAry = null;
		int pctNum = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("=======================================================");
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("=======================================================");
			int selectNo = Integer.parseInt(sc.nextLine());
			if(selectNo == 1) {
				System.out.println("상품 수>");
				pctNum = Integer.parseInt(sc.nextLine());
			}else if(selectNo == 2) {
				pctAry = new Product[pctNum];
				for(int i =0; i<pctAry.length; i++) {
					pctAry[i] = new Product();
					System.out.println("상품명>");
					pctAry[i].name=sc.nextLine();
					System.out.println("상품 가격>");
					pctAry[i].price=Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i =0; i<pctAry.length; i++) {
					pctAry[i].getInfo();
					
					System.out.println();
				}
			}else if(selectNo == 4) {
				int sum=0;
				int temp =0;
				int max=pctAry[0].price;
				for(int i =0; i<pctAry.length; i++) {
					if(max < pctAry[i].price) {
						max = pctAry[i].price;
						temp =i;
					}					
					
				}
				for(int i =0; i<pctAry.length; i++) {
					if(max != pctAry[i].price) {						
						sum +=pctAry[i].price;
					}	
										
				}
				
				System.out.println("상품명 "+pctAry[temp].name+" 최대값 "+max);
				System.out.println("최대값 제외한 총합 : "+sum);
			}else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		
		
		
		}
		
		
		
		
		
		
		
		
		
	}

}
