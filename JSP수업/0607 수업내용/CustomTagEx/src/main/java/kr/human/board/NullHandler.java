package kr.human.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.human.controller.CommandHandler;

public class NullHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("message", "알수 없는 명령어 입니다.");
		return "error";
	}

}
