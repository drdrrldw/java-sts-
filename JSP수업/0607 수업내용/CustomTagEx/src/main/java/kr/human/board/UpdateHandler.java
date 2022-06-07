package kr.human.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.human.controller.CommandHandler;

public class UpdateHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		// 요청정보 받기
		String t = request.getParameter("idx");
		// 유효성 검사
		int idx = 0;
		try {
			idx = Integer.parseInt(t);
		}catch (Exception e) {
			;
		}
		// 서비스 클래스를 호출하여 해당 글번호의 글을 가져온다.
		// 영역에 저장한다.
		request.setAttribute("vo", "VO가 있다고 가정!!!");
		return "boardUpdate";
	}

}
