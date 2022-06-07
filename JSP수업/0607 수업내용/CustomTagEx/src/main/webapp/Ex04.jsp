<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="my" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<select name="select">
		<option value="banana">바나나</option>
		<option value="apple">사과</option>
		<option value="grape">포도</option>
	</select> <br /> <hr />
	
	<my:dynamicSelect name="select" banana="바나나" apple="사과" grape="포도"></my:dynamicSelect>
</body>
</html>