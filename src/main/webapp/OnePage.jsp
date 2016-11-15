<%-- 
    Document   : OnePage
    Created on : Sep 6, 2016, 7:37:26 AM
    Author     : colunga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="//code.jquery.com/jquery-latest.js"></script>
    <script src="./js/login.js"  language="JavaScript"></script>
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <form action="login" method="GET">
      <label>Nick:</label><input type="text" name="nick" id ="nick"/><br/><br/>
      <label>Password:</label><input type="password" name="pwd"/><br/><br/>
      
      <input type="submit" />
    </form>
    <input  type="text" name = "Mensaje" id="msg">
    <BR>
    <button onclick="miGet();">Mi Botton </button>
    
    
  </body>
</html>
