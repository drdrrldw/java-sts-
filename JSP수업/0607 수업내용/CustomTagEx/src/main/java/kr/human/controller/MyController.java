package kr.human.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.human.board.NullHandler;

@WebServlet("/")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Map<String, CommandHandler> map = new HashMap<>();
	
	@Override // 서블릿이 로드될때 명령에 대한 모든 클래스를 읽어 맵에 저장한다.  
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String path = config.getServletContext().getRealPath("config.properties");
		Properties prop = new Properties();
		try(FileInputStream fis = new FileInputStream(path)){
			prop.load(fis); // 프로퍼티 파일 읽기
			
			Iterator<Object> it = prop.keySet().iterator(); // 키 반복자 
			while(it.hasNext()) {
				String command = (String) it.next(); // 키 읽기
				String handlerClassName = prop.getProperty(command); // 값읽기
				Class handlerInstance = Class.forName(handlerClassName); // 클래스 읽기
				CommandHandler handler = (CommandHandler) handlerInstance.newInstance(); // 객체 생성
				map.put(command, handler); // 맵에 저장
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getRequestURI();
		System.out.println(command);
		System.out.println(request.getContextPath());
		if(command.indexOf(request.getContextPath())==0) {
			command = command.substring(request.getContextPath().length()+1);
		}
		System.out.println(command);
		CommandHandler handler = map.get(command);
		if(handler==null) {
			handler = new NullHandler();
		}
		String viewPage = handler.process(request, response);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/views/" + viewPage+".jsp");
		dispatcher.forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
