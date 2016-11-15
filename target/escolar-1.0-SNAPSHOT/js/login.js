/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var getdetails = function() {
        
        /*alert( $.get("MiLogin", {
            
            "nick":'ff' ,
            "pwd":'ff'
            
        }).data);
   
  $.get("MiLogin", function( data ) {
  $( ".result" ).html( data );
  alert( "Load was performed." );
});
    
    */
   $.get( "MiLogin", function(data) {
     alert( "success:"+data );
    }).done(function() {
    alert( "second success" );
     })
  .fail(function() {
    alert( "error" );
  })
  .always(function() {
    alert( "finished" );
  });
        
};

var miGet= function()
{
    var nombre = $('#userName').val();
    var pass = $('#userPassword').val();
  $.get('MiLogin', {
                        userName :nombre,
                        userPassword:pass
                }, function(responseText) {
                    if(responseText.nick != undefined){
                      //alert(responseText.nick); 
                      //windows.location = "/menu.html";
                      //windows.href = "http://localhost:8080/escolar/menu.html";
                      $(location).attr('href', 'http://localhost:8080/escolar/menu.html');
                    }
                    else{
                      $('#mensaje').show();
                      $('#mensaje').val(responseText.nick); 
                    }
                });
};   

var ocultar = function()
{
   $('#mensaje').hide();
}

$(document).ready(function() {
     $('#mensaje').hide();
});


