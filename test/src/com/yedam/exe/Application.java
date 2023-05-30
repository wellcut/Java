package com.yedam.exe;

import java.util.Scanner;

import com.yedam.coffee.CoffeeService;

public class Application {
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	CoffeeService cs = new CoffeeService();
	public Application() {
		start();
	}
	private void start() {
		while(run) {
			menu();
			String selectNo = sc.nextLine();
			switch(selectNo) {
			case "1":
				cs.getCoffeeList();
				break;
			case "2":
				cs.getCoffeeExplain();
				break;
			case "3":
				cs.insertCof();
				break;
			case "4":
				cs.saleCoffee();
				break;
			case "5":
				cs.deleteCof();
				break;
			case "6":
				cs.totalSales();
				break;
			case "7":
				run = false;
				System.out.println("end of prog");
				break;
				
			}
		}
		
	}
	
	private void menu() {
		System.out.println("1. 메뉴 조회 | 2. 메뉴 상세 조회 | 3. 메뉴 등록 | 4.판매 |5. 메뉴삭제 |6. 매출 | 7.종료");
		System.out.println("메뉴 입력>");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
