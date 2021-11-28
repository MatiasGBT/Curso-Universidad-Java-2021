
<%--
    Agregamos una declaración de JSP
    Podemos declarar un atributo o un método los cuales formaran parte de la clase
    del Servlet que se va a  asociar a este JSP una ves que se compile.
--%>

<%!
    //Declaramos una variable con su metodo get
    private String usuario="Alberto";
    public String getUsuario() {
        return this.usuario;
    }
    
    //Declaramos un contador de visitas
    private int contadorVisitas=1;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones con JSP</title>
    </head>
    <body>
        <h1>Uso de declaraciones con JSP</h1>
        Valor usuario por medio del atributo: <%= this.usuario %>
        <br>
        Valor usuario por medio del método: <%= getUsuario() %>
        <br>
        Contador visitas: <%= this.contadorVisitas++ %>
    </body>
</html>
