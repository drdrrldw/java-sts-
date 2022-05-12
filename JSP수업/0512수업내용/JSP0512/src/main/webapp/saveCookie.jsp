<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키를 저장해보자</title>
</head>
<body>
	<%
		Cookie cookie1 = new Cookie("name", URLEncoder.encode("한사람", "UTF-8"));	// 한글 저장시
		Cookie cookie2 = new Cookie("age", "23");
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	%>
	
		<a href="readCookie.jsp">저장된 쿠키 보기</a>
</body>
</html>