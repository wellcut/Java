package com.yedam.departments;

import java.util.List;
import java.util.Scanner;

public class DepartmentsService {
	Scanner sc = new Scanner(System.in);
	//전체 조회
	public void getDeptList() {
		List<Departments> list = DepartmentsDAO.getInstance().getDeptList();
		for(int i =0; i<list.size(); i++) {
			System.out.println("문서 번호 : " + list.get(i).getDepartmentId());
			System.out.println("문서 이름 : " + list.get(i).getDepartmentName());
		}
	}
	
	
	//등록
	public void insertDept() {
		System.out.println("부서등록");
		Departments dept = new Departments();
		System.out.println("부서 번호>");
		dept.setDepartmentId(Integer.parseInt(sc.nextLine()));
		System.out.println("부소 이름>");
		dept.setDepartmentName(sc.nextLine());
		
		int result = DepartmentsDAO.getInstance().insertDept(dept);
		if(result > 0) {
			System.out.println("부서 입력 성공");
		}else {
			System.out.println("부서 입력 실패");
		}
		
	}
	
	
	
	//단건 조회
	public void getDepartment() {
		System.out.println("부서 조회");
		System.out.println("부서 번호");
		int deptId = Integer.parseInt(sc.nextLine());
		
		Departments dept = DepartmentsDAO.getInstance().getDepartment(deptId);
		
		if(dept == null) {
			System.out.println("없는 부서를 조회했습니다");
		}else {
			System.out.println("부서 번호 : "  + dept.getDepartmentId());
			System.out.println("부서 이름 : "  + dept.getDepartmentName());
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
