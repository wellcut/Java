package com.yedam.product;

import lombok.Data;

@Data
public class Product {
//	PCT_NAME    NOT NULL VARCHAR2(20)   
//	PCT_PRICE            NUMBER         
//	PCT_EXPLAIN          VARCHAR2(1000) 
	
	private String pctName;
	private int pctPrice;
	private String pctExplain;
	private int pctQuantity;
	
	
	
}
