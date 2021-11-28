function validarForma(forma) { //El objeto forma es el form que envíamos con el return this en la línea 11 del HTML
    var usuario=forma.usuario;
    if(usuario.value=="" || usuario.value=="Escribir usuario") {
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    
    var password=forma.password;
    if(password.value()=="" || password.value.length<3) {
        alert("Debe proporcionar una contraseña de al menos 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    var tecnologias=forma.tecnologia; //Tenemos 3 elementos de tipo checkbox en el HTML, por lo que es posible que nos regrese un array.
    var checkSeleccionado=false;
    for(var i=0; i<tecnologias.length; i++) {
        if(tecnologias[i].checked) {
            checkSeleccionado=true;
        }
    }
    if(!checkSeleccionado) {
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    var genero=forma.genero;
    var radioSeleccionado=false;
    for(var i=0; i<genero.length; i++) {
        if(genero[i].checked) {
            radioSeleccionado=true;
        }
    }
    if(!radioSeleccionado) {
        alert("Debe seleccionar un genero");
        return false;
    }
    
    var ocupacion=forma.ocupacion;
    if(ocupacion.value=="") {
        alert("Debe seleccionar una ocupación");
        return false;
    }
    
    alert("Formulario valido, enviando datos al servidor");
    return true;
}