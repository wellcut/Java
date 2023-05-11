package com.yedam.oop;

public class Application03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer compute = new Computer();
		
		//1)배열을 활용
		int[] values1 = {1,2,3};
		int result1 = compute.sum1(values1);
		System.out.println(result1);
		
		result1 = compute.sum1(new int[10]);
		System.out.println(result1);
		
		result1 = compute.sum1(new int[] {1,2,3,4});
		System.out.println(result1);
		//2) 목록을 넘겨주는 방식
		
		int result2 = compute.sum2(1,2,3);
		System.out.println(result2);
		
		int result3 = compute.sum2(1,2,3,4,5);
		System.out.println(result3);
		
		Calculator cal = new Calculator();
		double sum = cal.avg(7, 10);
		System.out.println(sum);
		//클래스 내부에서 메소드 호출
		cal.excute();
		
		double result4 = cal.areaRectangle(10.5);
		System.out.println(result4);
		
		double result5 = cal.areaRectangle(20.4,10.2);
		System.out.println(result5);
	}

}
