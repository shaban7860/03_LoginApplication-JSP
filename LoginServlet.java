package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		String userId, password;
//		userId = request.getParameter("userid");
//		password = request.getParameter("userpass");
//		
//		if(userId.equals("admin") && password.equals("mindgate321")) {
//			response.sendRedirect("home.html");
//		}else {
//			response.sendRedirect("invalid.html");
//		}
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userId, password;
		userId = request.getParameter("userid");
		password = request.getParameter("userpass");
		
		if(userId.equals("admin") && password.equals("mindgate321")) {
//			response.sendRedirect("home.html");
		}else {
//			response.sendRedirect("invalid.html");
		}
	}

}
