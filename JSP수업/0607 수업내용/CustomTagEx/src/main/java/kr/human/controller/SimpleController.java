package kr.human.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/simple")
public class SimpleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Get요청이 들어오면 처리할 내용
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// GET/POST 모두 처리할 내용 
		// 1. 요청사항을 받는다.
		String cmd = request.getParameter("cmd");
		if(cmd==null || cmd.trim().length()==0) {
			cmd = "";
		}
		// 2. 요청사항에 따라 원하는 작업을 수행하고 보여줄 페이지를 지정한다.
		String viewPage = "";
		switch (cmd) {
		case "today":
			request.setAttribute("today", new Date().toLocaleString());
			viewPage = "today";
			break;
		case "hello":
			request.setAttribute("message", "반갑습니다. 환영합니다.");
			viewPage = "message";
			break;
		case "list":
			// 서비스 클래스를 호출하여 결과를 받고 결과를 영역에 저장하고 list.jsp로 보낸다.
			request.setAttribute("pv", "리스트라고 가장하자~~~");
			viewPage = "list";
			break;

		default:
			request.setAttribute("message", "알수 없는 명령입니다.");
			viewPage = "error";
			break;
		}
		// 3. 원하는 뷰페이지로 포워딩한다.
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/" + viewPage+".jsp");
		dispatcher.forward(request, response);
	}
	// POST요청이 들어오면 처리할 내용
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response); // doGet을 호출하면 코드를 1곳에만 써도 된다.
	}

}
