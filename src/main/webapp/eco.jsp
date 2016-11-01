<%-- 
    Document   : eco.jsp
    Created on : Sep 6, 2016, 7:46:32 AM
    Author     : colunga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <label>Nick:</label><% out.print(request.getParameter("nick")); %><br /><br />
    <label>Password:</label><% out.print(request.getParameter("pwd")); %><br /><br />
  </body>
</html>