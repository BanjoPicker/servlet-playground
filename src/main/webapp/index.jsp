<!DOCTYPE HTML>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<%-- Insert a date object in the jsp page context --%>
<jsp:useBean id="date" class="java.util.Date" scope="page" />

<html>
  <tags:head title="Timothy Schumacher, Ph.D.">
    <%-- tags:head provides common css and js files, and allows overrides to be included also. --%>
    <script language="javascript" type="text/javascript" src="${contextpath}/index.js"></script>
    <link rel="stylesheet" type="text/css" href="${contextpath}/index.css">
  </tags:head>

  <body>
    <tags:navigation/>

	  <div class="main-body">
      Welcome, ${empty sessionScope.username ? "guest" : sessionScope.username}
		  <ul>
			  <li>My <a href="http://www.github.com/BanjoPicker">github</a> account.</li>
			  <li>My <a href="https://bitbucket.com/schumact">bitbucket</a> account.</li>
		  </ul>
	  </div>

    <div class="footer"><tags:portal>Current time is: ${date}.</tags:portal></div>
  </body>
</html>
