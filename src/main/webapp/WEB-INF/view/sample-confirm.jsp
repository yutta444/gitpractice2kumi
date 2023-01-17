<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Account" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>下記の内容で登録します。よろしいですか？</p>
	<%
		Account account = (Account)session.getAttribute("input_data");
	%>
	メール：<%=account.getMail() %><br>
	PW：********<br>
	名前：<%=account.getName() %><br>
	学年：<%=account.getGrade() %><br>
	学科：<%=account.getDivision() %><br>
	
	<a href="RegisterExecuteServlet">OK</a><br>
	<a href="RegisterFormServlet">戻る</a>
</body>
</html>