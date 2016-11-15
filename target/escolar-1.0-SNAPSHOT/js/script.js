$(document).ready(function(){
  var estudiante = $('.estudiante');
  var docente = $('.docente');
  var admin = $('.admin');
  var radioEstudiante = ('#radioEstudiante');
  var radioAdmin = ('#radioAdmin');
  var radioDocente = ('#radioDocente');
  
  estudiante.hide();
  docente.hide();
  admin.hide();
  
  radioEstudiante.click(function(){
    studentClick();
  });
  radioDocente.click(function(){
    docenteClick();
  });
  radioAdmin.click(function(){
    adminClick();
  });
  
  function studentClick(){
    var radio = ('#radioEstudiante');
    if(radio == true){
      estudiante.show();
    }
    else{
      estudiante.hide();
    }
  }
  
  function docenteClick(){
    var radio = ('#radioEstudiante');
    if(radio == true){
      docente.show();
    }
    else{
      docente.hide();
    }
  }
  
  function adminClick(){
    var radio = ('#radioEstudiante');
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