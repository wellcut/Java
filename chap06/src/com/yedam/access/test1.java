package com.yedam.access;

public class test1 {
	public static void main(String[] args) {
		int[] coinUnit = {500,100,50,10};
		int money = 2680;
		int count;
		System.out.println("money=" + money);
		for(int i =0; i < coinUnit.length; i++) {
			count = money/coinUnit[i];
			money = money%coinUnit[i];
			
			System.out.printf(coinUnit[i]+"원 : " + count+"개 ");
		
		}
	}
}
