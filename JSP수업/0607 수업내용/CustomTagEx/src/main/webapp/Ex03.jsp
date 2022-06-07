<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<my:header2>
		<jsp:attribute name="title">하하하하 나는 제목일걸!!!!</jsp:attribute>
		<jsp:attribute name="subject">크크크크크크크 나는 제목일걸!!!!</jsp:attribute>
		<%-- 몸체에는 표현식 사용 못함 --%>
	</my:header2>
</body>
</html>