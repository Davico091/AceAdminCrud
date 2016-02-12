jQuery(function(e) {
  /*VALIDACION DEL FORMULARIO DE LOGIN*/
  $('#login-form').validate({
    errorLabelContainer: $("#div-error"),
    errorClass: 'has-error',
    focusInvalid: true,
    rules: {
      usuario: {
        required: true
      },
      password : {
        required : true
      }
    },
    messages: {
      usuario: {
        required: "Por favor ingrese el usuario.",
      },
      password :{
        required :"Por favor ingrese el password."
      }
    }
  });
  /*VALIDACION DEL FORMULARIO DE LOGIN*/
  /*VALIDACION DEL FORMULARIO DE REGISTRO DE PERSONAS*/
  $('#persona-form').validate({
    errorClass: 'has-error',
    focusInvalid :true,
    rules:{
      nombre :{
        required :true
      },
      apellidos: {
        required : true
      },
      documento :{
        required : true
      },
      telefono :{
        required :true
      },
      celular : {
        required : true
      },
      direccion:{
        required : true
      },
      nacimiento : {
        required : true
      }
    },
    messages : {
      nombre :{
        required :"El nombre es obligatorio"
      },
      apellidos: {
        required : "El apellido es obligatorio"
      },
      documento :{
        required : "El Nro de documento es obligatorio"
      },
      telefono :{
        required :"El telefono es obligatorio"
      },
      celular : {
        required : "El celular es obligatorio"
      },
      direccion:{
        required : "La direccion es obligatoria"
      },
      nacimiento : {
        required : "La fecha de nacimiento es obligatoria"
      }
    }
  });
  
  $('#nacimiento').datepicker({
    autoclose: true,
    todayHighlight: true
  });
 });
