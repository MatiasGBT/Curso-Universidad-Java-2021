<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<a href="<s:url action="bienvenidoAction"/>">Bienvenido</a>
<br/>
<a href="<s:url action="personasAction"/>">Personas</a>
<!--El action manda a ejecutar el método bienvenidoAction ubicado en LinkAction, el cual ejecuta el resultado (ubicado en
la misma clase) el cual es de tipo tiles, lo que indica a Struts que se tiene que fijar en el archivo tiles.xml.
Una vez hecho, se fija en la definicion del Tile con el mismo nombre (bienvenidoTile).
Pasa lo mismo con personasAction-->