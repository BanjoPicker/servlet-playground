<!DOCTYPE HTML>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<%-- Insert a date object in the jsp page context --%>
<jsp:useBean id="date" class="java.util.Date" scope="page" />

<html>
<tags:head title="Timothy Schumacher, Ph.D. > About"/>
<body>
  <tags:navigation/>

	<div class="main-body">
  <p>
    This is my site. It's a simple experiment to build j2ee webapps!
  </p>
	</div>

  <div class="footer"><tags:portal>Current time is: ${date}.</tags:portal></div>
</body>
</html>
