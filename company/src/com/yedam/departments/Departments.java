package com.yedam.departments;

public class Departments {
//	DEPARTMENT_ID   NOT NULL NUMBER(4)    
//	DEPARTMENT_NAME NOT NULL VARCHAR2(30) 

	private int departmentId;
	private String departmentName;

	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Departments [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	
	
	
	
	
	
	
	
}
