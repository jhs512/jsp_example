<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sbs.example.util.Ut"%>

<%@ include file="../part/head.jspf"%>

<%
int dan = Ut.pi(request.getParameter("dan"), 5);
int limit = Ut.pi(request.getParameter("limit"), 2);
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