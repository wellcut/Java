package com.yedam.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map  = new HashMap<>();
		
		map.put(new Student(1, "도우너"), 85);
		map.put(new Student(1, "김또치"), 90);
		
		System.out.println("총 entry 수 : " + map.size());
	}

}
