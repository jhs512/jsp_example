<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 예제</title>
</head>
<body>
	<%
	int dan = 8;
	int limit = 9;
	%>

	<h1>
		== 구구단
		<%=dan%>단 ==
	</h1>

	<%
	for (int i = 1; i <= limit; i++) {
	%>
	<div><%=dan%>
		*
		<%=i%>
		=
		<%=dan * i%></div>
	<%
	}
	%>
</body>
</html>