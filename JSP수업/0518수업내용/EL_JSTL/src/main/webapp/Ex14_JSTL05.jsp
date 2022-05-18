<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- c:redirect : 페이지 이동 --%>
	<c:redirect url="Ex14_View.jsp">	<%-- 이렇게 보내면 자동 인코딩이 된다. --%>
		<c:param name="n1" value="124" />
		<c:param name="n2" value="345" />
		<c:param name="name" value="한사람" />
	</c:redirect>
	
</body>
</html>