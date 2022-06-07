<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" fragment="true"%>
<%@ attribute name="subject" fragment="true"%>
<jsp:invoke fragment="title"/> <%-- 태그안의 내용을 이자리에 찍어!!! --%>
<hr>
<%-- 태그안의 내용을 resuest영역에 title2로 저장해 --%>
<jsp:invoke fragment="subject" var="title2" scope="request"/>
<h2>${requestScope.title2 }</h2> <%-- 찍어(EL사용가능) --%>