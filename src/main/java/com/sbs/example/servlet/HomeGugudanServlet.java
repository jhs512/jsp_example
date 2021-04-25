package com.sbs.example.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sbs.example.util.Ut;

@WebServlet("/home/gugudan")
public class HomeGugudanServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");

		int dan = Ut.pi(request.getParameter("dan"), 2);
		int limit = Ut.pi(request.getParameter("limit"), 9);
		
		request.setAttribute("dan", dan);
		request.setAttribute("limit", limit);
		
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/home/gugudan.jsp");
         requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
