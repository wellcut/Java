package com.yedam.reference;

public class Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조 : 배열
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3= null;

		System.out.println(array);
		System.out.println(array2);
		System.out.println(array3);
		System.out.println(array3==null);
		System.out.println(array==array2);
		if( array3 == null) {
			//null인경우
		}else {
			//null이 아닌 경우
		}
		
		
	}

}
