<%@page import="kr.human.category.service.CategoryService"%>
<%@page import="kr.human.category.vo.CategoryVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	List<CategoryVO> list = CategoryService.getInstance().selectList();
	request.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>카테고리 연습</title>
<link href="${pageContext.request.servletContext.contextPath }/webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.servletContext.contextPath }/webjars/jquery/3.6.0/jquery.min.js" ></script>
<script type="text/javascript" src="${pageContext.request.servletContext.contextPath }/webjars/bootstrap/5.1.3/js/bootstrap.min.js" ></script>
<script type="text/javascript">
	$(function () {

		
	});
	
	function itemCheck() {
		var value = $("#item").val();
		if(value == null || value.trim().length==0){
			alert('항목을 입력하시오');
			$("#item").val("");
			$("#item").focus();
			return false;
		}
	}
	
	function itemCheck2(idx) {
		var value = $("#item"+idx).val();
		if(value == null || value.trim().length==0){
			alert('항목을 입력하시오');
			$("#item"+idx).val("");
			$("#item"+idx).focus();
			return false;
		}
	}
	
		
	// 자바스크립트로 POST방식으로 전송하기
	// 첫번째 인수 : 이동할 페이지 주소
	// 두번째 인수 : 보낼 값(json타입)
	// sendPost('update.jsp', {"idx" : 45, "item" : "바뀐놈"})
	 function sendPost(url, params) {
		    var form = document.createElement('form');	// 폼을 만든다.
		    form.setAttribute('method', 'post');	// 전송방식을 POST로 지정
		    form.setAttribute('action', url);		// 이동할 페이지 주소 지정

		    // json방식으로 전달된 값을 hidden 필드로 만들어 폼에 추가
		    for (var key in params) {
		      var hiddenField = document.createElement('input');	// input태그 만들기
		      hiddenField.setAttribute('type', 'hidden');			// 타입을 hidden으로 변경
		      hiddenField.setAttribute('name', key);				// 네임속성을 key로 
		      hiddenField.setAttribute('value', params[key]);		// value속성을 값으로
		      form.appendChild(hiddenField);	// 폼에 추가
		    }

		    document.body.appendChild(form); // 폼을 body에 추가
		    form.submit();	// 전송
		  }	
	
	
	
   	// 수정하기	
	 function updateItem(idx){
			var value = $("#item"+idx).val();
			alert(idx + "\n" + value);
			if(value != null && value.trim().length >0){
				sendPost('update.jsp', {"idx" : idx, "item" : value});
			}
			
		}
	
	 function deleteItem(idx){
			if(idx > 0){
				sendPost('delete.jsp', {"idx" : idx});
			}
			
		}
   	
   	
</script>

</head>
<body>
	<form action="insert.jsp" method="post" onsubmit="return itemCheck()">
		대항목 : <input type="text" name="item" id="item"/>
		<input type="submit" value="등록"  />
	</form>
	<hr />
	<c:if test="${empty list }">
		<h2>등록된 항목이 없습니다.</h2>
	</c:if>
	<hr />
	<c:if test="${not empty list }">
		<c:forEach var="vo" items="${list }">
			<div style="font-size: 13pt; margin-left: ${vo.lev * 30}px;">
					<form action="reply.jsp" method="post" onsubmit="return itemCheck2(${vo.idx})">
					<c:if test="${vo.lev > 0 }">
					▶ 
					</c:if>
					<span id="oldItem${vo.idx }" >${vo.item }</span>
						<%-- 원본 글의 ref, seq, lev를 가지고 넘어가야한다.  --%>
						<input type="hidden" name="ref" value="${vo.ref }" />
						<input type="hidden" name="seq" value="${vo.seq }" />
						<input type="hidden" name="lev" value="${vo.lev }" />
						<input type="text" name="item" id="item${vo.idx }"/>
						<input type="submit" value="추가"  />
						<input type="button" value="수정" onclick="updateItem(${vo.idx})"  />
						<input type="button" value="삭제" onclick="deleteItem(${vo.idx})"/>
					</form>
					
			</div>
		</c:forEach>
	</c:if>
	

</body>
</html>