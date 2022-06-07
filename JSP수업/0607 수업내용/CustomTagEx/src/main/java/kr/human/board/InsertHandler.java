package kr.human.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.human.controller.CommandHandler;

public class InsertHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		// 서비스 클래스를 호출해서 request/session에 저장하고 뷰페이지를 리턴한다.
		request.setAttribute("message", "게시판 글쓰기 입니다.");
		return "boardInsert";
	}

}
