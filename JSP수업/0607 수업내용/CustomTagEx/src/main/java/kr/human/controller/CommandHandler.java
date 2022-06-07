package kr.human.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandHandler {
	String process(HttpServletRequest request, HttpServletResponse response); // 업무를 처리하고 request/session에 저장 후 뷰페이지를 리턴하도록 구현
}
