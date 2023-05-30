package com.yedam.store;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class StoreDAO extends DAO{
	private static StoreDAO stoDao = null;
	private StoreDAO() {
		
	}
	public static StoreDAO getInstance() {
		if(stoDao == null) {
			stoDao = new StoreDAO();
		}
		return stoDao;
	}

	public List<Store> getStoreList(){
		List<Store> list = new ArrayList<>();
		Store sto = null;
		try {
			conn();
			String sql = "SELECT * FROM store";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				sto = new Store();
				sto.setStoreId(rs.getInt("store_id"));
				sto.setStoreName(rs.getString("store_name"));
				sto.setStoreTel(rs.getString("store_tel"));
				sto.setStoreAddr(rs.getString("store_addr"));
				sto.setStoreSales(rs.getInt("store_sales"));
				list.add(sto);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	
//	store_id NUMBER PRIMARY KEY,
//	store_name VARCHAR2(100),
//	store_tel VARCHAR2(15),
//	store_addr VARCHAR2(100),
//	store_sales NUMBER);

	public List<Store> getStoreSum(){
		List<Store> list = new ArrayList<>();
		Store sto = null;
		
		try {
			conn();
			String sql = "SELECT SUBSTR(store_addr, 4, 3) AS loc, sum(store_sales) FROM store GROUP BY SUBSTR(store_addr, 4, 3) ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				sto = new Store();
				sto.setStoreAddr(rs.getString("loc"));
				sto.setStoreSales(rs.getInt("sum(store_sales)"));
				list.add(sto);	
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		
		return list;
	}
	//서브쿼리를 활용한 데이터 추가
	public int storeInfo(Store sto) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO store VALUES((SELECT COUNT(*)+1 FROM store),?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sto.getStoreName());
			pstmt.setString(2, sto.getStoreTel());
			pstmt.setString(3, sto.getStoreAddr());
			pstmt.setInt(4, sto.getStoreSales());
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
//	public int storeInfo(Store sto) {
//		int result = 0;
//		try {
//			conn();
//			String sql = "INSERT INTO store VALUES(?,?,?,?,?)";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, sto.getStoreId());
//			pstmt.setString(2, sto.getStoreName());
//			pstmt.setString(3, sto.getStoreTel());
//			pstmt.setString(4, sto.getStoreAddr());
//			pstmt.setInt(5, sto.getStoreSales());
//			result = pstmt.executeUpdate();
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}finally {
//			disconn();
//		}
//		return result;
//	}
	
	public int updateSales(Store sto) {
		int result = 0;
		
		try {
			conn();
			String sql = "UPDATE store SET store_sales = ? WEHRE store_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sto.getStoreSales());
			pstmt.setInt(2, sto.getStoreId());
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	
}
