package com.yedam.inter;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class InterDAO extends DAO{
	private static InterDAO interDao = null;
	
	private InterDAO() {
		
	}
	public static InterDAO getInstance() {
		if(interDao == null) {
			interDao = new InterDAO();
		}
		return interDao;
	}
	//전달사항 전송
	public int transMsg(Inter inter) {
		int result =0;
		try {
			conn();
			String sql = "UPDATE inter SET inter_message = ? WHERE inter_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, inter.getInterMessage());
			pstmt.setString(2, inter.getInterName());
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
		}
		return result;
		
	}
	//목록

	public Inter interList(String name) {
		Inter inter = null;
		try {
			conn();
			String sql = "SELECT inter_name FROM inter WHERE inter_name =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				inter = new Inter();
				inter.setInterName(rs.getString("inter_name"));
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
		}
		return inter;
	}
	
	
}
