<!DOCTYPE HTML>
<%@taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<html>
  <tags:head title="Registration">
    <link rel="stylesheet" type="text/css" href="register.css">
  </tags:head>
  <body>
    <tags:navigation/>
    <form method="POST" action="register" class="form-signin">
      <h2 class="form-signin-heading">Register</h2>
      <input type="text" class="form-control" placeholder="Username" name="username" required/>
      <input type="text" class="form-control" placeholder="Email" name="email" required/>
      <input type="password" class="form-control" placeholder="Password" name="password" required/>
      <button type="submit" class="btn btn-lg btn-primary btn-block">Register</button>
    </form>
  </body>
</html>
