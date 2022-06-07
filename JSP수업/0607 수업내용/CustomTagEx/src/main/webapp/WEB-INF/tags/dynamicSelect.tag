<%@tag import="java.util.Map"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="name" required="true" %>
<%@ tag dynamic-attributes="optionMap" body-content="empty" %>
<select	name="${name }">
<%
	Map<String,String> optionMap = (Map<String,String>)jspContext.getAttribute("optionMap");
	for(String key : optionMap.keySet()){
		out.println("<option value='"+key+"'>" + optionMap.get(key) + "</option>");
	}
%>
</select>

