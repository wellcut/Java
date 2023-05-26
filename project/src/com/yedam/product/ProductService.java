package com.yedam.product;

import java.util.List;
import java.util.Scanner;

public class ProductService {
	//상품 등록
	Scanner sc = new Scanner(System.in);
	public void pctInsert() {
		Product pct = new Product();
		System.out.println("=======상품 등록========");
		
		System.out.println("상품명>");
		pct.setPctName(sc.nextLine());
		
		System.out.println("상품 가격>");
		pct.setPctPrice(Integer.parseInt(sc.nextLine()));
		
		System.out.println("상품 설명>");
		pct.setPctExplain(sc.nextLine());
		
		System.out.println("상품 수량>");
		pct.setPctQuantity(Integer.parseInt(sc.nextLine()));
		
		int result = ProductDAO.getInstance().pctInsert(pct);
		
		if(result > 0) {
			System.out.println("상품 등록 성공");		
		}else {
			System.out.println("상품 등록 실패");
		}
	}
	
	//상품 수정
	public void pctModify() {
		Product pct = new Product();
		System.out.println("======상품 수정======");
		System.out.println("수정 삭제할 상품명>");
		pct.setPctName(sc.nextLine());
		System.out.println("1. 상품 가격 | 2. 상품 설명 | 3.상품 수량 | 4.상품 삭제");
		int no = Integer.parseInt(sc.nextLine());
		
		if(no == 1) {
			System.out.println("상품 가격>");
			pct.setPctPrice(Integer.parseInt(sc.nextLine()));			
		}else if(no ==2 ) {
			System.out.println("상품 설명>");
			pct.setPctExplain(sc.nextLine());
		}else if(no == 3) {
			System.out.println("상품 수량>");
			pct.setPctQuantity(Integer.parseInt(sc.nextLine()));
		}else if(no == 4) {
			System.out.println("삭제할 상품명>");
			System.out.println(pct.getPctName());
			
		}else {
			System.out.println("번호를 다시 입력하세요");
		}
		int result = ProductDAO.getInstance().pctModify(pct, no);
		if(result > 0) {
			System.out.println("상품 수정 성공");		
		}else {
			System.out.println("상품 수정 실패");
		}
		
	}
	
	
	public void pctList() {
		System.out.println("=======상품 리스트=======");
		List<Product> list = ProductDAO.getInstance().pctList();
		for(Product pct : list) {
			System.out.println("상품명 : " + pct.getPctName());
			System.out.println("상품 가격 : " + pct.getPctPrice());
			System.out.println("상품 설명 : " + pct.getPctExplain());
			System.out.println("상품 수량 : " + pct.getPctQuantity());
			System.out.println("======================");
		}
		
	}
	
	
	
	
	
	
	
}
