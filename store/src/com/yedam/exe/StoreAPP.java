package com.yedam.exe;

import java.util.Scanner;

import com.yedam.store.StoreService;

public class StoreAPP {
	//모든 가게 정보 조회
	//지역구별 매출 합계 조회 -> 대구
	//가게 정보 입력/ 매출 수정
	Scanner sc = new Scanner(System.in);
	boolean run=true;
	private String num = null;
	StoreService ss = new StoreService();
	public StoreAPP() {
		start();
	}
	
//	private void num() {
//		System.out.println("1. 모든 가게 정보 조회 | 2. 지역별 매출 합계 | 3. 가게 정보 입력 | 4. 매출 수정 | 5.종료");
//		System.out.println("입력>");
//		 num = sc.nextLine();
//	}

	private void start() {
		while(run) {
			System.out.println("1. 모든 가게 정보 조회 | 2. 지역별 매출 합계 | 3. 가게 정보 입력 | 4. 매출 수정 | 5.종료");
			System.out.println("입력>");
			 num = sc.nextLine();
			switch(num) {
			case "1":
				ss.getStoreList();
				break;
			case "2":
				ss.getStoreSum();
				break;
			case "3":
				ss.storeInfo();
				break;
			case "4":
				ss.updateSales();
				break;
			case "5":
				run=false;
				break;
			}
		}
	}



}
