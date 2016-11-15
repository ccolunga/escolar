<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
  <head>
    <title>Tabla Multiplicar</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <div>Tabla de multiplicar</div>
     <table class="tableUsers" border="2">
            <tr>
              <th>N</th>
              <th>X</th>
              <th>M</th>
              <th>=</th>
            </tr>

<% 
  int temp = 0;
  int n = Integer.parseInt(request.getParameter("n"));
  int m = Integer.parseInt(request.getParameter("m"));
  for(int x = 1; x < m; x++){
    temp = x * m;
    out.print("<tr>");
    out.print("<th>"+n+"</th>");
    out.print("<th>X</th>");
    out.print("<th>"+x+"</th>");
    out.print("<th>"+temp+"</th>");
    out.print("</tr>");
  }


%>


          </table>
  </body>
</html>
