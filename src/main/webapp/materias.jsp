<%@page import="com.mycompany.escolar.vo.PlanEstudios"%>
<%@page import="com.mycompany.escolar.vo.Materias"%>
<%@page import="java.util.List"%>
<%@page import="com.mycompany.escolar.dao.DBDAO"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Escolar</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
  </head>
  <body>
    <div id="wrapper">
      <div class="overlay"></div>
      <!-- Sidebar -->
      <nav class="navbar navbar-inverse navbar-fixed-top" id="sidebar-wrapper" role="navigation">
        <ul class="nav sidebar-nav">
          <li class="sidebar-brand">
            <a href="#">
            Bienvenido
            </a>
          </li>
          <li>
            <a href="onepage.html">Home</a>
          </li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Usuarios <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="#">Todos</a></li>
              <li><a href="#">Estudiantes</a></li>
              <li><a href="#">Docentes</a></li>
              <li><a href="#">Administrativos</a></li>
            </ul>
          </li>
          <li>
            <a href="cuentas.html">Cuentas</a>
          </li>
          <li>
            <a href="role.html">Roles</a>
          </li>
          <li class="dropdown">
            <a href="carrera.html" class="dropdown-toggle" data-toggle="dropdown">Carreras <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="planEstudio.html">Plan de estudios</a></li>
              <li><a href="materias.html">Materias</a></li>
            </ul>
          </li>
          <li class="dropdown">
            <a href="grupos.html" class="dropdown-toggle" data-toggle="dropdown">Grupos <span class="caret"></span></a>
            <ul class="dropdown-menu" role="menu">
              <li><a href="listas.html">Listas</a></li>
              <li><a href="asistencia.html">Asistencias</a></li>
              <li><a href="calificaciones.html">Calificaciones</a></li>
              <li><a href="kardex.html">Kardex</a></li>
            </ul>
          </li>
        </ul>
      </nav>
      <!-- /#sidebar-wrapper -->
      <!-- Page Content -->
      <div id="page-content-wrapper">
        <button type="button" class="hamburger is-closed" data-toggle="offcanvas">
        <span class="hamb-top"></span>
        <span class="hamb-middle"></span>
        <span class="hamb-bottom"></span>
        </button>
      </div>
      <!-- /#page-content-wrapper -->
    </div>
    <div class="container">
      <div class="row">
        <h1 class="user">Materias</h1>
        <h3 class="userAll">Materias</h3>
        <div class="userFields col-md-3 col-md-offset-1">
          <div class="btns">
          <h3 class="h3Btns">Acciones</h3>
          <button id="crear" class="btn" onclick="AgregarMateria();">Crear</button>
            <button id="modificar" class="btn">Modificar</button>
            <button id="eliminar" class="btn">Eliminar</button>
          </div>
            <form method="POST" action="">
              <input type="text" name="nombre"id="nombre" placeholder="Nombre"><br/><br/>
              <input type="text" name="name" id="plan" placeholder="Plan de Estudio">
            </form>
        </div>
        <div class="tables col-md-offset-1 col-md-7">
          <table  class="tableUsers">
            <tr>
              <th>Nombre</th>
              <th>Plan de estudio</th>
            </tr>
             <% 
               List<Materias> materias = DBDAO.getMaterias("select * from Materias");
               System.out.println("MATERIA PARA ENCONTRADA");
               for(Materias m : materias  ){
                 System.out.println("MATERIA ENCONTRADA");
                 int id = m.getIdPlanEstudio();
                 PlanEstudios planEstudio = DBDAO.getPlanEstudios(id);
                 out.print("<tr>");
                 out.print("<td>"+m.getNombre()+"</td>");
                 out.print("<td>"+planEstudio.getNombre() +"</td>");
                 out.print("</tr>");
               }
            %>
          </table>
        </div>
      </div>
    </div>
    <!-- /#wrapper -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
     <script src="./js/materias.js"  language="JavaScript"></script>
    <script src="script.js"></script>
  </body>
</html>

