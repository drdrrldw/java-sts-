<!-- %@ 로 시작하면 디렉티브라고 하고 환경을 설정할때 사용합니다.  -->
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<title>Document</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		// alert('hello World!!!');
	});
	/*
	window.onload = function() {
		alert('하하하하');
	}
	*/
</script>
	<!-- %!로 시작하면 선언문이라 한다. 메서드 선언시 사용합니다. -->
	<%!
		public String now(){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일(E 요일)");
			return sdf.format(new Date());
		}
		
	%>


</head>
<body>
	<!-- %=으로 시작하면 표현식이라고 하고 무언가를 출력할때 사용  -->
	<!-- 실행시간 : <%= new Date() %> -->
	<%-- 나는 JSP주석입니다. 소스보기할때 보이지 않아여 new Date() 같은 명령은 실행되지 않아여 --%>
	
	<h1>현재 시간 : <%=new Date().toLocaleString() %></h1>
	<h1>현재 시간 : <%=LocalDateTime.now() %></h1>
	<hr />
	<h2><%="안녕 JSP" %></h2>
	<hr />
	<!-- %로 시작하면 스크립트릿이라고 하고 자바 코드를 적는다. -->
	<%
		for(int i = 2; i<=9; i++){
			for(int j=1; j<=9; j++){
				out.println(i + "x" + j + " = " + (i*j) + "<br/>");
			}
			out.println("<br/>");
		}
	%>
	
</body>
</html>