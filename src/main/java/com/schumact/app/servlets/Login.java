package com.schumact.app.servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schumact.app.App;
import com.schumact.app.UserService;

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		ServletContext sc = this.getServletContext();
		UserService us = (UserService) sc.getAttribute(UserService.APPLICATION_KEY);
		String username = request.getParameter(PARAM_USERNAME);
		String password = request.getParameter(PARAM_PASSWORD);
		String email = request.getParameter(PARAM_EMAIL);
	
		if (us.Authenticate(username, password)) {
			request.getSession(true).setAttribute(PARAM_USERNAME, username);
			System.out.println("Dude, you authenticated as " + username + "!");
			App.User.Builder builder = App.User.newBuilder();
			App.User user = builder.setEmail(email)
					               .setPassword(password)
					               .setUsername(username)
					               .build();
			request.getSession(true).setAttribute(PARAM_USER, user);
			System.out.println(user.toString());
			
			try {
				// our job is done here, so let's send back a redirect to index.jsp
				response.sendRedirect(response.encodeRedirectURL(sc.getContextPath() + "/index.jsp"));
				//sc.getRequestDispatcher("/index.jsp").forward(request, response);
			} catch(Throwable t) {}
		} else {
			try {
				response.sendRedirect(response.encodeRedirectURL(sc.getContextPath() + "/login.jsp"));
			} catch (Throwable t) {}
		}
 	}
	
	private static final String PARAM_EMAIL = "email";
	private static final String PARAM_PASSWORD = "password";
	private static final String PARAM_USER = "user";
	private static final String PARAM_USERNAME = "username";
}
