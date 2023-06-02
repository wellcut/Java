package com.yedam.notice.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.notice.common.Command;
import com.yedam.notice.member.service.MemberService;
import com.yedam.notice.member.service.MemberVO;
import com.yedam.notice.member.serviceImpl.MemberServiceImpl;

public class MemberList implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberService ms = new MemberServiceImpl();
		List<MemberVO> members = new ArrayList<>();
		members = ms.memberSelectList();
		
		request.setAttribute("members", members);
		return "member/memberList";
	}

}
