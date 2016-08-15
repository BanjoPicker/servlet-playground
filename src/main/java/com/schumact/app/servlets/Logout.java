package com.schumact.app.servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.schumact.app.UserService;

public class Logout extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("K, Bye!");
		request.getSession(true).invalidate();
 	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}
}
