/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var AgregarMateria= function()
{
    var planEstudios = $('#plan').val();
    var cualquiercosa = $('#nombre').val();
  $.get('MateriasAdd', {
                        planEstudios :planEstudios,
                        nombreMateria:cualquiercosa
                }, function(responseText) {
                    
                      //alert(responseText.nick); 
                      //windows.location = "/menu.html";
                      //windows.href = "http://localhost:8080/escolar/menu.html";
                      $(location).attr('href', 'http://localhost:8080/escolar/materias.jsp');

                });
};   
