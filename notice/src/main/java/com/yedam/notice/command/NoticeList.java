package com.yedam.notice.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.notice.common.Command;
import com.yedam.notice.service.NoticeService;
import com.yedam.notice.service.NoticeVO;
import com.yedam.notice.service.Impl.NoticeServiceImpl;



public class NoticeList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		//게시글 목록가져 오기
		NoticeService ns = new NoticeServiceImpl(); //모델을 생성 호츌
		List<NoticeVO> notices = new ArrayList<>(); //결과를 담을 것
		notices = ns.noticeSelectList();
								
							 //변수명    ,     값
		request.setAttribute("notices", notices); //JSP에 보내기 위해 결과 객체를 답는다
		
		//request 객체에 담은 결과를 views 폴더밑에 notice 폴더밑에 noticeList.jsp로 보내달라
		return "notice/noticeList";
	}

}
