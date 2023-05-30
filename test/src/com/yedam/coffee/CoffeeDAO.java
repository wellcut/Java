package com.yedam.coffee;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class CoffeeDAO extends DAO {
	
	private static CoffeeDAO cofDao = null;
	private CoffeeDAO() {
		
	}
	public static CoffeeDAO getInstance() {
		if(cofDao == null) {
			cofDao = new CoffeeDAO();
			
		}
		return cofDao;
	}
	
	//메뉴조회
	public List<Coffee> getCoffeeList(){
		List<Coffee> list = new ArrayList<>();
		Coffee cof = null;		
		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_price FROM coffee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				cof = new Coffee();
				cof.setCoffeeMenu(rs.getString("coffee_menu"));
				cof.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(cof);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return list;
	}
	
	//메뉴 상세 조회
	public Coffee getCoffeeExplain(String cofMenu){
		Coffee cof = null;		
		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_price, coffee_explain FROM coffee WHERE coffee_menu = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cofMenu);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				cof = new Coffee();
				cof.setCoffeeMenu(rs.getString("coffee_menu"));
				cof.setCoffeePrice(rs.getInt("coffee_price"));
				cof.setCoffeeExplain(rs.getString("coffee_explain"));
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		
		return cof;
	}
	
	
	//3. 메뉴 등록
	public int insertCof(Coffee cof) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO coffee  VALUES (?,?,?,0)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cof.getCoffeeMenu());
			pstmt.setInt(2, cof.getCoffeePrice());
			pstmt.setString(3, cof.getCoffeeExplain());
			result = pstmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return result;
	}
	
	//메뉴 삭제
	
	public int deleteCof(String cofMenu) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM coffee WHERE coffee_menu = ?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cofMenu);
			result = pstmt.executeUpdate();
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
		}
		
		
		return result;
	}
	
	//음료 판매
	public int saleCoffee(Coffee cof) {
		int result = 0;
		
		try {
			conn();
			String sql = "UPDATE coffee SET coffee_sales = coffee_sales + coffee_price  WHERE coffee_menu =? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cof.getCoffeeMenu());
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;	
	}
	
	
	//매출
	
	public List<Coffee> totalSales() {
		List<Coffee> list = new ArrayList();
		Coffee cof = null;
		try {
			conn();
			String sql = "SELECT coffee_menu, coffee_sales, coffee_price FROM coffee";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				cof = new Coffee();
				cof.setCoffeeMenu(rs.getString("coffee_menu"));
				cof.setCoffeeSales(rs.getInt("coffee_sales"));
				cof.setCoffeePrice(rs.getInt("coffee_price"));
				list.add(cof);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
}
