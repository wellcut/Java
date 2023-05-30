package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	Scanner sc = new Scanner(System.in);
	//메뉴조회
	public void getCoffeeList() {
		List<Coffee> list = CoffeeDAO.getInstance().getCoffeeList();
		
		for(int i =0; i<list.size(); i++) {
			System.out.println("메뉴 : " + list.get(i).getCoffeeMenu() + " 가격 : " + list.get(i).getCoffeePrice() );
			
		}			
	}
	
	//상세조회
	public void getCoffeeExplain() {
		System.out.println("메뉴 입력>");
		String cofMenu = sc.nextLine();
		Coffee cof = CoffeeDAO.getInstance().getCoffeeExplain(cofMenu);	
		if(cof !=null) {
		System.out.println("메뉴 : " + cof.getCoffeeMenu() + " 가격 : " + cof.getCoffeePrice()
							+ " 설명 : " + cof.getCoffeeExplain());
		}else {
			System.out.println("조회도는 정보가 없습니다");
		}
			
	}
	//메뉴 등록
	public void insertCof() {
		Coffee cof = new Coffee();
		System.out.println("메뉴 입력>");
		cof.setCoffeeMenu(sc.nextLine());
		
		System.out.println("가격 입력");
		cof.setCoffeePrice(Integer.parseInt(sc.nextLine()));
		
		System.out.println("설명 입력");
		cof.setCoffeeExplain(sc.nextLine());
		
		int result = CoffeeDAO.getInstance().insertCof(cof);
		if(result >0) {
			System.out.println("메뉴 등록 성공");
		}else {
			System.out.println("메뉴 등록 실패");
		}
	}
	//메뉴 삭제
	public void deleteCof() {
		System.out.println("메뉴 입력>");
		String cofMenu = sc.nextLine();
		
		int result = CoffeeDAO.getInstance().deleteCof(cofMenu);
		if(result > 0) {
			System.out.println("메뉴 삭제 성공");
		}else {
			System.out.println("메뉴 삭제 실패");
		}
	}
	
	//메뉴 판매
	public void saleCoffee() {
		Coffee cof = new Coffee();
		System.out.println("메뉴 입력>");
		cof.setCoffeeMenu(sc.nextLine());
		
		int result = CoffeeDAO.getInstance().saleCoffee(cof);
		if(result > 0) {
			System.out.println("판매 완료");
		}else {
			System.out.println("판매 실패");
		}
	}
	
	//매출
	public void totalSales() {
		Coffee cof = new Coffee();
		int j = 0;
		List<Coffee> list = CoffeeDAO.getInstance().totalSales();
		for(int i =0; i<list.size(); i++) {
			j += list.get(i).getCoffeeSales();
			System.out.println("메뉴 : " + list.get(i).getCoffeeMenu() + 
					"판매개수 : " + (list.get(i).getCoffeeSales())/(list.get(i).getCoffeePrice())
					+ "판매금액 : " + list.get(i).getCoffeeSales() );
		}
		System.out.println("총 판매 금액 : " + j);
	
	
	}
	
	
}
