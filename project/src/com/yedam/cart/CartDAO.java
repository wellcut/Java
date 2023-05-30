package com.yedam.cart;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;
import com.yedam.member.Member;
import com.yedam.member.MemberDAO;
import com.yedam.product.Product;
import com.yedam.product.ProductDAO;

public class CartDAO extends DAO{

	private static CartDAO cartDao = null;
	
	private CartDAO() {
		
	}
	public static CartDAO getInstance() {
		if(cartDao ==null) {
			cartDao = new CartDAO();
		}
		return cartDao;
	}
	
	//상품 구매
	
	public int pctBuy(Cart cart, String id) {
		int result = 0;
		int pctQuantity = 0;
		int pctPrice = 0;
		int memberPoint = 0;
				
		try {
			conn();
			String sql = "INSERT INTO cart (cart_id, pct_name, member_id, pct_quantity) VALUES((SELECT nvl(max(cart_id),0)+1 FROM cart), ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cart.getPctName());
			pstmt.setString(2, id);
			pstmt.setInt(3, cart.getPctQuantity());
			result = pstmt.executeUpdate();
			
			Member member = MemberDAO.getInstance().memberInfo(id); 
			memberPoint = member.getMemberPoint();
			
			List<Product> list = ProductDAO.getInstance().pctList();
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getPctName().equals(cart.getPctName())) {
					pctQuantity = list.get(i).getPctQuantity();
					pctPrice = list.get(i).getPctPrice();
					break;
				}
			}
			
			if(pctQuantity > 0 && pctQuantity >= cart.getPctQuantity()) {
				
				if(memberPoint >= pctPrice*cart.getPctQuantity()) {
					String sql3 = "UPDATE member SET pct_name = ? , member_point = member_point - ? WHERE member_id = ?";
					pstmt = conn.prepareStatement(sql3);
					pstmt.setString(1, cart.getPctName());
					pstmt.setInt(2, pctPrice*cart.getPctQuantity());
					pstmt.setString(3, id);
					result = pstmt.executeUpdate();
					
					sql3 = "UPDATE product SET pct_quantity = pct_quantity - ? WHERE pct_name= ? ";
					pstmt = conn.prepareStatement(sql3);
					pstmt.setInt(1, cart.getPctQuantity());
					pstmt.setString(2, cart.getPctName());
					result = pstmt.executeUpdate();
					System.out.println("가격 : "+pctPrice*cart.getPctQuantity()+"포인트");
					System.out.println("구매 성공");
				}else {
					System.out.println("포인트가 부족합니다");
				}				
			}else {
				System.out.println("상품 수량이 부족합니다.");
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
		}
		
		return result;
	}
	//구매 리스트
	public List<Cart> cartList(String id){
		List<Cart> list = new ArrayList<>();
		try {
			conn();
			String sql = "SELECT c.cart_id, c.pct_name, member_id, c.pct_quantity, m.member_point FROM cart c JOIN member m USING(member_id) WHERE member_id = ? ";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id );
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Cart cart = new Cart();
				cart.setCartId(rs.getInt("cart_id"));
				cart.setPctName(rs.getString("pct_name"));
				cart.setMemberId(rs.getString("member_id"));
				cart.setPctQuantity(rs.getInt("pct_quantity"));
				cart.setMember_point(rs.getInt("member_point"));
				list.add(cart);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			disconn();
		}
		
		return list;
		
	}
	
}
