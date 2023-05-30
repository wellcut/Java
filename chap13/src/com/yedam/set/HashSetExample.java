package com.yedam.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBatis");
		
		//size
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		//반복자를 활용한 HashSet객체 출력
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("java");
		set.remove("JDBC");
		
		System.out.println("=========향상된 for문=======");
		
		for(String temp : set ) {
			System.out.println("\t" + temp);
		}
		
		set.clear();
		System.out.println("총 객체 수 : " + set.size());
		
		if(set.isEmpty()) {
			System.out.println("객체가 없습니다");
		}
		
		Set<Member> mSet = new HashSet<Member>();
		mSet.add(new Member("고길동", 20));
		mSet.add(new Member("고길동", 20));
		
		System.out.println("총 객체 수 : " + mSet.size());
		
		
		
		
		
		
		
		
		
		
	}

}
