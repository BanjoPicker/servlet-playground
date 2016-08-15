package com.schumact.app.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schumact.app.UserService;

public class Register extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		ServletContext sc = this.getServletContext();
		UserService us = (UserService) sc.getAttribute(UserService.APPLICATION_KEY);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		us.AddUser(username, password);
		
		try {
			response.sendRedirect(response.encodeRedirectURL(sc.getContextPath() + "/login.jsp"));
			//sc.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		catch(IOException ioe) { }
	}
	
	public static final long serialVersionUID = 1822968520592227808L;
}
