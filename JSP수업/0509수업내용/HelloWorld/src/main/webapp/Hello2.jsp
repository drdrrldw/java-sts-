<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="helloOk2.jsp" method="post">		<%-- action속성 : 서버에서 요청을 받아줄 이름 --%>
		이름 : <input type="text" name="name"/>	<br />	<%-- 서버에서는 name 속성으로 받는다 --%>
		취미 : 
		<label><input type="checkbox" name="hobby" value="술마시기" />술마시기</label>
		<input type="checkbox" name="hobby" value="노래하기" id="hobby2"/>
		<label for="hobby2">노래하기</label>
		<label><input type="checkbox" name="hobby" value="춤추기" />춤추기</label>
		<label><input type="checkbox" name="hobby" value="잠자기" />잠자기</label>
		<br />
		성별 : <%-- radio는 value를 꼭 써야하고 name값이 같아야 한다. --%>
		<label> <input type="radio" value="남자" name="gender" checked="checked"/> 남자 </label>
		<label> <input type="radio" value="여자" name="gender" /> 여자 </label>
		<br />
		<input type="submit" value="전송하기"/>
	</form>

</body>
</html>