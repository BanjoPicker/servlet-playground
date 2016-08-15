<!DOCTYPE HTML>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<html>
  <tags:head title="Login">
    <link rel="stylesheet" type="text/css" href="login.css">
    <script language="javascript" type="text/javascript" src="login.js"></script>
  </tags:head>
  <body>
    <tags:navigation/>
    <form method="POST" action="login" class="form-signin">
      <h2 class="form-signin-heading">Log In</h2>
      <input type="text" class="form-control" placeholder="Username" name="username" required/>
      <input type="password" class="form-control" placeholder="Password" name="password" required/>
      <button type="submit" class="btn btn-lg btn-primary btn-block">Log In</button>
    </form>
  </body>
</html>
