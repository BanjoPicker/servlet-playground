package com.schumact.app.users;

import com.schumact.app.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public final class ContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

	/**
	 * <p>Add the user service instance to the application scope.</p>
	 */
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sc = sce.getServletContext();
    UserService us = new InMemoryUserService();
		sc.setAttribute(UserService.APPLICATION_KEY, us);
		sc.setAttribute("us", us); 
	}
}
