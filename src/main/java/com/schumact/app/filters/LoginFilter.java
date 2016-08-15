package com.schumact.app.filters;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public final class LoginFilter implements Filter {

	private Set<String> allowedUrls;
	
	public LoginFilter() {
		allowedUrls = new HashSet<String>();
	}
	
	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain fc)
	throws IOException, ServletException {
		HttpServletRequest http_req = (HttpServletRequest) request;
		HttpSession session = http_req.getSession(true);
		String contextpath = request.getServletContext().getContextPath();
		if (session.getAttribute("username") != null
			  || http_req.getRequestURI().endsWith(".css")
			  || http_req.getRequestURI().endsWith(".js")
			  || http_req.getRequestURI().startsWith(contextpath + "/css/")
			  || http_req.getRequestURI().startsWith(contextpath + "/images/")
			  || http_req.getRequestURI().startsWith(contextpath + "/js/")
		    || allowedUrls.contains(http_req.getRequestURI())) {
      if (fc == null) {
        System.out.println("filter chain is null...");
      }
			fc.doFilter(request, response);
		} else {
			session.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

	@Override
	public void init(FilterConfig fc) throws ServletException {
		String param = fc.getInitParameter("allowed-urls");
		String contextPath = fc.getServletContext().getContextPath();
		if (param != null) {
			for (String url : param.split(",")) {
				this.allowedUrls.add(contextPath + url.trim());
			}
		}
	}
}
