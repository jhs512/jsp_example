package com.sbs.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbs.example.util.Ut;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		int dan = Integer.parseInt(request.getParameter("dan"));

		response.getWriter().println(Ut.f("<h1>== 구구단 %d단 ==</h1>", dan));

		for (int i = 1; i <= 9; i++) {
			response.getWriter().println(Ut.f("<div>%d * %d = %d</div>", dan, i, dan * i));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
