<!DOCTYPE HTML>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="util" uri="http://schumact.com/taglibs/util.tld"%>
<jsp:useBean id="date" class="java.util.Date" scope="page" />

<html>
  <tags:head title="Cookies"/>
  <body>
    <tags:navigation/>

    <p>
      List of cookies:
      <table cellpadding="4" border="1">
        <tr><td>Name</td><td>Value</td></tr>
        <c:forEach var="cookie" items="${pageContext.request.getCookies()}">
        <tr><td>${cookie.name}</td><td>${cookie.value}</td></tr>
        </c:forEach>
      </table>
    </p>

    <div class="footer"><tags:portal>Current time is: ${date}</tags:portal></div>
  </body>
</html>
