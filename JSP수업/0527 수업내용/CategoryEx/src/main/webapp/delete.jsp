<%@page import="kr.human.category.service.CategoryService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:requestEncoding value="UTF-8"/>
	<%-- 데이터를 받자 --%>
	<jsp:useBean id="vo" class="kr.human.category.vo.CategoryVO"/>
	<jsp:setProperty property="*" name="vo"/>
	<%
		// 서비스 클래스를 호출하여 삭제를 한다.
		CategoryService.getInstance().delete(vo);
		
		// 리스트로 이동한다.
		response.sendRedirect("index.jsp");
		
	
	%>
	
	
</body>
</html>