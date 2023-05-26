package com.yedam.cart;

import lombok.Data;

@Data
public class Cart {
	private int cartId;
	private String memberId;
	private String pctName;
	private int pctQuantity;
	
//	CART_ID      NOT NULL VARCHAR2(20) 
//	MEMBER_ID             VARCHAR2(20) 
//	PCT_NAME              VARCHAR2(20) 
//	PCT_QUANTITY          NUMBER     
	
	private int member_point;
	private int pctPrice;
}
