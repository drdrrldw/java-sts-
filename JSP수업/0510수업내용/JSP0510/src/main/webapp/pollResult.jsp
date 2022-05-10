<%@page import="java.io.File"%>
<%@page import="kr.human.lunar.PollUtil"%>
<%@page import="kr.human.lunar.PollVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String file= request.getParameter("file");
if(file==null|| file.trim().length()==0){
	file="poll";
}	
String fileName = application.getRealPath("/data/"+file+".json");
// 만약에 넘어온 이름의 파일이 없다면 에러이다~
File file2 = new File(fileName);
if(!file2.exists()){	// exist() : 파일이 있으면 참 / 없으면 거짓
	file="poll";
	fileName = application.getRealPath("/data/"+file+".json");
}

PollVO pollVO = PollUtil.readPoll(fileName);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>온라인 설문조사</title>
<!-- BootStrap과 Jquery 사용 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<script type="text/javascript">
$(function () {
	$("#homeBtn").click(function() {
		location.href = 'poll.jsp?file=<%=file%>';	// 자바스크립트로 페이지 이동하기
	})
});

</script>
<style type="text/css">
table {
	margin: auto;
	width: 500px;
	border: 1px solid gray;
	padding: 5px;
	border-spacing: 5px;
}

.title {
	font-size: 14pt;
	text-align: center;
	background-color: silver;
	border: 1px solid gray;
}

td{padding: 3px; }
</style>

</head>
<body>
	
		<table>
			<tr>
				<td class="title">온라인 설문조사 Ver 0.009</td>
			</tr>
			<tr>
				<td>제목 : <%=pollVO.getTitle()%></td>
			</tr>
			<tr>
				<td align="right">총 투표수 : <%=pollVO.getTotal()%>표
				
				</td>
			</tr>
			<%
				String[] colors = "red,green,blue,purple,yellow,brown,silver".split(",");
				for(int i =0; i<pollVO.getItem().length; i++){
					out.println("<tr>");
					out.println("<td>");
				
					out.println((i+1)+". "+ pollVO.getItem()[i]);
					out.println("(" + pollVO.getItemCount()[i]+"표, " + pollVO.getPercent(i)+")");
					
					out.println("</td>");
					out.println("</tr>");
					
					// 그래프를 선으로 그리자
					out.println("<tr>");
					out.println("<td style='padding: 0px;'>");
					out.println("<hr size='25'  align='left' width='" 
								+pollVO.getPercent(i) + "' style='background-color:" + colors[i%colors.length] + "' />");				
					out.println("</td>");
					out.println("</tr>");
				}
			
			%>
			<tr>
				<td align="center">
					<input type="button" id="homeBtn" class="btn btn-sm btn-success" value="돌아가기">
				</td>
			</tr>
		</table>

	

</body>
</html>