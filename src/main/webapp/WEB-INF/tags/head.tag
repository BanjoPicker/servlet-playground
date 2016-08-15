<%@ attribute name="title" %>
<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Language" content="en">
  <meta name="author" content="Timothy Schumacher, Ph.D.">
  <title>${title}</title>
  <link rel="icon" type="image/x-icon" href="${contextpath}/favicon.ico">
  <link rel="shortcut icon" type="image/x-icon" href="${contextpath}/favicon.ico">
  <link rel="stylesheet" type="text/css" href="${contextpath}/css/main.css">
  <link rel="stylesheet" type="text/css" href="${contextpath}/js/bootstrap-3.2.0/css/bootstrap.min.css">
  <script language="javascript" type="text/javascript" src="${contextpath}/js/jquery-1.11.1.js"></script>
  <script language="javascript" type="text/javascript" src="${contextpath}/js/bootstrap-3.2.0/js/bootstrap.min.js"></script>
  <script language="javascript" type="text/javascript" src="${contextpath}/js/underscore-1.5.1.js"></script>
  <script language="javascript" type="text/javascript" src="${contextpath}/js/backbone-1.1.2.js"></script>
  <script language="javascript" type="text/javascript" src="${contextpath}/js/require-2.1.8.js"></script>
  <script language="javascript" type="text/javascript" src="${contextpath}/js/arbor-0.92/arbor.js"></script>
  <script language="javascript" type="text/javascript" src="${contextpath}/js/arbor-0.92/arbor-tween.js"></script>
  <jsp:doBody/>
</head>
