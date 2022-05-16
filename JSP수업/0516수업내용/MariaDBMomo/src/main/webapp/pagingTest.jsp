<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="kr.human.memo.vo.PagingVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	// 여기서 현재페이지 번호/페이지당 글 수/ 페이지 리스트 개수를 받아야한다.
	int currentPage = 1;
	try{
		currentPage = Integer.parseInt(request.getParameter("p"));
	}catch(Exception e){
		;
	}
	
	int pageSize = 10;
	try{
		pageSize = Integer.parseInt(request.getParameter("s"));
	}catch(Exception e){
		;
	}
	
	int blockSize = 10;
	try{
		blockSize = Integer.parseInt(request.getParameter("b"));
	}catch(Exception e){
		;
	}

	
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.servletContext.contextPath }/webjars/bootstrap/5.1.3/css/bootstrap.min.css" />
<link rel="stylesheet" href="${pageContext.request.servletContext.contextPath }/webjars/bootstrap/5.1.3/js/bootstrap.min.js" />
<script type="text/javascript" src="${pageContext.request.servletContext.contextPath }/webjars/jquery/3.6.0/jquery.min.js" ></script>
</head>
<body>
	<%
		PagingVO<String> pagingVO = new PagingVO(237, currentPage, pageSize, blockSize);
	
		List<String> list = new ArrayList<>();
		for(int i = pagingVO.getStartNo(); i<=pagingVO.getEndNo(); i++) list.add("글....." + i);
		
		pagingVO.setList(list);
		
		// out.println(pagingVO + "<br>");
		out.println(pagingVO.getPageInfo()+"<br>");
		for(String content : pagingVO.getList()){
			out.println(content + "<br>");
		}
		out.println("<br>");
		out.println(pagingVO.getPageList());
		
		
		
	%>
</body>
</html>