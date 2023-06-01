package com.yedam.notice.main.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.notice.common.Command;

public class MainCommand implements Command {

	@Override
	public String exec(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		// TODO Auto-generated method stub
		//main.jsp 돌려주는 곳
		return "main/main";
	}

}
