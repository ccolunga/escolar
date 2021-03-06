<%@page import="com.mycompany.escolar.vo.Roles"%>
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
              <li><a href="materias.jsp">Materias</a></li>
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
        <h1 class="user">Usuarios</h1>
        <h3 class="userAll">Lista de usuarios</h3>
        <div class="userFields col-md-3 col-md-offset-1">
          <div class="btns">
          <h3 class="h3Btns">Acciones</h3>
            <button class="btn">Crear</button>
            <button class="btn">Modificar</button>
            <button class="btn">Eliminar</button>
          </div>
            <form method="POST" action="">
              <input type="text" id="nombre" placeholder="Nombre"><br/><br/>
              <input type="text" id="apellido" placeholder="Apellido Paterno"><br/><br/>
              <input type="text" id="apellidoMaterno" placeholder="Apellido Materno"><br/><br/>
              <label>Roles</label><br>
              <%
                List<Roles> roles = DBDAO.getRoles("select * from Roles");
                for(Roles r : roles ){
                  out.print("<input type='radio' id='radio"+ r.getNombre() +"' name='table' value ='"+ r.getNombre() + "' />"+r.getNombre()+"<br/>");
                }               
              %>
<!--          <input type="radio" id="radioEstudiante" name="table" /> Estudiante<br/>
              <input type="radio" id="radioDocente" name="table" /> Docente<br/>
              <input type="radio" id="radioAdmin" name="table" /> Administrativo<br/> -->

            </form>
        </div>
        <div class="tables col-md-offset-1 col-md-7">
          <table class="tableUsers">
            <tr>
              <th>Nombre</th>
              <th>Apellido Paterno</th>
              <th>Apellido Materno</th>
            </tr>
            <tr>
              <td>test 1</td>
              <td>test 2</td>
              <td>test 3</td>
            </tr>
            <tr>
              <td>test 1</td>
              <td>test 2</td>
              <td>test 3</td>
            </tr>
            <tr>
              <td>test 1</td>
              <td>test 2</td>
              <td>test 3</td>
            </tr>
            <tr>
              <td>test 1</td>
              <td>test 2</td>
              <td>test 3</td>
            </tr>
            <tr>
              <td>test 1</td>
              <td>test 2</td>
              <td>test 3</td>
            </tr>
            <tr>
              <td>test 1</td>
              <td>test 2</td>
              <td>test 3</td>
            </tr>
          </table>
        </div>
        <div class="fields">
          <div class="estudiante">
            <h3>Estudiante</h3>
            <form id="estudiante" method="POST">
              <input type="text" id="nombre" placeholder="Matricula">
              <input type="text" id="apellido" placeholder="Plan de estudio">
              <input type="text" id="apellidoMaterno" placeholder="Grado">
            </form>
          </div>
          <div class="docente">
            <h3>Docente</h3>
            <form id="docente" method="POST">
              <input type="text" id="noNominaDoc" placeholder="Numero de Nomina">
              <input type="text" id="escolaridad" placeholder="Escolaridad">
            </form>
          </div>
          <div class="admin">
            <h3>Administrativos</h3>
            <form id="Administrativo" method="POST">
              <input type="text" id="noNominaAdm" placeholder="Numero de Nomina">
              <input type="text" id="departamento" placeholder="departamento">
            </form>
          </div>
        </div>
      </div>
    </div>
    <div>

    </div>
    <!-- /#wrapper -->
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <script src="script.js"></script>
    <script>
      $(document).ready(function(){
  var estudiante = $('.estudiante');
  var docente = $('.docente');
  var admin = $('.admin');
  var radioEstudiante = ('#radioestudiante');
  var radioAdmin = ('#radioadministrativo');
  var radioDocente = ('#radiodocente');

  estudiante.hide();
  docente.hide();
  admin.hide();

  //if($("#radioestudiante").click || $("#radiodocente").click || $("#radioadministrativo").)
    $('#radioestudiante').click(function(){
    estudiante.show();
    docente.hide();
    admin.hide();
  });
  $('#radiodocente').click(function(){
    docente.show();
    estudiante.hide();
    admin.hide();
  });
  $('#radioadministrativo').click(function(){
    admin.show();
    docente.hide();
    estudiante.hide();

  });

  function studentClick(){
    var radio = ('#radioestudiante');
    if(radio == true){
      estudiante.show();
    }
    else{
      estudiante.hide();
    }
  }

  function docenteClick(){
    var radio = ('#radiodocente');
    if(radio == true){
      docente.show();
    }
    else{
      docente.hide();
    }
  }

  function adminClick(){
    var radio = ('#radioadministrativo');
    if(radio == true){
      admin.show();
    }
    else{
      admin.hide();
    }
  }

});

$(document).ready(function () {
  var trigger = $('.hamburger'),
      overlay = $('.overlay'),
     isClosed = false;

    trigger.click(function () {
      hamburger_cross();
    });

    function hamburger_cross() {

      if (isClosed == true) {
        overlay.hide();
        trigger.removeClass('is-open');
        trigger.addClass('is-closed');
        isClosed = false;
      } else {
        overlay.show();
        trigger.removeClass('is-closed');
        trigger.addClass('is-open');
        isClosed = true;
      }
  }

  $('[data-toggle="offcanvas"]').click(function () {
        $('#wrapper').toggleClass('toggled');
  });
});

    </script>
  </body>
</html>
