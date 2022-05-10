<%@page import="org.jsoup.nodes.Element"%>
<%@page import="org.jsoup.select.Elements"%>
<%@page import="org.jsoup.Jsoup"%>
<%@page import="org.jsoup.nodes.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HTML 파싱하기</title>
</head>
<body>
	<%
		String urlAddress="https://astro.kasi.re.kr/life/pageView/5";
		// 문서 객체 얻기
		Document document = Jsoup.connect(urlAddress).get();
		// html의 title 태그의 값을 가져온다.
		out.println(document.title());
		
		//
		out.println("<br>");
		
		Elements elements = document.select("table");
		out.println("테이블 개수 : " + elements.size() + "개");
		
		/*
		// 찾은 요소의 모든 내용 얻기
		out.println("<table border='1'>");
		out.println(elements.get(0).html());
		out.println("</table>");
		*/
		
		// 테이블 안에 있는 tbody태그 밑에 tr들을 얻기
		out.println("<br>");
		Elements trs = elements.select("tbody tr");
		out.println("TR 개수(일수) : " + trs.size() + "개");
		
		out.println("<br>");
		for(Element tr : trs){
			//out.println(tr.text() + "<br>");
			out.println(tr.select("td").get(2) + "<br>");	// 양력만 가져왔다
		}
		
		
		
		
		
	%>

</body>
</html>