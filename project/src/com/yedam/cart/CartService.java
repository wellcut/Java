package com.yedam.cart;

import java.util.List;
import java.util.Scanner;

import com.yedam.member.MemberService;

public class CartService {
	Scanner sc = new Scanner(System.in);
	Cart cart = new Cart();
	public void pctBuy() {
		System.out.println("======상품 구매======");
		System.out.println("구매할 상품명>");
		cart.setPctName(sc.nextLine());
		String id = MemberService.memberInfo.getMemberId();
		System.out.println("구매할 수량");
		cart.setPctQuantity(Integer.parseInt(sc.nextLine()));
		
		
		
		int result = CartDAO.getInstance().pctBuy(cart, id);
		
		if(result > 0) {
			System.out.println(" 성공");
		}else {
			System.out.println(" 실패");
		}
	}

	public void cartList() {
		String id = MemberService.memberInfo.getMemberId();
		List<Cart> list = CartDAO.getInstance().cartList(id);
		System.out.println("=======상품 구매한 리스트========");
		for(Cart cart : list) {
			System.out.println("==========================");
			System.out.println("카드번호: " + cart.getCartId());
			System.out.println("상품명: " + cart.getPctName());
			System.out.println("ID: " + cart.getMemberId());
			System.out.println("구매 수량 : " + cart.getPctQuantity());
			System.out.println("포인트 : " + cart.getMember_point());
			System.out.println("==========================");
		}
		
		List<Cart> result = CartDAO.getInstance().cartList(id);
	}


}

