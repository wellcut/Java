package com.yedam.operator;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -5;
		int y = 10;
		int result;
		
		//1-1
		result = -x;
		System.out.printf("x : %d, result : %d\n",x,result);
		//1-2
		result = ++x + y--;
		System.out.printf("x : %d, y : %d, result : %d\n",++x, --y, result);
		//1-3
		result = --x + ++y;
		System.out.printf("x : %d, y : %d, result : %d\n",x, y, result);
		
		//2
		int m =10;
		int n =5;
		
		System.out.println((m*2 != n*4) || (n<5));
		System.out.println((m/2 >= 5) && (n%2 <= 1));
		
		//3
		int val =0;
		val += 10;
		val -= 5;
		val *= 3;
		val /= 5;
		
		//4
		int val2 =0;
		int intResult = (val >0 ) ? val : val2; 
		System.out.println(intResult);
		
		//5
		int a = 10;
		int b = -8;
		String strResult = (a*b >= 0) ? "both a and b are zero or more" : "One of a or b is negative number";
		System.out.println(strResult);
		
		
		
		
		
	}

}
