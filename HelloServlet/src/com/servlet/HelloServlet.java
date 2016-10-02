package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//继承于HttpServlet
public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("处理Get()请求");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("Hello Servlet!");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("处理Post()请求");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=utf-8");
		out.println("Hello Servlet!");
	}
}
