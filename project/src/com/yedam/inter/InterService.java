package com.yedam.inter;

import java.util.List;
import java.util.Scanner;

public class InterService {
	Scanner sc = new Scanner(System.in);
	
	public void transMsg() {
		Inter inter = new Inter();
		String name ="";
		String content ="";
		System.out.println("======전달사항 전송======");
		while(true) {	
			System.out.println("빅데이터, 클라우드, 프론트엔드, 백엔드, 정보보안");
			System.out.println("관심뷴야>");
			name=sc.nextLine();
			inter = InterDAO.getInstance().interList(name);
			if(inter !=null) {
				
				System.out.println("전달사항>");
				content = sc.nextLine();
				break;
			}else {
				System.out.println("존재하지 않는 분야 입니다");
			}
		}
		inter.setInterName(name);
		inter.setInterMessage(content);
		int result = InterDAO.getInstance().transMsg(inter);
		
		if(result > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	
	}
	
	

	
	
}
