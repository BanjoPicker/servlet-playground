<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<div class="nav-bar ${empty sessionScope.username ? "not-logged-in" : "logged-in"}"> 
  <img src="${contextpath}/images/logo.png" width="30" height="30" alt="Logo"/>&nbsp;&nbsp;&nbsp;
  <tags:portal title="Home"><a href="${contextpath}/index.jsp">Home</a></tags:portal>
  <tags:portal title="About"><a href="${contextpath}/about.jsp">About</a></tags:portal>
  <tags:portal title="Login"><a href="${contextpath}/login.jsp">Login</a></tags:portal>
  <tags:portal title="Register"><a href="${contextpath}/register.jsp">Register</a></tags:portal>
  <tags:portal title="Login"><a href="${contextpath}/logout">Logout</a></tags:portal>
</div>
<div class="nav-bar-bottom">&nbsp;</div>
