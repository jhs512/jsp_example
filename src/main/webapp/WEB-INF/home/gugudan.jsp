<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../part/head.jspf"%>

<%
int dan = (int) request.getAttribute("dan");
int limit = (int) request.getAttribute("limit");
%>

<h2>
	== 구구단
	<%=dan%>단 ==
</h2>

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

<%@ include file="../part/foot.jspf"%>