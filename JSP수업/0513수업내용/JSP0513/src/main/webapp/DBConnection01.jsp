<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
		/*
		// 원래는 프로퍼티 파일로 빼서 가져온다. 1. jdbcURL / 2. url / 3. 유저명 / 4. 비밀번호
		String driverName = "org.mariadb.jdbc.Driver";
		// jdbc:mariadb://서버아이피:포트번호/DB이름
		String url = "jdbc:mariadb://localhost:3306/jspdb";
		String user="jspuser";
		String password="123456";
		*/
		
		Connection conn = null;	// 연결
		Statement stmt = null;	// 명령
		ResultSet rs = null;	// 결과
		try{
			// 1. 드라이버를 로드한다.
			Class.forName(driverName);
			
			// 2. DB에 연결한다.
			conn = DriverManager.getConnection(url, user, password);
			out.println("연결 성공 : " + conn + "<br>");
			
			// 3. 사용
			String sql = "select now() date, 123*4 num, '한사람' name";	// 실행할 명령
			stmt = conn.createStatement();	// 명령 객체 얻기
			// select  명령은 executeQuery()로 실행하고 ResultSet으로 받는다.
			// 그 외의 명령은 executeUpdate()로 실행하고 Int 로 받는다.
			rs = stmt.executeQuery(sql);	// 명령을 실행해서 결과 받기
			
			if(rs.next()){	// 결과가 있다면 
				do{
					// rs.get자료형(필드명 또는 인덱스) : 인덱스 시작값이 1 부터 이다.
					/*
					out.println(rs.getString(1) + "<br>");
					out.println(rs.getInt(2) + "<br>");
					out.println(rs.getString(3) + "<br>");
					*/
					out.println(rs.getString("date") + "<br>");
					out.println(rs.getInt("num") + "<br>");
					out.println(rs.getString("name") + "<br>");
				}while(rs.next());	// 반복
			}else{
				out.println("없다<br/>");
				
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			// 4. 닫기	// (반드시 역순으로 닫는다.)
			if(rs!=null) try{ rs.close();}catch(SQLException e){;}
			if(stmt!=null) try{ stmt.close();}catch(SQLException e){;}
			if(conn!=null) try{ conn.close();}catch(SQLException e){;}
		}
		
		
	%>

</body>
</html>