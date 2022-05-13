<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="kr.human.jdbc.JDBCUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			conn = JDBCUtil.getDBCP();
			conn.setAutoCommit(false);
			// -----------------------------------------------------
			// 이 부분만 변경된다. 명령할 부분
			out.println("DBCP로 연결 성공 : " + conn + "<br>");			

			
			// -----------------------------------------------------
		conn.commit();		
		}catch(Exception e){
			JDBCUtil.rollback(conn);
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs);
			JDBCUtil.close(pstmt);
			JDBCUtil.close(stmt);
			JDBCUtil.close(conn);
		}
	

	%>
</body>
</html>