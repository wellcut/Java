package com.yedam.product;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class ProductDAO extends DAO {
	private static ProductDAO pctDao = null;
	
	private ProductDAO() {
		
	}
	public static ProductDAO getInstance() {
		if(pctDao == null) {
			pctDao = new ProductDAO();
		}
		return pctDao;
	}
	
	//상품 등록
	public int pctInsert(Product pct) {
		int result = 0;
		
		try {
			conn();
			String sql = "INSERT INTO product VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pct.getPctName());
			pstmt.setInt(2, pct.getPctPrice());
			pstmt.setString(3, pct.getPctExplain());
			pstmt.setInt(4, pct.getPctQuantity());
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
			
		}
		
		return result;
		
		
	}
	
	//상품 수정
	public int pctModify(Product pct, int no) {
		int result = 0;
		String sql = null;
		try {
			conn();
			
			if( no ==1) {
				sql = "UPDATE product SET pct_price =? where pct_name =?  ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, pct.getPctPrice());
				pstmt.setString(2, pct.getPctName());
				result = pstmt.executeUpdate();
			}else if(no == 2) {
				sql = "UPDATE product SET pct_explain = ? where pct_name =?  ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, pct.getPctExplain());
				pstmt.setString(2, pct.getPctName());
				result = pstmt.executeUpdate();
			}else if(no == 3) {
				sql = "UPDATE product SET pct_quantity =? where pct_name =?  ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, pct.getPctQuantity());
				pstmt.setString(2, pct.getPctName());
				result = pstmt.executeUpdate();
			}else if( no == 4) {
				sql = "DLETE FROM product WHERE pct_name = ? ";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, pct.getPctName());
				result = pstmt.executeUpdate();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
	//상품 리스트
	public List<Product> pctList(){
		List<Product> list = new ArrayList<>();
		
		try {
			conn();
			String sql ="SELECT * FROM product";
			pstmt= conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Product pct = new Product();
				pct.setPctName(rs.getString("pct_name"));
				pct.setPctPrice(rs.getInt("pct_price"));
				pct.setPctExplain(rs.getString("pct_explain"));
				pct.setPctQuantity(rs.getInt("pct_quantity"));
				list.add(pct);
				
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
