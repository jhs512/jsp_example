package com.sbs.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbs.example.util.Ut;

@WebServlet("/article/doWrite")
public class ArticleDoWriteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		int boardId = Ut.pi(request.getParameter("boardId"), 0);
		String title = request.getParameter("title");
		String body = request.getParameter("body");

		/*
		 * INSERT INTO article SET regDate = NOW(), updateDate = NOW(), boardId =
		 * #{boardId}, title = #{title}, `body`= #{body}
		 */

		response.getWriter().println("입력된 boardId : " + boardId + "<br>");
		response.getWriter().println("입력된 title : " + title + "<br>");
		response.getWriter().println("입력된 body : " + body + "<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
