package com.yedam.array;

import java.io.IOException;
import java.util.Arrays;

public class Array03 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//2차원 배열
		//계단식 배열
		int[][] intAry = {{1,2},{1,2,3}};
		//intAry[0] ->1,2
		//intAry[1] ->1,2,3
		
		int[][] mathScore = new int[2][3];
		System.out.println("mathScore.length : " + mathScore.length);
		for(int i =0; i<mathScore.length; i++) {
			for(int j=0; j<mathScore[i].length; j++) {
				System.out.print("mathScore["+i+"]["+j+"] = " + mathScore[i][j]+"\t");
			}
			System.out.println();
		}
		//이차원 배열 -> 구구단 저장
		//2단,3단,4단, ,,,9단 =>8개
		//1,2,3,4,..9=>9개
		//{{2단},{3단},,,{9단}}
		
		int[][] gugu = new int[8][9];
		
		//단수를 의미 for문 1단 2단
		for(int i =2; i<10; i++) {
			//곱셈구간
			for(int j=1; j<10; j++) {
				gugu[i-2][j-1]=i*j;
			}
		}
		for(int i =0; i<gugu.length; i++) {
			System.out.print((i+2) + "단 : ");
			//배열.toString() : 배열의 정보를 출력하는 메소드
			System.out.println(Arrays.toString(gugu[i]));
		}
		System.out.println();
		
		
		//배열을 다룰 떄 많이 나는 오류
		//배열의 범위를 벗어나는 인덱스 사용
		
		int[] intAry2= {1,2,3,4};
		System.out.println(intAry2[3]);
		
		//참조 타입 배열
		String[] strAry = new String[3];
		strAry[0] = "yedam";
		strAry[1] = "yedam";
		strAry[2] =new String("yedam");
		
		//String 배열간의 주소값 비교
		System.out.println(strAry[0] == strAry[1]);
		System.out.println(strAry[0] == strAry[2]);
		System.out.println(strAry[0].equals(strAry[2]));
		
  
         
          //배열 복사
          int[] oldAry = {1,2,3};
          int[] newAry = new int[5];
          for(int i =0; i<oldAry.length; i++) {
        	  newAry[i]=oldAry[i];
          }

          for(int i =0; i<newAry.length; i++) {
        	  System.out.println(newAry[i]);
          }
          //arrayCopy
          System.out.println();
          
          int[] oldAry2 = {1,2,3,4,5,6,7};
          int[] newAry2 = new int[10];
          System.arraycopy(oldAry2, 1, newAry2, 1, oldAry2.length-1);
		

          for(int i =0; i<newAry2.length; i++) {
        	  System.out.println(newAry2[i]);
          }
		
          //향상된 for문
          System.out.println();
          for(int temp : newAry2) {
        	  System.out.print(temp + "\t");
          }
		
		
		
		
	}

}
