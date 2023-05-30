package com.yedam.cart;

import java.util.List;
import java.util.Scanner;

import com.yedam.member.MemberService;
import com.yedam.product.Product;
import com.yedam.product.ProductDAO;

public class CartService {
	Scanner sc = new Scanner(System.in);
	Cart cart = new Cart();
	public void pctBuy() {
		List<Product> pctList = ProductDAO.getInstance().pctList();
		boolean run = true;
		while(run) {
			System.out.println("======상품 구매======");
			System.out.println("구매할 상품명>");
			String buy = sc.nextLine();
			boolean isContain = false;
			
			for(int i = 0; i<pctList.size(); i++) {
				if(pctList.get(i).getPctName().equals(buy)) {					
					cart.setPctName(buy);
					System.out.println("구매할 수량");
					cart.setPctQuantity(Integer.parseInt(sc.nextLine()));				
					String id = MemberService.memberInfo.getMemberId();
					int result = CartDAO.getInstance().pctBuy(cart, id);
					
					if(result > 0) {
						isContain = true;
					}else {
						System.out.println(" 실패");
					}
					run = false;				
					break;
				}
			}
			if(isContain == false) {
				System.out.println("상품이 없다");
			}
		}
	}

	public void cartList() {
		String id = MemberService.memberInfo.getMemberId();
		List<Cart> list = CartDAO.getInstance().cartList(id);
		System.out.println("=======상품 구매한 리스트========");
		for(Cart cart : list) {
			System.out.println("==========================");
			System.out.println("상품명: " + cart.getPctName());
			System.out.println("ID: " + cart.getMemberId());
			System.out.println("구매 수량 : " + cart.getPctQuantity());
			System.out.println("포인트 : " + cart.getMember_point());
			System.out.println("==========================");
		}
		
		
	}


}

