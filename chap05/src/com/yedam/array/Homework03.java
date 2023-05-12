package com.yedam.array;

import java.util.Arrays;
import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {10,20,30,50,3,60,-3};
		//1
		for(int i =0; i<arr1.length; i++) {
			if(arr1[i]==60) {
				System.out.println("60의 인덱스 값: "+i);
			}
		}
		
		//2
		for(int i =0; i<arr1.length; i++) {
			if(i!=3) {
				System.out.println(arr1[i]);
			}
		}
		//3
		System.out.println("입력>");
		Scanner sc = new Scanner(System.in);
		int idx = Integer.parseInt(sc.nextLine());
		for(int i =0; i<arr1.length; i++) {
			arr1[idx] =1000;
			System.out.println(arr1[i]);
		}
		System.out.println();
		//4
		int[] num = new int[10];
		for(int i =0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(num));			
		for(int i =0; i<num.length; i++) {
			if(num[i]%3==0) {
				System.out.print(num[i]+" ");
				}
		}
			
//		int[] submit = new int[30];
//		for(int i=0; i<28; i++) {
//			System.out.println("제출한 학생의 출석번호 입력>");
//			int student = Integer.parseInt(sc.nextLine());
//			submit[student-1] = 1;
//		}
//		for(int i=0; i<submit.length; i++) {
//			if(submit[i] == 0) {
//				System.out.print("제출하지 않은 학생의 출석번호>" + (i+1));
//			}
//		}
		System.out.println();
//		
		int[] studentNo = new int[28];

		for(int i =0; i<studentNo.length; i++) {
			studentNo[i] = (int)(Math.random()*30)+1;
			for(int j =0; j<i; j++) {
				if(studentNo[i]==studentNo[j]) {
					i--;
					break;
				}
			}
		}
			Arrays.sort(studentNo);
			System.out.println(Arrays.toString(studentNo));
			int[] no = new int[30];
		for(int i =0; i<studentNo.length; i++) {
			no[studentNo[i]-1]=no[studentNo[i]-1]+1;
			  if(no[i]==0) {
			  System.out.println(i+1); }
		}

		
		
	}

}
