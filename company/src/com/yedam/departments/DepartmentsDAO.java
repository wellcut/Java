package com.yedam.departments;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class DepartmentsDAO extends DAO{
	
	//싱글톤 -> DB접속
	private static DepartmentsDAO deptDao = null;
	
	private DepartmentsDAO() {
		
	}
	
	public static DepartmentsDAO getInstance() {
		if(deptDao ==null) {
			deptDao = new DepartmentsDAO();
		}
		return deptDao;
	}
	
	//부서 조회
	public List<Departments> getDeptList(){
		List<Departments> list = new ArrayList<>();
		Departments dept = null;
		try {
			conn();
			String sql = "SELECT * FROM departments";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dept = new Departments();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				list.add(dept);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	
	//2. 부서조회
	public Departments getDepartment(int deptId) {
		Departments dept = null;
		
		
		try{
			conn();
			String sql = "SELECT * FROM departments WHERE department_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptId);
			
			rs= pstmt.executeQuery();
			if(rs.next()) {
				dept = new Departments();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return dept;
			
		
	}
	//등록
	public int insertDept(Departments dept) {
		int result =0;
		try {
			conn();
			String sql = "INSER INTO departments (department_id, department_name) values(?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDepartmentId());
			pstmt.setString(2, dept.getDepartmentName());
			result = pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
		
	}
	
	
	
	
	
	
	
	
		
}
