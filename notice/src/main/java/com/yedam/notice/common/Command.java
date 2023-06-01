package com.yedam.notice.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public interface Command {
	public String exec(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
		
	
}
