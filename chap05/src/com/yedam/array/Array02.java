package com.yedam.array;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
//		int[] intAry = new int[10];
//		System.out.println("intAry의 길이 : " + intAry.length);
//		
//		for( int i =0; i<10; i++) {
//			System.out.println(intAry[i]);
//		}
//		
//		for( int i =0; i<intAry.length; i++) {
//			System.out.println(intAry[i]);
//		}
//		
		Scanner sc = new Scanner(System.in);
		
//		//배열
//		int[] ary;
//		//베열의 크기
//		int no;
//		
//		System.out.println("배열의 크기>");
//		no = Integer.parseInt(sc.nextLine());
//		
//		ary = new int[no];
//		System.out.println(ary.length);
//		
//		//데이터 입력
//		for(int i =0; i<ary.length; i++) {
//			System.out.println("입력>");
//			int data = Integer.parseInt(sc.nextLine());
//			ary[i] = data;
//			
//		}
//		for(int i =0; i<ary.length; i++) {
//			System.out.println(ary[i]);
//		}
		
		//국영수의 데이터를 담는 배열
		int[] point = new int[3];
		//[0]:국어, [1]:영서, [2]:수학
		
		System.out.println("국어 점수>");
		point[0] = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수>");
		point[1] = Integer.parseInt(sc.nextLine());		
		System.out.println("수학 점수>");
		point[2] = Integer.parseInt(sc.nextLine());
		
		//1)점수의 총 합계
		int sum =0;
		for(int i =0; i<point.length; i++) {
			sum = sum + point[i];
		}
		System.out.println("총 합계 : "+sum);
				
		//2)평균
		
		double avg= (double)sum/point.length;
		System.out.println("평균 : " + avg);
		
		//입력받은 데이터의 갯구의 총합, 평균, 최대, 최소
		int[] intAry2;
		
		System.out.println("데이터 갯수>");
		//배열의 크기
		int num= Integer.parseInt(sc.nextLine());
		
		intAry2 = new int[num];
		
		for(int i =0; i<intAry2.length; i++) {
			System.out.println((i+1) + "번째>");
			intAry2[i] = Integer.parseInt(sc.nextLine());
		}
		sum=0;
		avg=0;
		int max=intAry2[0];
		int min =intAry2[0];
		for(int i =0; i<intAry2.length; i++) {
			System.out.println(intAry2[i]);
			sum += intAry2[i]; //sum = sum + intAry2[i]
			if(max<intAry2[i]) {
				max = intAry2[i];
			}
			if(min>intAry2[i]) {
				min = intAry2[i];
			}
		}
		System.out.println("총합계 : " + sum);
		System.out.println("최대 : " + max);
		System.out.println("최소 : " + min);
		System.out.println("평균 : " + (double)sum/intAry2.length);
		
		
		
		
		
		
	}

}
