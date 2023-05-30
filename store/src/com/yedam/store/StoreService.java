package com.yedam.store;

import java.util.List;
import java.util.Scanner;
public class StoreService {
	Scanner sc = new Scanner(System.in);
	public void getStoreList() {
		List<Store> list = StoreDAO.getInstance().getStoreList();
		System.out.println("===============================");
		if(list.size()==0) {
			System.out.println("입력된 정보가 없습니다");
		}else {
			for(int i =0; i<list.size(); i++) {
				
				System.out.println("가게 ID : " + list.get(i).getStoreId());
				System.out.println("가게 이름 : " + list.get(i).getStoreName());
				System.out.println("가게 전화번호 : " + list.get(i).getStoreTel());
				System.out.println("가게 주소 : " + list.get(i).getStoreAddr());
				System.out.println("가게 매출 : " + list.get(i).getStoreSales());
				System.out.println("===============================");
			}
		}
		
	}
	
	public void getStoreSum() {
		List<Store> list = StoreDAO.getInstance().getStoreSum();
		System.out.println("==========================");
		if(list.size() ==0) {
			System.out.println("입력된 정보가 없습니다");
		}else {
			for(int i =0; i<list.size(); i++) {
				System.out.println("지역구 : " + list.get(i).getStoreAddr());
				System.out.println("주소별 합계 : " + list.get(i).getStoreSales());
			}
		}
	}
	
	
	public void storeInfo() {
		Store sto = new Store();
//		System.out.println("ID 입력>");
//		sto.setStoreId(Integer.parseInt(sc.nextLine()));
		System.out.println("가게명 입력>");
		sto.setStoreName(sc.nextLine());
		System.out.println("가게 번호 입력>");
		sto.setStoreTel(sc.nextLine());
		System.out.println("가게 주소 입력");
		sto.setStoreAddr(sc.nextLine());
		System.out.println("가게 매출 입력");
		sto.setStoreSales(Integer.parseInt(sc.nextLine()));
		
		int result = StoreDAO.getInstance().storeInfo(sto);
		if(result > 0) {
			System.out.println("가게 정보 입력 성공");
		}else {
			System.out.println("가게 정보 입력 실패");
		}
	}
	
	public void updateSales() {
		Store sto = new Store();
		System.out.println("ID입력>");
		sto.setStoreId(Integer.parseInt(sc.nextLine()));
		System.out.println("매출>");
		sto.setStoreSales(Integer.parseInt(sc.nextLine()));
		
		int result = StoreDAO.getInstance().updateSales(sto);
		if(result > 0) {
			System.out.println("매출 수정 성공");
		}else {
			System.out.println("매출 수정 실패");
		}
	}
	}
	
	
	
	
	
	
	
	

