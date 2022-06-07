<%@ tag language="java" pageEncoding="UTF-8"%>
<%-- header태그에는 속성이 title이라는 놈이 반드시 있어야 한다. --%>
<%@ attribute name="title" required="true" %>
<%@ attribute name="size" type="java.lang.Integer" %>
<%
	if(size==null) size = 1;
	String output = "<h"+ size + ">" + title + "</h"+size+">" ;
	out.println(output);
%>
