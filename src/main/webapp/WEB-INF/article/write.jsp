<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sbs.example.util.Ut"%>

<%@ include file="../part/head.jspf"%>

<h2>게시물 등록</h2>

<form action="../article/doWrite" method="POST">
	<div>
		<span> 게시판 선택 </span>
		<select name="boardId">
			<option value="1">공지사항</option>
			<option value="2">자유게시판</option>
			<option value="3">QNA</option>
		</select>
	</div>
	<div>
		<span>제목</span>
		<input type="text" autofocus="autofocus" name="title"
			placeholder="제목을 입력해주세요." maxlength="100" />
	</div>
	<div>
		<span>내용</span>
		<textarea name="body" placeholder="내용을 입력해주세요." maxlength="100"></textarea>
	</div>
	<div>
		<span>발송</span>
		<input type="submit" value="글쓰기" />
		<!--
		<button type="submit">글쓰기</button>
		-->
	</div>
</form>

<%@ include file="../part/foot.jspf"%>